package crackingTheCodingInterviews.linkedListChapter2;

public class customLinkedList {

}

class LinkedListCustomImplementation {
    Node headerNode;
    Node currentNode;
}

class Node {
    int data;
    Node nextNode;

    Node(int data) {
        this.data = data;
    }

    public void append(int data) {
        Node newNode = new Node(data);
        newNode.nextNode=null;
        this.nextNode = newNode;
    }
}
