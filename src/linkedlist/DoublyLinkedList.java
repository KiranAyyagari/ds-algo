package linkedlist;

public class DoublyLinkedList {

    Node head;
    Node tail;
    int size;
    private static class Node{
        Node next;
        Node prev;
        int value;

        public Node(int value){
            this.value = value;
            this.next = null;
            this.prev = null;
        }


    }
    public void createDoublyLinkedList(int value){
        head = new Node(value);
        tail = head;
        size=1;
    }

    public void insertAtHead(int value){
        if(head==null) {
            createDoublyLinkedList(value);
            return;
        }
        Node newNode = new Node(value);
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
        size++;
    }

    public void insertAtTail(int value){
        if(head==null||tail==null){
            createDoublyLinkedList(value);
            return;
        }
        Node newNode = new Node(value);
        newNode.prev = tail;
        tail.next = newNode;
        tail = newNode;
        size++;
    }

    public void insertAtIndex(int index, int value){
        int eleIndex = 0;
        if(index==0)
            insertAtHead(value);
        else if(index>=size)
            insertAtTail(value);
        else{
            Node temp = head;
            while(eleIndex!=index-1){
                temp = temp.next;
                eleIndex++;
            }
            Node newNode = new Node(value);
            newNode.next = temp.next;
            temp.next.prev = newNode;
            temp.next = newNode;
            newNode.prev = temp;
            size++;
        }
    }

    public void deleteAtHead(){
        if(size==1) {
            head = null;
            return;
        }
        head = head.next;
        head.prev = null;
        size--;
    }

    public void deleteAtTail(){
        if(size==1) {
            head = null;
            tail=null;
            return;
        }
        tail = tail.prev;
        tail.next = null;
        size--;
    }

    public void deleteAtIndex(int index){
        int eleIndex = 0;
        if(index==0)
            deleteAtHead();
        else if(index >= size)
            deleteAtTail();
        else{
            Node temp = head;
            while(eleIndex!=index-1){
                temp = temp.next;
                eleIndex++;
            }
            temp.next = temp.next.next;
            temp.next.prev = temp;
            size--;
        }
    }

    public void print(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.value+" ");
            temp= temp.next;
        }
        System.out.println();
    }

    public void printReverse(){
        Node temp = tail;
        while(temp!=null){
            System.out.print(temp.value+" ");
            temp= temp.prev;
        }
        System.out.println();
    }
}
