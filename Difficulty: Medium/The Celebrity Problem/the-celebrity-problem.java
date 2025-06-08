class Solution {
    public int celebrity(int mat[][]) {
        int top=0;
        int down=mat.length-1;
        
        while(top<down){
            if(mat[top][down]==1)//it means top know someone so he can not be celb.
            top++;
            else if(mat[down][top]==1)
            down--;
            else{
                top++;
                down--;
            }
            
        }
        if(top==down)//it means someone is celb
        {
            for(int i=0;i<mat.length;i++){
                if(top==i)continue;
               if(!(mat[top][i]==0 && mat[i][top]==1) )
               return -1;
            }
            
            return top;
        }
        else
        return -1;
        
    }
}