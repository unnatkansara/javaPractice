package leetCodeSolutions;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MergeSortedList {
    public static void main(String[] args) {
        LinkedList<Integer> list1 = new LinkedList<>();
        list1.add(1);
        list1.add(2);
        list1.add(4);
        LinkedList<Integer> list2 = new LinkedList<>();
        list2.add(1);
        list2.add(3);
        list2.add(4);
        System.out.println(mergeTwoLists(list1,list2));

    }

    public static LinkedList<Integer> mergeTwoLists(LinkedList<Integer> list1, LinkedList<Integer> list2) {
        LinkedList<Integer> newList = new LinkedList<>();
        for(int index1=0; index1<=list1.size()-1;) {
            for(int index2=0;index2<=list2.size()-1;) {
                if(index1<=list1.size()-1 && (list1.get(index1) <= list2.get(index2)) ) {
                    newList.add(list1.get(index1));
                    index1++;
                }
                else if(index2<=list2.size()){
                    newList.add(list2.get(index2));
                    index2++;
                }
            }
        }
        return newList;
    }
}
