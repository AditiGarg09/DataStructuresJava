import java.util.*;
public class InfixToPrefix
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
    static String infixToPrefix(String exp)
    {
        String str=new StringBuilder(exp).reverse().toString();
        
        Stack<Character>stack = new Stack<>();
        
        String result=new String("");
        
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            
            if(Character.isLetterOrDigit(ch))
            {
                result+=ch;
            }
            else if(ch==')')
            {
                stack.push(ch);
            }
            else if(ch =='(')
            {
                while(!stack.isEmpty() && stack.peek() !=')')
                result+=stack.pop();
                
                if(!stack.isEmpty() && stack.peek() !=')')
                return "Invalid Expression";
                
                else
                stack.pop();
            }
            else
            {
                while(!stack.isEmpty() && precedence(ch) <= precedence(stack.peek()))
                {
                    if(stack.peek()==')')
                    return "Invalid Expression";
                    
                    result+=stack.pop();
                }
                stack.push(ch);
            }
        }
        while(!stack.isEmpty())
        {
            if(stack.peek()==')')
            return "Invalid Expression";
                
            result+=stack.pop();
        }
        
        result = new StringBuilder(result).reverse().toString();
        
        return result;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter Infix Expression: ");
        String exp=sc.next();
        
        System.out.println("Prefix Expression: "+infixToPrefix(exp));
    }
}
