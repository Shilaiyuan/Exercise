package leetcode;

import java.util.Stack;

public class offer04 {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void puah(int node){
        stack1.push(node);
    }

    public int pop(){
        if (stack2.size() <=0){
            while(stack1.size() !=0){
                stack2.push(stack2.pop());
            }
        }
        return stack2.pop();
    }
}
