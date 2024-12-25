package crackingTheCodingInterviews.linkedListChapter2;

import java.util.*;
import java.util.stream.Collectors;

public class RemoveDuplicates {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("one");
        list.add("two");
        System.out.println(removeDuplicates(list));
    }

    //One of the method is to create a set and then convert it to LinkedList
    //But one problem we see is that original linkedList is present in memory
    public static LinkedList<String> removeDuplicates(LinkedList<String> ll) {
        Set<String> set=new HashSet<String>();
        for(String str:ll) {
            set.add(str);
        }

        return new LinkedList<String>(set);
    }
}
