package crackingTheCodingInterviews.arraysAndStringChapter1;

import java.util.Arrays;

//Given two strings write a method to decide if one is the permutation of other string
public class isPermutationOfOtherString {

    public static void main(String[] args) {
        System.out.println(isPermutationHash("abcdef", "fedcba"));
        System.out.println(isPermutationHash("a1b2c3", "123ab"));
        System.out.println(isPermutationHash("AaBb", "bbaa"));
    }

    /*Thoughts
    1. One can sort the string and check linearly
    2. One can sort and compute hash code and check equality
    */
    public static boolean isPermutationLinear(String str1, String str2) {
        if(str1.length()!=str2.length()) {
            return false;
        } else {
            char[] chars1 = str1.toCharArray();
            Arrays.sort(chars1);
            char[] chars2 = str2.toCharArray();
            Arrays.sort(chars2);
            for(int index=0; index<chars1.length; index++) {
                if(chars1[index] != chars2[index]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean isPermutationHash(String str1, String str2) {
        if(str1.length()!=str2.length()) {
            return false;
        } else {
            char[] chars1 = str1.toCharArray();
            Arrays.sort(chars1);
            char[] chars2 = str2.toCharArray();
            Arrays.sort(chars2);
            if(!String.valueOf(chars1).equals(String.valueOf(chars2))) {
                return false;
            }
        }
        return true;
    }
}
