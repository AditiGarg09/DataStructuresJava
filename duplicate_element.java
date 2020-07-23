import java.util.*;
public class duplicate_elements {
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);

        System.out.print("Enter size: ");
        int size=s.nextInt();

        int arr[]=new int[size];

        System.out.println("Enter Elements: ");
        for(int i=0;i<size;i++)
        ar[i]=s.nextInt();

        System.out.println(" ");
        int c=0,i,j;

        System.out.print("Duplicate elements: ");
        for(i=0;i<size;i++)
        {
            for(j=i+1;j<size;j++)
            {
                if(ar[i]==ar[j]&&c!=ar[j])
                {
                    ar[i]=ar[j];
              
                System.out.print(ar[j]+" ");
                c=ar[j];
                  
                break;
                }
            }
        }
    }
}
