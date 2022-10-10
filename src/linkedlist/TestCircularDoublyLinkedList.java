package linkedlist;

public class TestCircularDoublyLinkedList {

    public static void main(String[] args){
        CircularDoublyLinkedList linkedList = new CircularDoublyLinkedList();
        linkedList.insertAtHead(1);
        linkedList.insertAtHead(2);
        linkedList.insertAtHead(3);
        linkedList.insertAtTail(4);
        linkedList.insertAtTail(5);
        linkedList.insertAtTail(6);
        System.out.println("Size is "+linkedList.size);
        linkedList.print();
        System.out.println(linkedList.isCircular());
        linkedList.insertAtIndex(0,7);
        System.out.println("Size is "+linkedList.size);
        linkedList.print();
        System.out.println(linkedList.isCircular());
        linkedList.insertAtIndex(2,8);
        System.out.println("Size is "+linkedList.size);
        linkedList.print();
        System.out.println(linkedList.isCircular());
        linkedList.insertAtIndex(linkedList.size, 9);
        System.out.println("Size is "+linkedList.size);
        linkedList.print();
        System.out.println(linkedList.isCircular());
        linkedList.deleteAtHead();
        System.out.println("Size is "+linkedList.size);
        linkedList.print();
        System.out.println(linkedList.isCircular());
        linkedList.deleteAtTail();
        System.out.println("Size is "+linkedList.size);
        linkedList.print();
        System.out.println(linkedList.isCircular());
        linkedList.deleteAtIndex(2);
        System.out.println("Size is "+linkedList.size);
        linkedList.print();
        System.out.println(linkedList.isCircular());
        linkedList.deleteAtIndex(0);
        System.out.println("Size is "+linkedList.size);
        linkedList.print();
        System.out.println(linkedList.isCircular());
        linkedList.deleteAtIndex(linkedList.size);
        System.out.println("Size is "+linkedList.size);
        linkedList.print();
        System.out.println(linkedList.isCircular());
        linkedList.printReverse();

    }
}
