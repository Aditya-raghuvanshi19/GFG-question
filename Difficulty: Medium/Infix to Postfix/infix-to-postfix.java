class Solution {
    public static int precde(char c){
        if(c=='^')return 3;
        else if(c=='/' || c=='*')return 2;
        else if(c=='+' || c=='-')return 1;
        else
        return 0;
    }
    public static String infixToPostfix(String s) {
       StringBuilder ans=new StringBuilder();
       Stack<Character> st=new Stack<>();
       int i=0;
       while(i<s.length()){
           char c=s.charAt(i);
           if(Character.isLetterOrDigit(c))ans.append(c);
           else if(c=='(')st.push(c);
           else if(c==')'){
               while(!st.isEmpty() && st.peek()!='('){
                   ans.append(st.pop());
                   
               }
               st.pop();
           }
           else {
               while(!st.empty() && precde(c) <= precde(st.peek())){
                   ans.append(st.pop());
                   
               }
               st.push(c);
           }
           i++;
       }
       while(!st.isEmpty())ans.append(st.pop());
       return ans.toString();
        
    }
}