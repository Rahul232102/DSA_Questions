package questions;

class Node{
    int data;
    Node next;
}

public class MiddleNode{
    static Node middle(Node head){

        Node slow=head;
        Node fast=head;

        while(fast!=null && fast.next!=null){

            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
}