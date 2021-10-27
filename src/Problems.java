package src;

import java.util.HashSet;
import java.util.Set;

class Problems {

    // using hashset data structure to store every element of first node
    // then on second pass in linked list compare the element with hashmar data,
    // if element exists return value as intersection element

    Node intersectionPoint(Node node1, Node node2) {
        if (node1 == null || node2 == null) {
            return null;
        }

        Set<Node> nodeSet = new HashSet<>();
        Node tempA = node1;
        while (node1.next != null) {
            nodeSet.add(tempA);
            tempA = tempA.next;
        }

        Node tempB = node2;
        while (tempB != null) {
            if (nodeSet.contains(tempB)) {
                return tempB;
            }
            tempB = tempB.next;
        }
        return null;
    }

    boolean detectLoop(Node head) { // using slow - fast pointer method
        // method slow-fast pointer technique

        if (head == null || head.next == null) {
            return false;
        }

        Node slow = head;
        Node fast = head.next;

        while (slow != fast) {
            if (fast == null || fast.next == null) {
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;

        }
        return true;
    }

}