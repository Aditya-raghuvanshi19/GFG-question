class job{
    int id;
    int deadline;
    int profit;
    
    public job(int id,int deadline,int profit){
        this.id=id;
        this.deadline=deadline;
        this.profit=profit;
    }
    
}

class Solution {
   
    public ArrayList<Integer> jobSequencing(int[] deadline, int[] profit) {
        ArrayList<Integer> ans=new ArrayList();
        
        int n=profit.length;
        int totprofit=0;
        int count=0;
        
        job[] arr=new job[n];
        int maxdeadline=0;
        
        for(int i=0;i<n;i++){
            maxdeadline=Math.max(maxdeadline,deadline[i]);
            arr[i]=new job(i+1,deadline[i],profit[i]);
        }
        
        Arrays.sort(arr, (a,b)->b.profit-a.profit);//sort based on profit in decreasing order
        
        int [] hasharr=new int[maxdeadline+1];
        Arrays.fill(hasharr,-1);
        
        for(int i=0;i<n;i++){
            for(int j=arr[i].deadline;j>=1;j--){
                if(hasharr[j]==-1){
                    count++;
                    hasharr[j]=arr[i].id;
                    totprofit+=arr[i].profit;
                    break;
                    
                }
            }
        }
        
        ans.add(count);
        ans.add(totprofit);
        return ans;
        
        
    }
}