import java.io.*;
class insertion_end{
    Node head;
    static class Node{
        int data;
        Node next;
        
        Node(int d)
        {
            data=d;
            next=null;
        }
    }

    public static insertion_end insert(insertion_end list,int data)
    {
        Node new_node=new Node(data);
        new_node.next=null;

        if(list.head==null)
        list.head=new_node;

        else
        {
            Node last=list.head;
            while(last.next!=null)
            {
                last=last.next;
            }
            last.next=new_node;
        }
        return list;
    }

    public static void display(insertion_end list)
    {
        Node current_node=list.head;

        System.out.print("Linked List: ");

        while(current_node!=null)
        {
            System.out.print(current_node.data+" ");
            current_node=current_node.next;
        }
    }

    public static void main(String args[])
    {
        insertion_end list=new insertion_end();
        list=insert(list,10);
        list=insert(list,20);
        list=insert(list,30);
        list=insert(list,40);

        display(list);
    }

}