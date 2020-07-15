import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int mid=0,lb=0,ub=size-1;
		int arr[]=new int[size];
		
		for(int i=0;i<size;i++)
		arr[i]=sc.nextInt();
		
		System.out.print("Find Element: ");
		int ele=sc.nextInt();
		
		for(int i=0;i<size;i++)
		{
		    mid=(lb+ub)/2;
		    
		    if(arr[mid]==ele)
		    {
		        System.out.print("Find at "+mid+" index");
		        break;
		    }
		    else if (arr[mid]<ele) 
		    {
		        lb=mid+1;
		    }
		    else if (arr[mid]>ele)
		    {
		        ub=mid-1;
		    }
		}
	}
}