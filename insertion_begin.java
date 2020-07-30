import java.util.*;
public class insertion_begin {
    class Node{
        int data;
        Node next;

        public Node(int d){
            data=d;
            next=null;
        }
    }
    public Node head=null;
    public void insertBeg(int data)
    {
        Node new_node=new Node(data);
        if(head==null)
        head=new_node;

        else
        {
            new_node.next=head;
            head=new_node;
        }
    }

    public void display()
    {
        Node current=head;
        if(head==null)
        System.out.print("List is Empty");
        else
        {
            while(current!=null)
            {
                System.out.print(current.data+" ");
                current=current.next;
            }
        }
    }
    public static void main(String args[]) {
    
    insertion_begin ob=new insertion_begin();
    ob.insertBeg(10);
    ob.insertBeg(20);
    ob.insertBeg(30);
    ob.insertBeg(40);
    ob.display();
    }

}
