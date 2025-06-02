// User function Template for Java

class Solution {
    static String postToInfix(String exp) {
        int i=0;
        Stack<String> st=new Stack<>();
        while(i<exp.length()){
            char c=exp.charAt(i);
            if(Character.isLetterOrDigit(c)){
                st.push(c+"");                
            }else{
                String t1=st.pop();
                String t2=st.pop();
                String conv='(' + t2 + c + t1 + ')';
                st.push(conv);
            }
            i++;
        }
        return st.peek();
        
    }
}
