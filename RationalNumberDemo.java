/**
 * RationalNumberDemo.java
 *
 * @author Andrea N. Veloro
 * Demonstrates the RationalNumber class by exercising every feature:
 * 1. Object creation and Constructor validation
 * 2. Getters and Setters (Encapsulation)
 * 3. Type conversion (toDouble)
 * 4. Mathematical simplification (toSimplestForm)
 * 5. Comparison logic (compareTo)
 * 6. Arithmetic operations and Exception handling
 * 7. Static method call (isValid)
 */
public class RationalNumberDemo {

    public static void main(String[] args) {

        // =============================================================
        // 1. CREATING OBJECTS & CONSTRUCTOR VALIDATION
        // =============================================================

        System.out.println("=== 1. Creating Rational Numbers ===");

        RationalNumber r1 = new RationalNumber(1, 2);
        RationalNumber r2 = new RationalNumber(-3, 4);
        RationalNumber r3 = new RationalNumber(2, -5);
        RationalNumber r5 = new RationalNumber(-4, -8);

        System.out.println("r1: " + r1);
        System.out.println("r2: " + r2);
        System.out.println("r3: " + r3);
        System.out.println("r5: " + r5);

            // Attempt invalid construction - equivalent to Bicycle speed validation
                try {
                    System.out.print("Attempting to create r4 (5/0): ");
                    RationalNumber r4 = new RationalNumber(5, 0);
                } catch (IllegalArgumentException e) {
                    System.out.println("FAILED as expected: " + e.getMessage());
                }

        // =============================================================
        // 2. ENCAPSULATION (GETTERS & SETTERS)
        // ============================================================= 
            // Direct field access like r1.numerator is blocked because fields are private.
        System.out.println("\n\n=== 2. Getters & Encapsulation ===");
        System.out.println("r1 numerator   : " + r1.getNumerator());
        System.out.println("r1 denominator : " + r1.getDenominator());
        
        System.out.println("Updating r1 using setters...");
        r1.setNumerator(3);
        r1.setDenominator(6);
        System.out.println("r1 after update: " + r1);

        // =============================================================
        // 3. TO DOUBLE
        // =============================================================
        System.out.println("\n=== 3. toDouble() ===");
        System.out.println("r1 as double: " + r1.toDouble());
        System.out.println("r2 as double: " + r2.toDouble());
        System.out.println("r3 as double: " + r3.toDouble());

        // =============================================================
        // 4. TO SIMPLEST FORM
        // =============================================================
        System.out.println("\n=== 4. toSimplestForm() ===");
        // Since r1 was updated to 3/6, let's simplify it
        System.out.println("r1 (3/6) simplified: " + r1.toSimplestForm());
        System.out.println("r5 (-4/-8) simplified: " + r5.toSimplestForm());

        // =============================================================
        // 5. COMPARE TO
        // =============================================================
        System.out.println("\n=== 5. compareTo() ===");
        RationalNumber r6 = new RationalNumber(1, 2);
        
        // Resetting r1 to 1/2 for comparison
        r1 = new RationalNumber(1, 2); 
        System.out.println("Comparing r1 (1/2) vs r2 (-3/4): " + r1.compareTo(r2));
        System.out.println("Comparing r1 (1/2) vs r6 (1/2) : " + r1.compareTo(r6));
        System.out.println("Comparing r2 (-3/4) vs r1 (1/2): " + r2.compareTo(r1));

        // =============================================================
        // 6. ARITHMETIC OPERATIONS
        // =============================================================
        System.out.println("\n=== 6. Arithmetic Operations ===");
        System.out.println("r1 + r2 = " + r1.add(r2));
        System.out.println("r1 - r2 = " + r1.subtract(r2));
        System.out.println("r1 * r2 = " + r1.multiply(r2));
        System.out.println("r1 / r2 = " + r1.divide(r2));

            // Division by zero rational edge case
            RationalNumber zeroNumerator = new RationalNumber(0, 5);
            try {
                System.out.print("r1 / (0/5): ");
                System.out.println(r1.divide(zeroNumerator));
            } catch (ArithmeticException e) {
                System.out.println("ERROR: " + e.getMessage());
            }

        // =============================================================
        // 7. RECIPROCAL
        // =============================================================
        System.out.println("\n=== 7. Reciprocal ===");
        System.out.println("Reciprocal of r1: " + r1.reciprocal());
        
        try {
            System.out.print("Reciprocal of zeroNumerator (0/5): ");
            System.out.println(zeroNumerator.reciprocal());
        } catch (ArithmeticException e) {
            System.out.println("ERROR: " + e.getMessage());
        }

        // =============================================================
        // 8. STATIC METHOD CALL (isValid)
        // =============================================================
        System.out.println("\n=== 8. isValid() ===");
        System.out.println("Is r1 valid? " + RationalNumber.isValid(r1));
        System.out.println("Is zeroNumerator valid? " + RationalNumber.isValid(zeroNumerator));
        System.out.println("Is r4 valid? " + RationalNumber.isValid(new RationalNumber(5, 0)));

        System.out.println("\nDemo complete.");
    }
}

    
    
