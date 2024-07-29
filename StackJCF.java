
import java.util.*;
public class StackJCF {
    public static void pushatBottom(Stack<Integer> s,int data){
        if (s.isEmpty()) {//base case 
            s.push(data);
            return;
        }
        int top=s.pop();//remove
        pushatBottom(s, data);//fxn call for smaller problem
        s.push(top);//add 
    }
    public static String reverseStr(String str){
        Stack<Character> s=new Stack<>();
        int idx=0;
        while (idx<str.length()) {
            s.push(str.charAt(idx));
            idx++;
        }
        StringBuilder result=new StringBuilder("");
        while (!s.isEmpty()) {
            result.append(s.pop());
        }
        return result.toString();
    }
    public static void reverseStack(Stack<Integer>s){
        if(s.isEmpty())return;
        int top=s.pop();
        reverseStack(s);
        pushatBottom(s, top);
    }
    public static void printStack(Stack<Integer>s){
        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }
    public static void main(String[] args) {
         Stack<Integer> s=new Stack<>();
         s.push(1);
         s.push(2);
         s.push(3);
        // pushatBottom(s,4);
        reverseStack(s);
        // String str="Hello World";
        // String res=reverseStr(str);
        // System.out.println(res);
        printStack(s);
    }
}
