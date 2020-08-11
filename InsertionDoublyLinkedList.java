public class InsertionDoublyLinkedList {
    class Node
    {
        int data;
        Node prev;
        Node next;
        
        Node(int d)
        {
            data=d;
            prev=null;
            next=null;
        }
    }
    
    Node head;
    
    void insertionBegin(int data)
    {
        Node c_node=new Node(data);
        
        if(head!=null)
        {
        head.prev=c_node;
        c_node.next=head;  
        head=c_node;
        }
        else
        head=c_node;
    }
    
    void insertionEnd(int data)
    {
        Node c_node=new Node(data);
        if(head==null)
        {
            head=c_node;
        }
        else
        {
            Node new_node=head;
            while(new_node.next!=null)
            {
                new_node=new_node.next;
            }
            new_node.next=c_node;
            c_node.prev=new_node;
        }
    }
    
    void display()
    {
        if(head==null)
        System.out.print("EMPTY LINKED LIST");
        else
        {
            Node c_node=head;
            while(c_node!=null)
            {
                System.out.println(c_node.data);
                c_node=c_node.next;
            }
        }
    }
    
    public static void main(String args[]) {
      
      InsertionDoublyLinkedList dll=new InsertionDoublyLinkedList();
      
      dll.insertionBegin(20);
      dll.insertionBegin(10);
      
      dll.insertionEnd(30);
      dll.insertionEnd(40);
      
      dll.display();
    }
}
