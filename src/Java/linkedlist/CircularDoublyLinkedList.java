package linkedlist;

public class CircularDoublyLinkedList {

    Node head;
    Node tail;
    int size;

    private static class Node{
        Node prev;
        Node next;
        int value;

        public Node(int value){
            this.value = value;
            this.next = null;
            this.prev = null;
        }

    }

    public void createDoublyCircularLinkedList(int value){
        head = new Node(value);
        tail = head;
        tail.next = head;
        head.prev = tail;
        size++;
    }

    public void insertAtHead(int value){
        if(head==null){
            createDoublyCircularLinkedList(value);
            return;
        }
        Node newNode = new Node(value);
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
        head.prev = tail;
        size++;
    }

    public void insertAtTail(int value){
        if(head==null||tail==null){
            createDoublyCircularLinkedList(value);
            return;
        }
        Node newNode = new Node(value);
        tail.next = newNode;
        newNode.prev = tail;
        tail= newNode;
        tail.next = head;
        size++;
    }

    public void insertAtIndex(int index, int value){
        int eleIndex=0;
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
        head.prev = tail;
        tail.next = head;
        size--;
    }

    public void deleteAtTail(){
        if(size==1){
            head=null;
            tail=null;
            return;
        }
        Node prev = tail.prev;
        prev.next = head;
        tail = prev;
        head.prev = tail;
        size--;
    }

    public void deleteAtIndex(int index){
        int eleIndex=0;
        if(index==0)
            deleteAtHead();
        else if(index>=size)
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

    public boolean isCircular(){
        if(tail.next==head)
            return true;
        return false;
    }

    public void print(){
        int index =0;
        Node temp = head;
        while(index!=size){
            System.out.print(temp.value+" ");
            temp = temp.next;
            index++;
        }
        System.out.println();
    }

    public void printReverse(){
        int index = 0;
        Node temp = tail;
        while(index!=size){
            System.out.print(temp.value+" ");
            temp= temp.prev;
            index++;
        }
        System.out.println();
    }
}
