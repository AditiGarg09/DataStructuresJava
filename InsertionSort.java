import java.util.*;
public class InsertionSort {
    
    void sort(int arr[])
    {
        int size=arr.length;
        
        for(int i=1;i<size;i++)
        {
           int key=arr[i]; 
           int j=i-1;
           
           while(j>=0 && arr[j]>key)
           {
               arr[j+1]=arr[j];
               j=j-1;
           }
           arr[j+1]=key;
        }
    }
    
    void displayArray(int arr[])
    {
        int size=arr.length;
        
        System.out.println("Sorted Array:");
        for(int i=0;i<size;i++)
        {
            System.out.print(" "+arr[i]);
        }
    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter Size of an array: ");
        int size=sc.nextInt();
        
        int arr[]=new int[size];
        
        System.out.println("Enter Elements in an array: ");
        for(int i=0;i<size;i++)
        arr[i]=sc.nextInt();
        
        InsertionSort obj=new InsertionSort();
        
        obj.sort(arr);
        
        obj.displayArray(arr);
    }
}
