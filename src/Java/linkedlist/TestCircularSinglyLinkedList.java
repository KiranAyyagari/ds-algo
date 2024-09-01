package linkedlist;

public class TestCircularSinglyLinkedList {

    public static void main(String[] args){
        CircularSinglyLinkedList linkedList = new CircularSinglyLinkedList();
        linkedList.insertAtHead(1);
        linkedList.insertAtHead(2);
        linkedList.insertAtHead(3);
        linkedList.insertAtTail(4);
        linkedList.insertAtTail(5);
        linkedList.insertAtHead(6);
        System.out.println("Size is "+linkedList.size);
        linkedList.print();
        System.out.println("is circular - "+linkedList.isCircular());
        linkedList.insertAtIndex(3,7);
        linkedList.insertAtIndex(1, 8);
        System.out.println("Size is "+linkedList.size);
        linkedList.print();
        System.out.println("is circular - "+linkedList.isCircular());
        linkedList.insertAtIndex(0,9);
        linkedList.insertAtIndex(linkedList.size, 10);
        System.out.println("Size is "+linkedList.size);
        linkedList.print();
        System.out.println("is circular - "+linkedList.isCircular());
        linkedList.deleteAtHead();
        System.out.println("Size is "+linkedList.size);
        linkedList.print();
        System.out.println("is circular - "+linkedList.isCircular());
        linkedList.deleteAtTail();
        System.out.println("Size is "+linkedList.size);
        linkedList.print();
        System.out.println("is circular - "+linkedList.isCircular());
        linkedList.deleteAtIndex(1);
        System.out.println("Size is "+linkedList.size);
        linkedList.print();
        System.out.println("is circular - "+linkedList.isCircular());
        linkedList.deleteAtIndex(0);
        System.out.println("Size is "+linkedList.size);
        linkedList.print();
        System.out.println("is circular - "+linkedList.isCircular());
        linkedList.deleteAtIndex(linkedList.size);
        System.out.println("Size is "+linkedList.size);
        linkedList.print();
        System.out.println("is circular - "+linkedList.isCircular());
        linkedList.reverseLinkedList();
        linkedList.print();
        System.out.println("is circular - "+linkedList.isCircular());
    }
}
