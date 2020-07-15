import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    
		Scanner sc=new Scanner(System.in);
		
		int size=sc.nextInt();
		int arr[]=new int[size];
		
		for(int i=0;i<size;i++)
		arr[i]=sc.nextInt();
		
		for(int i=0;i<size-1;i++)
		{
		    for(int j=0;j<size-i-1;j++)
		    {
		        if(arr[j]>arr[j+1])
		        {
		            int temp=arr[j+1];
		            arr[j+1]=arr[j];
		            arr[j]=temp;
		        }
		    }
		}
		
		System.out.print("Sorted Array: ");
		for(int i=0;i<size;i++)
		{
		    System.out.print(arr[i]+" ");
		}
	}
}
