package SinglyLL;

public class Reverse {
    static Node reverse(Node head){
        Node prev=null, curr=head, temp=null;
        while(curr != null){
                temp = curr.next;
                curr.next = prev;  // reversing
                // update
                prev = curr;
                curr = temp;   // alert
        }
        return prev;
    }

    static Node recursiveReverse(Node head){
        if(head == null || head.next == null)
            return head;          
        Node newHead = recursiveReverse(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }
}
