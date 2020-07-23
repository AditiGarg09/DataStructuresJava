import java.util.*;
public class print_array {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter Size: ");
        int size=sc.nextInt();

        int arr[]=new int[size];

        System.out.print("Enter Elements: ");
        for(int i=0;i<size;i++)
        arr[i]=sc.nextInt();

        System.out.print("Finally Entered Array is ");
        for(int i=0;i<size;i++)
        System.out.print(arr[i]+" ");

    }
}