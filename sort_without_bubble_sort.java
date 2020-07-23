import java.util.*;
public class sort_without_bubble_sort {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter Size: ");
        int size=sc.nextInt();

        int arr[]=new int[size];

        System.out.print("Enter Elements: ");
        for(int i=0;i<size;i++)
        arr[i]=sc.nextInt();

        Arrays.sort(arr);

        System.out.print("Sorted Array: "+Arrays.toString(arr));
    }
}