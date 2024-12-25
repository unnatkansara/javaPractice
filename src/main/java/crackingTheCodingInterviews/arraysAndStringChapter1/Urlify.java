package crackingTheCodingInterviews.arraysAndStringChapter1;

public class Urlify {
    public static void main(String[] args) {
        System.out.println(getUrl("Mr John Smith   ", 13));

    }

    public static String getUrl(String str, int num) {
        return new String(str.trim()).replace(" ", "%20");
    }

}
