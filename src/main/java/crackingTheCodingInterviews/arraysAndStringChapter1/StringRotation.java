package crackingTheCodingInterviews.arraysAndStringChapter1;

//1.9 Check string 2 is a rotation of string 1
//example terbotterwat is a rotation of watterbottle
public class StringRotation {
    public static void main(String[] args) {
        System.out.println(isSubStringFaster("erbottlewat", "waterbottle"));
        System.out.println(isSubStringFaster("defabc", "abcdef"));
        System.out.println(isSubStringFaster("fabced", "abcdef"));
    }
    //There are two methods one is to actually rotate and check if string is rotation
    //Second is to concatenate twice the first string and check
    public static boolean isSubStringFaster(String str1, String str2) {
        if(str1.concat(str1).contains(str2)) {
            return true;
        }
        return false;
    }
}
