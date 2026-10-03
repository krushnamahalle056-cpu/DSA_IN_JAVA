package Strings;

import java.util.Arrays;

public class AnagramQue {
    public static boolean areAnagrams(String s1, String s2) {
        // code here
        if(s1.length() != s2.length()) return false;
        char[] arr1 = s1.toCharArray();          // create array using char
        char[] arr2 = s2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);


    }
}
