import java.util.*;
public class min_max {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter Size: ");
        int size=sc.nextInt();

        int arr[]=new int[size];

        System.out.print("Enter Elements: ");
        for(int i=0;i<size;i++)
        arr[i]=sc.nextInt();

        int min=arr[0];
        for(int i=0;i<size;i++)
        {
            if(min>arr[i])
            min=arr[i];
        }

        System.out.println("Minimum Element: "+min);

        int max=arr[0];
        for(int i=0;i<size;i++)
        {
            if(max<arr[i])
            max=arr[i];
        }
        System.out.println("Maximum Element: "+max);
    }
}
