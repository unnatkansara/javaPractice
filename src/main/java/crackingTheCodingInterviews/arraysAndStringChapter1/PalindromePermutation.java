package crackingTheCodingInterviews.arraysAndStringChapter1;

import java.util.HashMap;
import java.util.Map;

public class PalindromePermutation {
    public static void main(String[] args) {
        System.out.println(checkIfPermutationOfPalindrome("Tact Coa"));
        System.out.println(checkIfPermutationOfPalindrome("fafa"));
        System.out.println(checkIfPermutationOfPalindrome("abcd"));
        System.out.println(checkIfPermutationOfPalindrome("t t"));

    }
    public static boolean checkIfPermutationOfPalindrome(String str) {
        String cleanString = str.toLowerCase().replace(" ","");
        Map<Character, Integer> map = new HashMap<>();
        for(char ch:cleanString.toCharArray()) {
            if(map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }
        int oddFrequencyCount=0;
        for(int value:map.values()){
            if(value%2 !=0) {
                oddFrequencyCount+=1;
            }
            if(oddFrequencyCount>1) return false;
        }

        return true;
    }
}
