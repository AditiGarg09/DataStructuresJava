import java.util.*;
public class QuickSort {
    int partition(int arr[],int low,int high)
    {
        int pivot=arr[high];
        int i=low-1;
        for(int j=low;j<high;j++)
        { 
            if(arr[j]<pivot)
            {
                i++;
                int temp=arr[j];              
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
        
        int temp=arr[i+1];
        arr[i+1]=arr[high];
        arr[high]=temp;
        
        return i+1;
    }
    void sort(int arr[],int low,int high)
    {
        if(low<high)
        {
            int pivot_index = partition(arr,low,high);
            
            sort(arr,low,pivot_index-1);
            sort(arr,pivot_index+1,high);
        }
    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        
        int size=sc.nextInt();
        
        int arr[]=new int[size];
        for(int i=0;i<size;i++)
        arr[i]=sc.nextInt();
        
        QuickSort qs=new QuickSort();
        
        qs.sort(arr,0,size-1);
        
        for(int i=0;i<size;i++)
        System.out.print(arr[i]+" ");
    }
}
