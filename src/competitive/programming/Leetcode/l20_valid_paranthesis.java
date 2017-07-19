/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package competitive.programming.Leetcode;
import java.util.HashMap;
import java.util.Stack;
/**
 *
 * @author naman.agrawal
 */
public class l20_valid_paranthesis {
    
    public static boolean isValid (String s){
        HashMap<Character,Character> map = new HashMap();
        Stack<Character> st = new Stack();
        map.put(']','[');
        map.put(')','(');
        map.put('}','{');
        for (char c : s.toCharArray()){
            if (map.containsValue(c))
                st.push(c);
            if (map.containsKey(c)){
                if (st.isEmpty())
                    return false;
                char popped = st.pop();
                if (!map.get(c).equals(popped))
                    return false;
            }
        }
        return st.isEmpty();
    }
    
    public static boolean isValid_opt (String s){
        Stack<Character> stack = new Stack<>();
        for(char c:s.toCharArray()){
            if(c=='(' || c=='[' || c=='{') stack.push(c);
            else{
                if(stack.empty()) return false;
                else if(c==')'){
                    if(stack.peek()=='(') stack.pop();
                    else return false;
                }else if(c==']'){
                    if(stack.peek()=='[') stack.pop();
                    else return false;
                }else if(c=='}'){
                    if(stack.peek()=='{') stack.pop();
                    else return false;
                }
            }
        }
        return stack.empty();
    }
    
    public static boolean isValid_opt2 (String s){
        Stack<Character> st = new Stack<>();
        for(char c:s.toCharArray()){
            switch (c) {
                case '(':
                    st.push(')');
                    break;
                case '{':
                    st.push('}');
                    break;
                case '[':
                    st.push(']');
                    break;
                case ']':
                case '}':
                case ')':
                    if (st.isEmpty() || !st.pop().equals(c))
                        return false;
            }
        }
        return st.empty();
    }
    
    public static void main (String[] args){
        String s = "() (() [()])";
        System.out.println(isValid_opt2(s));
    }
    
}
