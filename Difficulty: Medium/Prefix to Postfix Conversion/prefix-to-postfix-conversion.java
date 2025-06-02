// User function Template for Java

class Solution {
    static String preToPost(String pre_exp) {
        Stack<String> st=new Stack();
        int i=pre_exp.length()-1;
        while(i>=0){
            char c=pre_exp.charAt(i);
            if(Character.isLetterOrDigit(c)){
                st.push(c+"");
            }else{
                String t1=st.pop();
                String t2=st.pop();
                String post=t1+t2+c;
                st.push(post);
            }
            i--;
        }
        return st.peek();
        
    }
}
