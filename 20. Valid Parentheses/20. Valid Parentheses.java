class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();

        if(s.length() % 2 == 0) {
            for(char c : s.toCharArray()){
                if(c == '(' || c == '{' || c == '['){
                    stack.push(c);
                }
                else if(c == ')' && !stack.isEmpty() && stack.peek() == '(')
                {
                    stack.pop();
                }
                else if(c == '}' && !stack.isEmpty() && stack.peek() == '{')
                {
                    stack.pop();
                }
                else if(c == ']' && !stack.isEmpty() && stack.peek() == '[')
                {
                    stack.pop();
                }
                else return false;
            }
        }else return false; 

        return stack.isEmpty();
    }
}