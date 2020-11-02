
import java.util.*;
import java.lang.*;
import java.io.*;

class EvaluatePostfix {
    
    public static boolean isOperator (char ch) {
        
        if (ch == '+' || ch == '-' || ch == '/' || ch == '*') {
            return true;
        }
        
        return false;
    }
    
    public static int evaluate (String expression) {
        
        Stack<Integer> st = new Stack<Integer> ();
        
        for (int i = 0; i < expression.length(); ++i) {
            
            if (isOperator(expression.charAt(i)) == false) {
                st.push(expression.charAt(i) - '0');
                continue;
            }
            
            int a = st.pop();
            int b = st.pop();
            
            int result = 0;
            
            switch (expression.charAt(i)) {
                
                case '+':
                    result = b + a;
                    break;
                    
                case '-':
                    result = b - a;
                    break;
                    
                case '*':
                    result = b * a;
                    break;
                    
                case '/':
                    result = b / a;
                    break;
            }
            
            st.push(result);
        }
        
        return st.peek();
    }
    
	public static void main (String[] args) {
		//code
		Scanner input = new Scanner (System.in);
		
		int t = input.nextInt ();
		
		while (t > 0) {
		    
		    String expression = input.next ();
		    
		    System.out.println (evaluate(expression));
		    
		    t -= 1;
		}
	}
}
