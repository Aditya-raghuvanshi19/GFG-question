class Solution {
    public void swap(int[][] arr , int i,int j){
        int temp=arr[i][j];
        arr[i][j]=arr[j][i];
        arr[j][i]=temp;
    }
    public void rotateMatrix(int[][] mat) {
        
        //first we find the transpose of the matrix and reliase that the output is swap of rows of a column
        int n=mat.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                swap(mat,i,j);
            }
        }
        
        for(int i=0;i<n/2;i++){
            for(int j=0;j<n;j++){//go till each elemnt of row array
                int temp=mat[i][j];
                mat[i][j]=mat[n-1-i][j];
                mat[n-1-i][j]=temp;
            }
        }
        
    }
}