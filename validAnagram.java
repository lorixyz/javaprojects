/** Problem: Check If Two Strings Are Anagrams
    Your task is to write a method that checks whether two strings are anagrams of each other.
    Two strings are anagrams if:
        They have the same characters with the same frequencies
        Order does not matter
        Case sensitivity does matter
        Whitespace and punctuation should be considered as part of the strings
 */

import java.util.HashMap;

public class validAnagram {

    public static boolean isAnagram(String string1, String string2) {
        
        //edge case
        if (string1.length() != string2.length()) {
            return false;
        }
        
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        
        for (int i = 0; i < string1.length(); i++) {
            char c = string1.charAt(i);
            Integer count = map1.get(c);
            
            if (count == null) {
                count = 1; 
            } else {
                count = count + 1;
            }
            
            map1.put(c, count);
        }
        
        for (int i=0; i < string2.length(); i++) {
            char c = string2.charAt(i);
            Integer count = map2.get(c);
            
            if (count == null) {
                count = 1; 
            } else {
                count = count + 1;
            }
            
            map2.put(c, count);
        }
        
        return map1.equals(map2);
        
    }




    public static void main(String[] args) {

        // Do not change the code in the main method

        System.out.println("\"listen\", \"silent\" → " + 
            isAnagram("listen", "silent"));  // true

        System.out.println("\"hello\", \"world\" → " + 
            isAnagram("hello", "world"));    // false

        System.out.println("\"anagram\", \"nagaram\" → " + 
            isAnagram("anagram", "nagaram")); // true

        System.out.println("\"rat\", \"car\" → " + 
            isAnagram("rat", "car"));        // false

        System.out.println("\"aacc\", \"ccac\" → " + 
            isAnagram("aacc", "ccac"));      // false
    }
    
}
