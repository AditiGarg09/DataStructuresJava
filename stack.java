class Stack
{
  static final int max = 1000;
  int arr[] = new int[max];
  int top;

  boolean isEmpty ()
  {
    return (top < 0);
  }

  Stack ()
  {
    top = -1;
  }

  int push (int data)
  {
    if (top >= max - 1)
      {
	System.out.println ("Stack Overflow");
	return 0;
      }
    else
      {
	arr[++top] = data;
	System.out.println (data);
	return data;
      }
  }

  int pop ()
  {
    if (top < 0)
      {
	System.out.println ("Stack Underflow");
	return 0;
      }
    else
      {
	int data = arr[top--];
	return data;
      }
  }

}

public class Main
{
  public static void main (String[]args)
  {

    Stack s = new Stack ();

      s.push (10);
      s.push (20);
      s.push (30);

      s.pop ();

  }
}
