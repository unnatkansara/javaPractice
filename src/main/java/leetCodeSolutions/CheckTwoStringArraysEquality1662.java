package leetCodeSolutions;

import java.util.StringTokenizer;

//Check If Two String Arrays are Equivalent
public class CheckTwoStringArraysEquality1662 {
    public static void main(String[] args) {
        System.out.println(new CheckTwoStringArraysEquality1662().arrayStringsAreEqual(new String[]{"ab", "c"}, new String[]{"a", "bc"}));
    }

    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        return String.join("",word1).equals(String.join("",word2));
    }
}
