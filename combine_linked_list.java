import java.util.*;
public class Main
{
    Node head;
    class Node
    {
        int data;
        Node next;
        
        Node(int d)
        {
            data=d;
            next=null;
        }
    }
    
    public void insertBeg(int new_data)
    {
        Node new_node=new Node(new_data);
        new_node.next=head;
        head=new_node;
    }
    
    public void insertAfter(Node prev_node,int new_data)
    {
        if(prev_node==null)
        {
            System.out.println("Should Not be NULL");
            return;
        }
        Node new_node=new Node(new_data);
        new_node.next=prev_node.next;
        prev_node.next=new_node;
    }
    
    public void insertEnd(int new_data)
    {
        Node new_node=new Node(new_data);
        if(head==null)
        {
            head=new_node;
            return;
        }
        
        Node last=head;
        while(last.next!=null)
        last=last.next;
        
        last.next=new_node;
    }
    public void display()
    {
        Node c_node=head;
        while(c_node!=null)
        {
            System.out.print(c_node.data+" ");
            c_node=c_node.next;
        }
    }
	public static void main(String[] args) {
		Main list=new Main();
		
		list.insertBeg(40);
		list.insertEnd(60);
		list.insertAfter(list.head,50);
		
		System.out.print("Linked List: ");
		list.display();
	}
}
