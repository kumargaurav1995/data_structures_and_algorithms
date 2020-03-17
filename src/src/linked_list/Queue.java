package src.linked_list;

public class Queue {

    Node front, rear;

    public int dequeue() {

        Node temp = front;
        front = front.next;
        System.out.println(temp.data);
        return temp.data;

    }

    public void enqueue(int data) {
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = null;
        if (front == null && rear == null) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = rear.next;
        }
    }

    public void display() {
        Node temp = front;
        if (front == null && rear == null) {
            System.out.println("No data");
        } else {
            while (temp != null) {
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }

    public void peek() {
        if (front == null && rear == null) {
            System.out.println("No data");
        } else {
            System.out.println(front.data);
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
