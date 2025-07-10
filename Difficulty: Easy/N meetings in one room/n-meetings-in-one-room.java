class meeting{
    int start;
    int end;
    int pos;
    
    public meeting(int s,int e,int p){
        this.start=s;
        this.end=e;
        this.pos=p;
    }
}
class Solution {
    // Function to find the maximum number of meetings that can
    // be performed in a meeting room.
    public int maxMeetings(int start[], int end[]) {
        meeting [] arr=new meeting[start.length];
        
        for(int i=0;i<start.length;i++){
            arr[i]=new meeting(start[i],end[i],i+1);//1 based numbering
        }
        
        Arrays.sort(arr, (a,b)-> a.end-b.end);//based on end value in incresing order so that on choosing the meetind which done fast we can perform more meetings so prefer to choose short span meetings.
        
        int count=1, freetime=arr[0].end;//freetime is to store the last meeting end time
        
        ArrayList<Integer> order=new ArrayList();//this is for extra step and store oder in which meeting held . Follow up question for interview
        order.add(arr[0].pos);
        
        for(int i=0;i<arr.length;i++){
            if(arr[i].start>freetime){
                count++;
                freetime=arr[i].end;
                order.add(arr[i].pos);
            }
        }
        
        return count;
        
    }
}
