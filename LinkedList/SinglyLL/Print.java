package SinglyLL;

public class Print {
    static void print(Node head){
        if(head==null){
            System.out.println("null");
            return;
        }            
        Node temp = head;
        while(temp != null){
          
            if(temp.next!=null)
                System.out.print(temp.val+"->");
            else
                System.out.print(temp.val);
            temp = temp.next;
        }
        System.out.println();

    }
    static void printReverse(Node temp){
        if(temp==null) return;
        printReverse(temp.next);
        System.out.print(temp.val+" ");
}
}
