package src;

public class Linkedlist {

    Node head;

    // method to insert a node at start when head is empty , if head is not empty,
    // add node at the end position
    void insert(int data) {
        Node node = new Node();
        node.data = data;
        node.next = null;
        if (head == null) {
            head = node;
        } else {
            Node n = new Node();
            n = head;
            while (n.next != null) {
                n = n.next;
            }
            n.next = node;
        }

    }

    // method to print all the node in sigly linked list
    void print() {
        Node n = new Node();
        n = head;

        while (n.next != null) {
            System.out.println(n.data);
            n = n.next;
        }
        System.out.println(n.data);
    }

    // method to add a node at the first position of a linked list
    void insertAtFirst(int data) {
        Node node = new Node();

        node.data = data;
        node.next = null;
        node.next = head;
        head = node;

    }

    // insert a node at the specified index position
    void insertAtIndex(int index, int data) {

        if (index == 0) {
            insertAtFirst(data);
        } else {

            Node node = new Node();
            node.data = data;
            node.next = null;

            Node n = head;
            for (int i = 0; i < index - 1; i++) {
                n = n.next;
            }

            node.next = n.next;
            n.next = node;

        }

    }

    // method to delete a node by specifing the index postion of a linked list
    void deleteAtIndex(int index) {
        if (index == 0) {
            head = head.next;
        } else {
            Node n = head;
            Node n1 = null;
            for (int i = 0; i < index - 1; i++) {
                n = n.next;
            }
            n1 = n.next;
            n.next = n1.next;
            n1 = null;
        }

    }

    // methods to return the lenght of a singly linked list
    int length() {

        int len = 0;
        if (head == null) {
            len = 0;
        } else {
            Node n = head;
            while (n.next != null) {
                n = n.next;
                len++;
                // System.out.println(len);
            }
            len = len + 1;

        }
        return len;
    }

    // find the middle element of a singly linked list
    void middleElem() {
        int end = length();
        int mid = end / 2;
        Node n = head;
        for (int i = 0; i < mid; i++) {
            n = n.next;
        }
        System.out.println(n.data);

    }

    // search an element in singly linkded list
    boolean search(int elem) {
        boolean ans = false;
        Node n = head;

        while (n.next != null) {
            if (n.data == elem) {
                ans = true;
            }
            n = n.next;

        }
        if (n.data == elem) {
            ans = true;
        }
        return ans;

    }

    Node removeDuplicate() {

        Node node = head;
        while (node != null && node.next != null) {
            if (node.data == node.next.data) {
                node.next = node.next.next;
            } else {
                node = node.next;
            }
        }

        return node;
    }

    // runner code is available in Runner.java file
}
