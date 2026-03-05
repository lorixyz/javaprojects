/** @author lorixyz
 * The task is to write a method that returns a list of all numbers that 
 * appear more than once in an array. The method will receive an array of integers as input.
 * - It should return an array (or list) that contains each number that occurs more than once.
 * - If no number repeats, return an empty list. 
 * - Each duplicate should only appear once in the result.
 * - Order of output does not matter.
 */

import java.util.*;


public class exercise1 {

    public static List<Integer> findDuplicates(int[] numbers) {
        Set<Integer> seenSet = new HashSet<>();
        Set<Integer> theDuplicates = new HashSet<>();

        for (int i = 0 ; i < numbers.length; i++) {
            if (!seenSet.contains(numbers[i])) {
                seenSet.add(numbers[i]);
            } else {
                theDuplicates.add(numbers[i]);
            }
        }

        List<Integer> finalDuplicates = new ArrayList<>(theDuplicates);

        return finalDuplicates;
    }

    public static void main(String[] args) {

        // Do not change the code in the main method

        System.out.println("[1, 2, 2, 3, 4, 4] → " + 
            findDuplicates(new int[]{1, 2, 2, 3, 4, 4}));
            
        System.out.println("[5, 5, 5, 5] → " + 
            findDuplicates(new int[]{5, 5, 5, 5}));
            
        System.out.println("[1, 2, 3] → " + 
            findDuplicates(new int[]{1, 2, 3}));
            
        System.out.println("[7, 8, 9, 7, 8] → " + 
            findDuplicates(new int[]{7, 8, 9, 7, 8}));
            
        System.out.println("[] → " + 
            findDuplicates(new int[]{}));

    }
}
