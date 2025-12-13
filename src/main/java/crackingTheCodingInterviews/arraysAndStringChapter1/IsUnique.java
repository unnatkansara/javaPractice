package crackingTheCodingInterviews.arraysAndStringChapter1;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

//1.1 Determine if string has all unique characters. Donot use data structures
public class IsUnique {

    public static void main(String[] args) {
        System.out.println(checkIsUniqueWithoutDataStructures("This is a sentence"));
        System.out.println(checkIsUniqueWithoutDataStructures("k2tF8yM5nJqD7eB"));
        System.out.println(checkIsUniqueWithoutDataStructures("ABCDEfGHij123KLMNopQ876sTUV90WXYZ"));

        System.out.println(checkWithoutDataStructures2("This is a sentence"));
        System.out.println(checkWithoutDataStructures2("k2tF8yM5nJqD7eB"));
        System.out.println(checkWithoutDataStructures2("ABCDEfGHij123KLMNopQ876sTUV90WXYZ"));

    }

    //We can use following data structures [1] Set [2] Map [3]. List our custom implementation
    public static boolean checkIsUniqueWithoutDataStructures(String str) {
        if(str.length()>128) {
            return false;
        }
        else {
            boolean[] char_set = new boolean[128];
            for(char c:str.toCharArray()){
                if(char_set[(int)c]) {
                    return false;
                }
                char_set[(int)c] = true;
            }
        }
        return true;
    }

    public static boolean checkWithoutDataStructures2(String str) {
        return str.chars().distinct().count() == str.length();
    }

    public static boolean checkIsUniqueWithDataStructures(String str) {
        String[] lst = str.split("");
        Set<String> set=new HashSet<String>();
        for(String local_string:lst) {
            if(!set.add(local_string)){
                return false;
            }
        }
        return true;
    }
}
