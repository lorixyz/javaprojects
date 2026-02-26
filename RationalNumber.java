/** @author lorixyz
 *  Description: This class represents a rational number defined by a numerator and 
 *  a denominator. 
 * 
 *  1. Fields
 *  2. Constructor
 *  3. Getters and Setters
 *  4. toDouble method
 *  5. toString method 
 *  6. toSimplestForm method (with private helper gcd method)  
 *  7. compareTo method
 *  8. add, subtract, multiply, divide methods 
 *  9. reciprocal method 
 *  10. isValid static method 
 * */

    public class RationalNumber {
        //Fields
        private int numerator;
        private int denominator;

        //Constructor
        public RationalNumber(int numerator, int denominator) {
            if (denominator == 0) {
                return; // Represents an invalid rational number with zero denominator
            } if (denominator < 0) {
                numerator = -numerator;
                denominator = -denominator;
            }

            this.numerator = numerator;
            this.denominator = denominator;
        }
        

        //Setters and Getters
        public int getNumerator() {
            return numerator;
        }
        public int getDenominator() {
            return denominator;
        }

        public void setNumerator(int numerator) {
            this.numerator = numerator; 
        }
        public void setDenominator(int denominator) {
            this.denominator = denominator;
        }

        //== METHODS == 

        //toDouble method
        public double toDouble() {
            return (double) this.numerator / this.denominator;
        }

        //toString method
        @Override
        public String toString() {
            if (this.denominator == 1) {
                return this.numerator + ""; 
            } else {
            return this.numerator + "/" + this.denominator; 
            }
        }

        //toSimplestForm method
            //private helper method gcd(a, b) using the Euclidean algorithm
            private int gcd(int a, int b) {
                a = Math.abs(a);
                b = Math.abs(b);
                while (b != 0) {
                    int temp = b;
                    b = a % b;
                    a = temp;
                }
                return a; 
            }

        public RationalNumber toSimplestForm() {
            int commonDivisor = gcd(this.numerator, this.denominator); 
                int simplifiedNumerator = this.numerator / commonDivisor;
                int simplifiedDenominator = this.denominator / commonDivisor;
                return new RationalNumber(simplifiedNumerator, simplifiedDenominator);
            
        }

        //compareTo method
        public int compareTo(RationalNumber other) {
            //cross multiply to compare
            int value1 = this.numerator * other.denominator;
            int value2 = other.numerator * this.denominator;

            if (value1 < value2) {
                return -1; 
            } else if (value1 > value2) {
                return 1;
            } else {
                return 0;
            }
        }

        //add method
        public RationalNumber add(RationalNumber other) {
            int newNumerator = this.numerator * other.denominator + other.numerator * this.denominator;
            int newDenominator = this.denominator * other.denominator;
            RationalNumber result = new RationalNumber(newNumerator, newDenominator);
            return result.toSimplestForm();
        }

        //subtract method
        public RationalNumber subtract(RationalNumber other) {
            int newNumerator = this.numerator * other.denominator - other.numerator * this.denominator;
            int newDenominator = this.denominator * other.denominator;
            RationalNumber result = new RationalNumber(newNumerator, newDenominator);
            return result.toSimplestForm();
        }

        //multiply method
        public RationalNumber multiply(RationalNumber other) {
            int newNumerator = this.numerator * other.numerator;
            int newDenominator = this.denominator * other.denominator;
            RationalNumber result = new RationalNumber(newNumerator, newDenominator);
            return result.toSimplestForm();
        }

        //reciprocal method
        public RationalNumber reciprocal() {
            if (this.numerator == 0) {
                throw new ArithmeticException("Zero has no reciprocal.");
            }
            return new RationalNumber(this.denominator, this.numerator);
        }

        //divide method
        public RationalNumber divide(RationalNumber other) {
            if (other.numerator == 0) {
                throw new ArithmeticException("Cannot divide by zero.");
            }
            return this.multiply(other.reciprocal());
        }

        //isValid method
        public static boolean isValid(RationalNumber r) {

            return r != null && r.denominator != 0;
        }
    }
    
