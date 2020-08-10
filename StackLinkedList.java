public class StackLinkedList
{
        class Node
        {
            int data;
            Node link;
            
            Node(int d)
            {
                data=d;
                link=null;
            }
        }
        
        Node top;
        
        void push(int data)
        {
            Node c_node=new Node(data);
            
            c_node.link=top;
            top=c_node;
        }
        
        void pop()
        {
            if(top!=null)
            {
            int popped_ele=top.data;
            System.out.println("Popped Element: "+popped_ele);
            top=top.link;
            }
            else
            System.out.println("Stack Underflow");
            
        }
        
        void peek()
        {
            if(top==null)
            System.out.print("Empty Stack");
            else
            System.out.println("Top Element: "+top.data);
        }
        public static void main(String args[])
        {
        StackLinkedList sll=new StackLinkedList();
        
        sll.push(10);
        sll.push(20);
        sll.push(30);
        sll.push(40);
        
        sll.pop();
        
        sll.peek();
    }
}
