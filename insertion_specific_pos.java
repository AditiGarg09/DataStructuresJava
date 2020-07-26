import java.io.*;
import java.util.*;
public class insertion_specific_pos
{
  static class Node
  {
    int data;
    Node next;

      Node (int d)
    {
      data = d;
      next = null;
    }
  }
  public static Node head;
  public static insertion_specific_pos insert (insertion_specific_pos list, int data)
  {
    Node new_node = new Node (data);
    if (list.head == null)
      {
	list.head = new_node;
      }
    else
      {
	Node temp = list.head;
	//temp.next=null;
	while (temp.next != null)
	  {
	    temp = temp.next;
	  }
	temp.next = new_node;
      }
    return list;
  }
  
  public static insertion_specific_pos insertPos(insertion_specific_pos list,int data,int pos)
  {
      Node c_node=new Node(data);
      if(list.head==null && pos==0)
      list.head=c_node;
      else if(list.head==null && pos!=0)
      System.out.print("Position not valid");
      else
      {
          Node previous=null;
          Node current=head;
          for(int i=1;i<pos;i++)
          {
              previous=current;
              current=current.next;
              
              if(current.next==null)
              break;
          }
          c_node.next=current;
          previous.next=c_node;
      }
      return list;
  }
  
  public static void display (insertion_specific_pos list)
  {
    //Node c_node=new Node(data);
    Node temp = head;
    while (temp != null)
      {
	System.out.print (temp.data + " ");
	temp = temp.next;
      }
  }
  public static void main (String[]args)
  {

    insertion_specific_pos list = new insertion_specific_pos ();

    list = insert (list, 10);
    list = insert (list, 20);
    list = insert (list, 30);
    list = insert (list, 40);

    //display (list);
    
    list=insertPos(list,3,2);
    
    display(list);
  }
}
