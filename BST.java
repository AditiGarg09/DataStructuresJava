import java.util.*;
public class BinarySearchTree
{
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
                root.left=insertRec(root.left, key);
            }
            else 
            {
                root.right=insertRec(root.right,key);
            }
            return root;
        }
    }
    
    static void preOrder()
    {
        preOrderRec(root);
    }
    
    static void preOrderRec(Node root)
    {
        if(root!=null)
        {
            System.out.print(root.key+" ");
            preOrderRec(root.left);
            preOrderRec(root.right);
        }
    }
    
    static void postOrder()
    {
        postOrderRec(root);
    }
    
    static void postOrderRec(Node root)
    {
        if(root!=null)
        {
            postOrderRec(root.left);
            postOrderRec(root.right);
            System.out.print(root.key+" ");
        }
    }
    
    static void inOrder()
    {
        inOrderRec(root);
    }
    
    static void inOrderRec(Node root)
    {
        if(root!=null)
        {
            inOrderRec(root.left);
            System.out.print(root.key+" ");
            inOrderRec(root.right);
        }
    }
    
    public static void main(String args[])
    {
        BinarySearchTree bst=new BinarySearchTree();
        
        bst.insert(10);
        bst.insert(20);
        bst.insert(15);
        bst.insert(16);
        bst.insert(5);
        bst.insert(30);
        
        System.out.print("PreOrder ");
        preOrder();
        
        System.out.print("\nPostOrder ");
        postOrder();
        
        System.out.print("\nInOrder ");
        inOrder();
    }
}
