import java.util.*;
import java.lang.*;
import java.io.*;

class BalancedParentheses {
    
    public static boolean isOpening (char ch) {
        
        if (ch == '(' || ch == '{' || ch == '[') {
            return true;
        }
        
        return false;
    }
    
    public static boolean balanced (String expression) {
        
        Stack<Character> st = new Stack<Character> ();
        
        for (int i = 0; i < expression.length(); ++i) {
            
            if (isOpening(expression.charAt(i))) {
                st.push(expression.charAt(i));
                continue;
            }
            
            if (st.isEmpty()) {
                return false;
            }
            
            char ch = st.pop();
            
            switch (ch) {
                
                case '(':
                    if (expression.charAt(i) == '}' || expression.charAt(i) == ']') {
                        return false;
                    }
                    break;
                    
                case '[':
                    if (expression.charAt(i) == ')' || expression.charAt(i) == '}') {
                        return false;
                    }
                    break;
                    
                case '{':
                    if (expression.charAt(i) == ']' || expression.charAt(i) == ')') {
                        return false;
                    }
                    break;
            }
        }
        
        return st.isEmpty();
    }
    
	public static void main (String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		int t = input.nextInt ();
		
		while (t > 0) {
		    
		    String s = input.next();
		    
		    if (balanced (s)) {
		        System.out.println ("balanced");
		    } else {
		        System.out.println ("not balanced");
		    }
		    
		    t -= 1;
		}
	}
}
