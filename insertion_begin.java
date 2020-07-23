import java.util.*;
public class insertion_begin {
    class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public Node head=null;
    public void insertBeg(int data)
    {
        Node temp=new Node(data);
        if(head==null)
        head=temp;

        else
        {
            temp.next=head;
            head=temp;
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
    ob.display();
    }

}