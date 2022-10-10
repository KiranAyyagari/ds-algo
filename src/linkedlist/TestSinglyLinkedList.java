package linkedlist;

public class TestSinglyLinkedList {

    public static void main(String[] args){
        SinglyLinkedList linkedList = new SinglyLinkedList();
        linkedList.insertAtHead(1);
        linkedList.insertAtHead(2);
        linkedList.insertAtHead(3);
        linkedList.insertAtTail(4);
        linkedList.insertAtTail(5);
        linkedList.insertAtTail(6);
        linkedList.insertAtIndex(3,7);
        linkedList.insertAtIndex(4,8);
        linkedList.insertAtIndex(0,9);
        linkedList.insertAtIndex(0,10);
        linkedList.insertAtIndex(linkedList.size, 11);
        System.out.println("Size is "+linkedList.size);
        linkedList.deleteAtHead();
        linkedList.deleteAtTail();
        System.out.println("Size is "+linkedList.size);
        linkedList.insertAtIndex(0,13);
        linkedList.insertAtIndex(linkedList.size, 14);
        System.out.println("Size is "+linkedList.size);
        linkedList.print();
        linkedList.deleteAtIndex(linkedList.size);
        linkedList.print();
        linkedList.deleteAtIndex(4);
        linkedList.print();
        linkedList.deleteAtIndex(4);
        linkedList.print();
        linkedList.head = linkedList.reverseLinkedList(linkedList.head);
        linkedList.print();
    }
}
