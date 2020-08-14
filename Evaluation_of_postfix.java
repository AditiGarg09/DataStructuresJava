import java.util.*;
public class Evaluation_of_postfix {
    
    static int evaluation_postfix(String exp)
    {
        Stack<Integer>stack=new Stack<>();
        
        for(int i=0;i<exp.length();i++)
        {
            char c=exp.charAt(i);
            
            if(Character.isDigit(c))
            {
                int num=Integer.parseInt(String.valueOf(c));
                stack.push(num);
            }
            else
            {
                int val1=stack.pop();
                int val2=stack.pop();
                
                switch(c)
                {
                    case '+':
                        {
                            stack.push(val2+val1);
                            break;
                        }
                    case '-':
                        {
                            stack.push(val2-val1);
                            break;
                        }
                    case '*':
                        {
                            stack.push(val2*val1);
                            break;
                        }
                    case '/':
                        {
                            stack.push(val2/val1);
                            break;
                        }
                        
                }
            }
        }
        return stack.pop();
    }
    public static void main(String args[]) {
        
      Scanner sc=new Scanner(System.in);
      
      System.out.print("Enter Expression: ");
      String expression=sc.next();
      
      System.out.println("Postfix Evaluation: "+evaluation_postfix(expression));
    }
}
