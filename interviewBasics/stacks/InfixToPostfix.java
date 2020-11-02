/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
    static boolean isOperand (char ch) {
        
        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') || (ch >= '0' && ch <= '9')) {
            return true;
        }
        
        return false;
    }
    
    static boolean isOperator (char ch) {
        
        if (ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '^') {
            return true;
        }
        
        return false;
    }
    
    static int precedence (char ch) {
        
        if (ch == '^') {
            return 5;
        }
        
        if (ch == '/' || ch == '*') {
            return 4;
        }
        
        if (ch == '+' || ch == '-') {
            return 3;
        }
        
        return 0;
    }
    
    static StringBuilder toPostfix (String infix) {
        
        Stack<Character> st = new Stack<Character> ();
        StringBuilder output = new StringBuilder ();
        
        for (int i = 0; i < infix.length(); ++i) {
            
            char ch = infix.charAt(i);
            
            if (isOperand (ch)) {
                output.append(ch);
            } else if (isOperator (ch)) {
                // char x = 'a';
                while (st.isEmpty() == false && precedence(st.peek()) >= precedence(ch)) {
                    output.append(st.pop());
                }
                
                st.push(ch);
            } else if (ch == ')') {
                // char x = 'a';
                
                while (st.isEmpty() == false && (st.peek() != '(')) {
                    output.append(st.pop());
                }
                
                st.pop();
            } else if (ch == '(') {
                st.push(ch);
            }
        }
        
        while (st.empty() == false) {
            output.append(st.pop());
        }
        
        return output;
    }
    
	public static void main (String[] args) {
	
	    Scanner input = new Scanner (System.in);
	    
	    int t = input.nextInt();
	    
	    while (t > 0) {
	        
	        String infix = input.next();
	        
	        System.out.println (toPostfix(infix));
	        
	        t -= 1;
	    }
	}
}
