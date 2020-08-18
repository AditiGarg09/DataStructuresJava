import java.util.*;
public class InfixToPostfix 
{
    static int precedence(char ch)
    {
        switch(ch)
        {
            case '+':
            case '-':
                return 1;
                
            case '*':
            case '/':
                return 2;
                
            case '^':
                return 3;
        }
        return -1;
    }
    static String infix_to_postfix(String exp)
    {
        String result=new String("");
        
        Stack<Character>stack=new Stack<>();
        
        for(int i=0;i<exp.length();i++)
        {
            char ch=exp.charAt(i);
            
            if(Character.isLetterOrDigit(ch))
            {
                result=result+ch;
            }
            
            else if(ch == '(')
            {
                stack.push(ch);
            }
            
            else if(ch == ')')
            {
                while(!stack.isEmpty() && stack.peek() != '(')
                result=result+stack.pop();
                
                if(!stack.isEmpty() && stack.peek() != '(')
                return "Invalid Expression";
                
                else
                stack.pop();
            }
            
            else
            {
                while(!stack.isEmpty() && precedence(ch) <= precedence(stack.peek()))
                {
                    if(stack.peek()=='(')
                    return "Invalid Expression";
                    
                    result=result+stack.pop();
                }
                stack.push(ch);
            }
        }
        while(!stack.isEmpty())
        {
            if(stack.peek() == '(')
            return "Invalid Expression";
            
            result=result+stack.pop();
        }
        return result;
        }
    
    public static void main(String args[]) 
    {
      Scanner sc=new Scanner(System.in);
      
      System.out.println("Enter Infix Expression: ");
      String exp=sc.nextLine();
      
      System.out.println("Postfix Expression: "+infix_to_postfix(exp));
    }
}
