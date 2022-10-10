package linkedlist;

public class SinglyLinkedList {

    Node head;
    Node tail;
    int size;

    private static class Node{
        Node next;
        int value;
        public Node(int value){
            this.next = null;
            this.value = value;
        }
    }

    public void createLinkedList(int value){
        head = new Node(value);
        tail = head;
        size=1;
    }

    public void insertAtHead(int value){
        if(head==null) {
            createLinkedList(value);
            return;
        }
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
        size++;
    }

    public void insertAtTail(int value){
        if(head==null||tail==null) {
            createLinkedList(value);
            return;
        }
        Node newNode = new Node(value);
        tail.next = newNode;
        tail = newNode;
        size++;
    }

    public void insertAtIndex(int index, int value){


        int eleIndex = 0;

        Node temp = head;

        if(index==0)
            insertAtHead(value);
        else if(index>=size){
            insertAtTail(value);
        }else {

            while (eleIndex != index-1) {
                temp = temp.next;
                eleIndex++;
            }
            Node newNode = new Node(value);
            newNode.next = temp.next;
            temp.next = newNode;
            size++;
        }
    }

    public void deleteAtHead(){
        if(size==1) {
            head = null;
            return;
        }
        Node temp = head;
        head = temp.next;
        size--;
    }

    public void deleteAtTail(){
        if(size==1) {
            head = null;
            tail = null;
            return;
        }
        Node temp = head;
        while(temp.next!=tail){
            temp=temp.next;
        }
        temp.next = null;
        tail = temp;
        size--;
    }

    public void deleteAtIndex(int index){
        int eleIndex=0;
        Node temp = head;
        if(index==0)
            deleteAtHead();
        else if(index>=size)
            deleteAtTail();
        else{
            while (eleIndex != index-1) {
                temp = temp.next;
                eleIndex++;
            }
            temp.next = temp.next.next;
            size--;
        }
    }

    public Node reverseLinkedList(Node head){
        if(head.next==null){
            return head;
        }
        if(head==null)
            return head;

        Node newNodeHead = reverseLinkedList(head.next);
        head.next.next = head;
        head.next = null;
        return newNodeHead;
    }

    public void print(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.value+" ");
            temp= temp.next;
        }
        System.out.println();
    }
}
