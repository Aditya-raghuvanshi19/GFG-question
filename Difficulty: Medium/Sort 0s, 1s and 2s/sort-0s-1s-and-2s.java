class Solution {
    public void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public void sort012(int[] arr) {
        
// 0 range: 0..i-1 → [0, 0]

// 1 range: i..j-1 → [1, 1]

// Unprocessed: j..k → (empty now)

// 2 range: k+1..n-1 → [2, 2]
        int i=0;
        int j=0;
        int k=arr.length-1;
        
        while(j<=k){
            if(arr[j]==0){
                swap(arr,i,j);
                i++;
                j++;
            
            }
            else if(arr[j]==2){
               swap(arr,j,k);
               k--;
               
            }else
            j++;
        }
        
    }
}