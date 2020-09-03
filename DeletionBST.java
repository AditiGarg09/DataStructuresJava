import java.util.*;
public class BinarySearchTree {
    class Node
    {
        int key;
        Node left;
        Node right;
        
        Node(int value)
        {
            key=value;
            left=null;
            right=null;
        }
    }
    
    static Node root;
    
    BinarySearchTree()
    {
        root=null;
    }
    
    void insert(int key)
    {
        root=insertRec(root,key);
    }
    
    Node insertRec(Node root,int key)
    {
        if(root==null)
        {
            root=new Node(key);
            return root;
        }
        else
        {
            if(key<root.key)
            {
                root.left=insertRec(root.left,key);
            }
            if(key>root.key)
            {
                root.right=insertRec(root.right,key);
            }
            return root;
        }
    }
    
    static void display()
    {
        displayRec(root);
    }
    
    static void displayRec(Node root)
    {
        if(root!=null)
        {
            displayRec(root.left);
            System.out.print(root.key+" ");
            displayRec(root.right);
        }
    }
    
    void deletion(int key)
    {
        root=deletionRec(root,key);
    }
    
    Node deletionRec(Node root,int key)
    {
        if(root==null)
        {
            return root;
        }
        
        if(key<root.key)
        {
            root.left=deletionRec(root.left,key);
        }
        else if(key>root.key)
        {
            root.right=deletionRec(root.right,key);
        }
        
        else
        {
            if(root.left==null)
            {
                return root.right;
            }
            else if(root.right==null)
            {
                return root.left;
            }
            
            root.key=min(root.right);
            
            root.right=deletionRec(root.right,root.key);
        }
        return root;
    }
    
    int min(Node root)
    {
        int minValue=root.key;
        
        while(root.left!=null)
        {
            minValue=root.left.key;
            root=root.left;
        }
        
        return minValue;
    }
    
    public static void main(String args[]) {
        BinarySearchTree bst=new BinarySearchTree();
        
        bst.insert(50);
        bst.insert(30);
        bst.insert(20);
        bst.insert(40);
        bst.insert(70);
        bst.insert(60);
        bst.insert(80);
        
        System.out.print("Binary Search Tree: ");
        bst.display();
        
        bst.deletion(80);
        bst.deletion(70);
        bst.deletion(30);
        
        System.out.print("\nAfter Deletion\nBinary Search Tree: ");
        bst.display();
    }
}
