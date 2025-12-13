package crackingTheCodingInterviews.arraysAndStringChapter1;

import java.util.HashMap;
import java.util.Map;

public class OneAway {
    public static void main(String[] args) {
        System.out.println(oneEditAway("pale", "ple"));
        System.out.println(oneEditAway("pales", "pale"));
        System.out.println(oneEditAway("pale", "bale"));
        System.out.println(oneEditAway("pale", "bake"));
        System.out.println(oneEditAway("pale", "pales"));
        System.out.println(oneEditAway("ppalle", "pale"));


    }
    public static boolean oneEditAway(String str1, String str2) {
        int string1Length = str1.length();
        int string2Length = str2.length();
        if((string1Length > string2Length) && (string1Length - string2Length) == 1) {
            return checkInsert(str1, str2);
        } else if((string1Length < string2Length) && (string2Length - string1Length) == 1) {
            return checkRemoval(str1, str2);
        } else if(string1Length == string2Length){
            return checkUpdate(str1, str2);
        } else {
            return false;
        }
    }
    public static Integer mapCheck(String longerString, String smallerString) {
        Map<Character,Integer> map = new HashMap<>();
        //Create a map of longer string
        for(char c:longerString.toCharArray()) {
            if(map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c,1);
            }
        }
        //update the map as per smaller string and update the counts
        for(char c:smallerString.toCharArray()) {
            if(map.containsKey(c)) {
                map.put(c, map.get(c) -1);
            }
        }
        //Check map
        int sum=0;
        for(int value:map.values()){
            sum+=value;
        }
        return sum;
    }
    public static boolean checkInsert(String str1, String str2) {
        //check character counts
        return mapCheck(str1,str2)==1;
    }
    public static boolean checkRemoval(String str1, String str2) {
        //check character counts
        return mapCheck(str2,str1)==1;
    }
    public static boolean checkUpdate(String str1, String str2) {
        return mapCheck(str1,str2)==1;
    }

}
