package dsa_algo.data_structures;

public class Stack {

    Node head;

    public void push(int data) {
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = null;

        newNode.next = head;
        head = newNode;
        System.out.println("pushed " + newNode.data);

    }

    public void display() {
        if (head == null) {
            System.out.println("Stack is empty");
        } else {
            Node temp = head;
            while (temp != null) {
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }

    public int pop() throws Exception {
        if (head == null) {
            throw new Exception("poping from empty stack");
        } else {
            Node temp = head;
            head = head.next;
            return temp.data;
        }

    }

    public int peek() throws Exception {
        if (head == null) {
            throw new Exception("peeking from empty stack");
        } else {
            return head.data;
        }
    }

    public int getLast() throws Exception {
        Node temp = head;
        if (temp == null) {
            throw new Exception("peeking from empty stack");
        } else {
            while (temp.next != null) {
                temp = temp.next;
            }
            return temp.data;
        }
    }

    public int removeLast() throws Exception {
        Node temp = head;
        if (temp == null) {
            throw new Exception("peeking from empty stack");
        }
        if (temp.next == null) {
            Node toRemove = temp;
            temp.next = null;
            return toRemove.data;
        } else {
            while (temp.next.next != null) {
                temp = temp.next;
            }
            Node toRemove = temp.next;
            temp.next = null;
            return toRemove.data;
        }
    }


    private static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            next = null;
        }

        public Node() {
        }
    }

}
