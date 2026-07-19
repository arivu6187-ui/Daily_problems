package day18;
public class LinkedList {
    // 1. Define a custom Node structure
    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public Node findMiddle(Node head) {
        if (head == null) {
            return null;
        }
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;       // Moves 1 step
            fast = fast.next.next;  // Moves 2 steps
        }
        return slow;
    }
}

