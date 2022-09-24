package SinglyLL;

public class Delete {
    static Node data(Node head, int val){
        if(head == null) return null;
        Node prev=null, curr=head;

        while(curr.next != null && curr.val != val){
            prev = curr;
            curr = curr.next;
        }
        if(prev == null){
            head = head.next;
        }else{
            prev.next = curr.next;
            // redundant
            curr.next = null;
            curr = null;
        }

        return head;
    }
    static Node midNode(Node head){
        if(head == null) return null;
        if(head.next == null) return new Node(-1);

        int count =Size.get(head);
        int mid = count/2;
        Node temp = head;
        while(mid >1){
            temp = temp.next;
            mid--;
        }        
        
        temp.next = temp.next.next;
        return head;
    }
    static void node_withoutHead(Node node){
        node.val = node.next.val;
        node.next = node.next.next;        
    }

    static Node node(Node head, int pos){
        if(head == null) return null;
        if(head.next == null) return new Node(-1);
        
        if(pos==0){
            return head.next;
        }

        Node temp = head;
        for(int i=0; i<pos-1; i++){  
            temp = temp.next;          
        }
        temp.next = temp.next.next;
        return head;

    }
}
