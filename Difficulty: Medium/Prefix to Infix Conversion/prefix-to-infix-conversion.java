// User function Template for Java

class Solution {
    
    static String preToInfix(String pre_exp) {
        int i=pre_exp.length()-1;
        Stack<String> st=new Stack();
        while(i>=0){
            char c=pre_exp.charAt(i);
            if(Character.isLetterOrDigit(c)){
                st.push(c+"");
            }else{
                String t1=st.pop();
                String t2=st.pop();
                String conv='('+t1 + c + t2 + ')';
                st.push(conv);
            }
            i--;
        }
        return st.peek();
    }
}
