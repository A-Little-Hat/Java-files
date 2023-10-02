public class PalindromeLL {

    // Represent a node of the singly linked list
    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Represent the head and tail of the singly linked list
    public Node head = null;

    // Add a node to the end of the list
    public void addNode(int data) {
        // Create a new node
        Node newNode = new Node(data);

        if (head == null) {
            // If the list is empty, set the new node as both head and tail
            head = newNode;
        } else {
            // Otherwise, find the current tail and update its next pointer
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Reverse the linked list and return the new head
    public Node reverseList(Node head) {
        Node prev = null;
        Node current = head;
        while (current != null) {
            Node next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

    // Check if the linked list is a palindrome
    public boolean isPalindromeLL() {
        if (head == null || head.next == null) {
            // An empty list or a list with a single element is a palindrome
            return true;
        }

        // Use the slow and fast pointers technique to find the middle of the list
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Reverse the second half of the list
        Node reversedSecondHalf = reverseList(slow);

        // Compare the first half and reversed second half
        Node firstHalf = head;
        while (reversedSecondHalf != null) {
            if (firstHalf.data != reversedSecondHalf.data) {
                return false;
            }
            firstHalf = firstHalf.next;
            reversedSecondHalf = reversedSecondHalf.next;
        }

        return true;
    }

    // Display the linked list
    public void display() {
        Node current = head;
        if (current == null) {
            System.out.println("List is empty");
            return;
        }
        System.out.println("Nodes of singly linked list:");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        PalindromeLL sList = new PalindromeLL();

        // Add nodes to the list
        sList.addNode(1);
        sList.addNode(2);
        sList.addNode(3);
        sList.addNode(2);
        sList.addNode(1);

        sList.display();

        // Check if the list is a palindrome
        boolean isPalindrome = sList.isPalindromeLL();
        if (isPalindrome) {
            System.out.println("Given singly linked list is a palindrome");
        } else {
            System.out.println("Given singly linked list is not a palindrome");
        }
    }
}
