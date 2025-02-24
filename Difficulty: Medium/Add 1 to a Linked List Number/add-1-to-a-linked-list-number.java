//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}

class GfG {
    public static void printList(Node node) {
        while (node != null) {
            System.out.print(node.data);
            node = node.next;
        }
        System.out.println();
    }

    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String str[] = read.readLine().trim().split(" ");
            int n = str.length;
            Node head = new Node(Integer.parseInt(str[0]));
            Node tail = head;
            for (int i = 1; i < n; i++) {
                tail.next = new Node(Integer.parseInt(str[i]));
                tail = tail.next;
            }
            Solution obj = new Solution();
            head = obj.addOne(head);
            printList(head);
        
System.out.println("~");
}
    }
}
// } Driver Code Ends


/*
class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}
*/

class Solution {
    int findsum(Node temp){
        if(temp==null)//this is the base condition to break the loop and the rerturn carry as one to add for the furhter upper node 
        return 1;
        
        int carry=findsum(temp.next);//call the recusion for the next node till reaches null
        temp.data=temp.data+carry;//add carry in the node data, initial carry will be 1 because we are adding 1 in the  node
        if(temp.data<10)//because at max the sum goes to 10 ,if sum is less than 10 there is not carry
        return 0;
        else{
            temp.data=0;//if sum 10 , set it as -0- pass carry 1
            return 1;
        }
        
    }
    public Node addOne(Node head) {
        //this can be do with reverse than add and than reverse ,return the head.take tc.=3n,,we wnat to do it in tc=n that is why this for help go tot he vide
        //this is the recursion and abcktracing based problem
        
        if(head==null)
        return null;
        
        int carry=findsum(head);//at the last this function go return carry either 1 or 0 
        if(carry==1){//if 1 create a new node for that 1 ex.999+1=1000 all 3 node already occupy 0 the only 1 need a new node
            Node carrynode=new Node(1);
            carrynode.next=head;
            head=carrynode;
        }
        return head;
    }
}
