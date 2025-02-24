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


// } Driver Code Ends
// User function Template for Java

/*
class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
        next = null;
    }
}
*/
class Solution {
    // Function to sort a linked list of 0s, 1s and 2s.
    static Node segregate(Node head) {
        
        if(head==null||head.next==null)
        return head;
        
      Node dummy0=new Node(-1);
      Node temp0=dummy0;
      
      Node dummy1=new Node(-1);
      Node temp1=dummy1;
      Node dummy2=new Node(-1);
      Node temp2=dummy2;
      
      Node temp=head;
      while(temp!=null){
          if(temp.data==0){
              temp0.next=temp;
              
              temp0=temp0.next;
          }else if(temp.data==1){
              temp1.next=temp;
             
              temp1=temp1.next;
          }else{
               temp2.next=temp;
             
              temp2=temp2.next;
          }
         temp=temp.next; 
      }
      
      temp0.next=(dummy1.next!=null)?dummy1.next:dummy2.next;
      temp1.next=dummy2.next;
  
      temp2.next=null;
      
      return dummy0.next;
    }
}


//{ Driver Code Starts.

class GFG {
    public static void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());

        while (t-- > 0) {
            List<Integer> arr = new ArrayList<>();
            String input = br.readLine().trim();
            StringTokenizer st = new StringTokenizer(input);
            while (st.hasMoreTokens()) {
                arr.add(Integer.parseInt(st.nextToken()));
            }

            Node head = null;
            if (!arr.isEmpty()) {
                head = new Node(arr.get(0));
                Node tail = head;
                for (int i = 1; i < arr.size(); i++) {
                    tail.next = new Node(arr.get(i));
                    tail = tail.next;
                }
            }
            head = new Solution().segregate(head);
            printList(head);
        }
    }
}
// } Driver Code Ends