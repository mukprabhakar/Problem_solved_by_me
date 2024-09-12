/* Given the head of a linked list, the task is to find the middle. 
For example, the middle of 1-> 2->3->4->5 is 3. If there are two middle nodes (even count), return the second middle. 
For example, middle of 1->2->3->4->5->6 is 4. */

class Node {
    int data;
    Node next;
    
    // Constructor to create a new node
    Node(int d) {
        data = d;
        next = null;
    }
}

class Solution {
    // Method to find the middle of the linked list
    int getMiddle(Node head) {
        if (head == null) {
            return -1; // Return -1 if the list is empty
        }
        
        Node slow = head;
        Node fast = head;
        
        // Move slow by 1 and fast by 2 until fast reaches the end
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        
        // slow will now be pointing to the middle node
        return slow.data; 
    }
}

public class problem61 {
    public static void main(String[] args) {
        // Creating a linked list: 1 -> 2 -> 3 -> 4 -> 5
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        
        // Create a Solution object
        Solution g = new Solution();
        
        // Get the middle of the linked list
        int middleValue = g.getMiddle(head);
        
        // Print the value of the middle node
        System.out.println("Middle node value is: " + middleValue);
    }
}
