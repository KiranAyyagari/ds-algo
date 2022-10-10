package linkedlist;

public class CircularSinglyLinkedList {

    Node head;
    Node tail;
    int size;

    private static class Node{
        Node next;
        int value;
        public Node(int value){
            this.value=value;
            this.next=null;
        }
    }

    public void createCircularSinglyLinkedList(int value){
        head = new Node(value);
        tail= head;
        size=1;
    }

    public void insertAtHead(int value){
        if(head==null){
            createCircularSinglyLinkedList(value);
            return;
        }
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
        tail.next = head;
        size++;
    }

    public void insertAtTail(int value){
        if(head==null||tail==null){
            createCircularSinglyLinkedList(value);
            return;
        }
        Node newNode = new Node(value);
        tail.next = newNode;
        tail = newNode;
        tail.next = head;
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
            temp.next = newNode;
            size++;
        }
    }

    public void deleteAtHead(){
        if(size==1) {
            head = null;
            return;
        }
        head = head.next;
        tail.next = head;
        size--;
    }

    public void deleteAtTail(){
        if(size==1){
            head=null;
            tail=null;
            return;
        }
        Node temp = head;
        while(temp.next.next!=head){
            temp = temp.next;
        }
        temp.next = head;
        tail = temp;
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
            size--;
        }
    }

//1 2 3 4 5
    public void reverseLinkedList(){
        Node current = tail.next;
        Node prev = null;
        Node nextNode = current.next;

        while(current!=tail){
            prev = current;
            current = nextNode;
            nextNode = current.next;
            current.next = prev;
        }
        nextNode.next = current;
        head = current;
        tail = nextNode;
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

    public boolean isCircular(){
        if(tail.next==head)
            return true;
        return false;
    }


}
