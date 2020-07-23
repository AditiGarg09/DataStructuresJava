import java.util.*;
public class reverse_array {
  public static void main(String[] args) {
  
  Scanner sc=new Scanner(System.in);
  
  System.out.print("Enter Size of an array: ");
  int size=sc.nextInt();
  
  int arr[]=new int[size];
  
  System.out.print("Enter Elements in an array: ");
  for(int i=0;i<size;i++)
  arr[i]=sc.nextInt();
  
  System.out.print("Reversed Array: ");
  for(int i=size-1;i>=0;i--)
  System.out.print(arr[i]+" ");
  
 }
}