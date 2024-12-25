package leetCodeSolutions;

//2000. Reverse Prefix of Word
public class ReversePrefix2000 {
    public static void main(String[] args) {
        System.out.println(new ReversePrefix2000().reversePrefix("abcdefd",'d'));
        System.out.println(new ReversePrefix2000().reversePrefix("xyxzxe",'z'));
        System.out.println(new ReversePrefix2000().reversePrefix("abcd",'z'));


    }
    public String reversePrefix(String word, char ch) {

        return new StringBuffer(word.substring(0,word.indexOf(ch)+1)).reverse() + word.substring(word.indexOf(ch)+1);
    }
}
