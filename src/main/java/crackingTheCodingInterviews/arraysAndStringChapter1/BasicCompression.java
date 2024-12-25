package crackingTheCodingInterviews.arraysAndStringChapter1;
//1.6 Perform a basic compression that counts repeated characters
//Example aabcccccaaa returns a2b1c5a3
//Assume string has only upper case and lower case letters
public class BasicCompression
{
    public static void main(String[] args) {
        System.out.println(performBasicCompression("aabcccccaaa"));
    }

    public static String performBasicCompression(String str) {
        int consecutiveChars=0;
        StringBuilder compressedString = new StringBuilder();
        for(int index=0;index<str.length();index++) {
                consecutiveChars+=1;
            if((index+1>=str.length()) || (str.charAt(index) != str.charAt(index+1))) {
                compressedString.append(str.charAt(index) + String.valueOf(consecutiveChars));
                consecutiveChars = 0;
            }
        }

        return compressedString.toString();
    }
}
