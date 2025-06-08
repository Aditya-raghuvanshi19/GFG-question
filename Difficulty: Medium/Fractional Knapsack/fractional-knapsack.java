class Items{
    int val;
    int weight;
    double ratio;
    
    public Items(int val,int weight){
        this.val=val;
        this.weight=weight;
        this.ratio=(double)val/weight;
    }
}
class Solution {
    
    double fractionalKnapsack(int[] values, int[] weights, int W) {
        double total=0;
        int n=values.length;
        Items[] item=new Items[n];
        
        // Create array of Item objects
        for(int i=0;i<n;i++){
            item[i]=new Items(values[i],weights[i]);
        }
        
         // Sort items by value-to-weight ratio in descending order
        Arrays.sort(item , (a,b)-> Double.compare(b.ratio,a.ratio));
        
        for(int i=0;i<n;i++){
            if(W >= item[i].weight){
                // Take full item
                total+=item[i].val;
                W-= item[i].weight;
            }
            else{
                // Take fractional part

                total += item[i].ratio * W;
                break;
            }
        }
        
        return total;
    }
} 