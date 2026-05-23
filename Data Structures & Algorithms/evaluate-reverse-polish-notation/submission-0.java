class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> values = new Stack<>();
        for(String token: tokens){
            if(token.equals("+")){
                values.push(values.pop()+values.pop());
            }
            else if(token.equals("-")){
                int first=values.pop();
                int second=values.pop();
                values.push(second-first);
            }
            else if(token.equals("*")){
                values.push(values.pop()*values.pop());
            }
            else if(token.equals("/")){
                int first = values.pop();
                int second=values.pop();
                values.push(second/first);
            }
            else{
                values.push(Integer.parseInt(token));
            }

        }
        return values.peek();
    }
}
