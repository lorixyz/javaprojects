/** @author lorixyz
 * Write a method that returns the number that appears most frequently in the array.
 * You will receive an array of integers as input.
 * If multiple numbers are tied for most frequent, return any one of them.
 * If the array is empty, return null.
 */

import java.util.*;

public class exercise2 {

    public static Integer mostCommon(int[] items) {
        if (items.length == 0) return null;

        Map<Integer, Integer> MostCommon = new HashMap<>();
        int maxCount = 0;
        Integer common = null;

        for (int i = 0; i < items.length; i++) {
            int newCount = MostCommon.getOrDefault(items[i], 0) + 1;

            MostCommon.put(items[i], newCount);

            if (newCount > maxCount) {
                maxCount = newCount;
                common = items[i];
            }
        }

        return common;
    }


    public static void main(String[] args) {

        System.out.println("[1, 2, 2, 3, 3] → " + 
            mostCommon(new int[]{1, 2, 2, 3, 3}));
            
        System.out.println("[5] → " + 
            mostCommon(new int[]{5}));
            
        System.out.println("[] → " + 
            mostCommon(new int[]{}));
        
        System.out.println("[1, 1, 1, 2, 3, 4] → " + 
            mostCommon(new int[]{1, 1, 1, 2, 3, 4}));
    }
}
