import java.util.*;
public class SelectionSort {
    
    void sort(int arr[])
    {
        int size=arr.length;
        
        for(int i=0;i<size-1;i++)
        {
           int min=i;
           
           for(int j=i+1;j<size;j++)
           {
               if(arr[j]<arr[min])
               min=j;
           }
           int temp = arr[min];
           arr[min] = arr[i];
           arr[i] = temp;
        }
    }
    
    void displayArray(int arr[])
    {
        int size=arr.length;
        
        System.out.print("Sorted Array:");
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
        
        SelectionSort obj=new SelectionSort();
        
        obj.sort(arr);
        
        obj.displayArray(arr);
    }
}
