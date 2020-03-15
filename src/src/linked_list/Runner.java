package src.linked_list;

public class Runner {
    public static void main(String[] args) {
//        System.out.println("hello world");
        LinkedList linkedList = new LinkedList();
        linkedList.insert(4);
        linkedList.insert(6);
        linkedList.insert(2);
        linkedList.insertAtstart(55);
        linkedList.insertAtLast(34);
        linkedList.insertAt(2, 47);
        linkedList.insertAt(0, 66);
        linkedList.deleteAt(1);
        linkedList.display();
    }

}
