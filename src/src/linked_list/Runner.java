package src.linked_list;

public class Runner {
    public static void main(String[] args) throws Exception {
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

        Stack stack = new Stack();
        stack.push(2);
        stack.push(6);
        stack.push(8);
        stack.push(10);
        stack.push(12);
        stack.display();


        System.out.println("Peeked " + stack.peek());
        System.out.println("popped " + stack.pop());
        System.out.println("Peeked " + stack.peek());
        System.out.println("popped " + stack.pop());
        System.out.println("Peeked " + stack.peek());
        System.out.println("Popped/removedLast " + stack.removeLast());
        System.out.println("Peeked/getLast " + stack.getLast());
        System.out.println("Peeked " + stack.peek());
    }

}
