package src;

public class Runner {
    public static void main(String[] args) {
        Linkedlist ll = new Linkedlist();
        ll.insert(10); // 0
        ll.insert(20); // 1
        ll.insert(70); // 2
        ll.insert(70);
        ll.insert(75); // 3
        ll.insert(100); // 4
        ll.deleteAtIndex(2);
        System.out.println(ll.length());
        ll.middleElem();
        System.out.println(ll.search(0));
        ll.removeDuplicate();
        ll.print();
    }
}
