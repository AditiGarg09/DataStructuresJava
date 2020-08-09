public class TwoStacks
{
    int size=10;
    int arr[]=new int[size];
    int top1=-1;
    int top2=size;
    
    void push1(int data)
    {
        if(top1<top2-1)
        {
            arr[++top1]=data;
        }
        else
        {
            System.out.println("Stack Overflow");
        }
    }
    
    void push2(int data)
    {
        if(top1<top2-1)
        {
            arr[--top2]=data;
        }
        else
        {
            System.out.println("Stack Overflow");
        }
    }
    
    int pop1()
    {
        if(top1>=0)
        {
            int data=arr[top1];
            top1--;
            return data;
        }
        else
        {
            System.out.println("Stack Underflow");
            return 0;
        }
    }
    
    int pop2()
    {
        if(top2<size)
        {
            int data=arr[top2];
            top2++;
            return data;
        }
        else
        {
            System.out.println("Stack Underflow");
            return 0;
        }
    }
    public static void main(String args[])
    {
        TwoStacks ts=new TwoStacks();
        
        ts.push1(10);
        ts.push2(20);
        ts.push1(30);
        ts.push1(40);
        ts.push2(50);
        
        System.out.println(ts.pop1());
        System.out.println(ts.pop2());
    }
}
