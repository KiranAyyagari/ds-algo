package linkedlist;

public class TestDoublyLinkedList {

    public static void main(String[] args){
        DoublyLinkedList linkedList = new DoublyLinkedList();
        linkedList.insertAtHead(1);
        linkedList.insertAtHead(2);
        linkedList.insertAtHead(3);
        linkedList.insertAtTail(4);
        linkedList.insertAtTail(5);
        linkedList.insertAtTail(6);
        System.out.println("Size is "+linkedList.size);
        linkedList.print();
        linkedList.printReverse();
        linkedList.insertAtIndex(4,7);
        linkedList.insertAtIndex(2, 8);
        System.out.println("Size is "+linkedList.size);
        linkedList.print();
        linkedList.printReverse();
        linkedList.insertAtIndex(0,9);
        linkedList.insertAtIndex(0,10);
        System.out.println("Size is "+linkedList.size);
        linkedList.print();
        linkedList.printReverse();
        linkedList.insertAtIndex(linkedList.size, 11);
        System.out.println("Size is "+linkedList.size);
        linkedList.print();
        linkedList.printReverse();
        linkedList.deleteAtHead();
        linkedList.deleteAtHead();
        System.out.println("Size is "+linkedList.size);
        linkedList.print();
        linkedList.printReverse();
        linkedList.deleteAtTail();
        linkedList.deleteAtTail();
        System.out.println("Size is "+linkedList.size);
        linkedList.print();
        linkedList.printReverse();
        linkedList.deleteAtIndex(3);
        System.out.println("Size is "+linkedList.size);
        linkedList.print();
        linkedList.printReverse();
        linkedList.deleteAtIndex(0);
        System.out.println("Size is "+linkedList.size);
        linkedList.print();
        linkedList.printReverse();
        linkedList.deleteAtIndex(linkedList.size);
        System.out.println("Size is "+linkedList.size);
        linkedList.print();
        linkedList.printReverse();
    }
}
