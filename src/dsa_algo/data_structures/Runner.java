package dsa_algo.data_structures;

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


        Queue queue = new Queue();
        queue.enqueue(6);
        queue.enqueue(9);
        queue.enqueue(7);
        queue.enqueue(3);
        queue.enqueue(11);
        queue.enqueue(13);
        queue.display();
        queue.peek();
        queue.dequeue();
        queue.peek();
        queue.dequeue();
        queue.peek();
        queue.display();


        BinaryTree binaryTree = new BinaryTree();
        BinaryTree.Node root = binaryTree.createNewNode(2);
        root.left = binaryTree.createNewNode(7);
        root.right = binaryTree.createNewNode(5);
        root.left.left = binaryTree.createNewNode(2);
        root.left.right = binaryTree.createNewNode(6);
        root.left.right.left = binaryTree.createNewNode(5);
        root.left.right.right = binaryTree.createNewNode(11);
        root.right.right = binaryTree.createNewNode(9);
        root.right.right.left = binaryTree.createNewNode(4);

        System.out.print(" Inorder: ");
        binaryTree.inorder(root);
        System.out.println();

        System.out.print(" Preorder: ");
        binaryTree.preorder(root);
        System.out.println();

        System.out.print(" Postorder: ");
        binaryTree.postorder(root);
        System.out.println();

        BinarySearchTree binarySearchTree = new BinarySearchTree();
        BinarySearchTree.Node bstroot = null;

        bstroot = binarySearchTree.insert(bstroot, 8);
        bstroot = binarySearchTree.insert(bstroot, 3);
        bstroot = binarySearchTree.insert(bstroot, 6);
        bstroot = binarySearchTree.insert(bstroot, 10);
        bstroot = binarySearchTree.insert(bstroot, 4);
        bstroot = binarySearchTree.insert(bstroot, 7);
        bstroot = binarySearchTree.insert(bstroot, 1);
        bstroot = binarySearchTree.insert(bstroot, 14);

        binarySearchTree.inorder(bstroot);
        bstroot = binarySearchTree.delete(bstroot, 1);
        bstroot = binarySearchTree.delete(bstroot, 14);
        bstroot = binarySearchTree.delete(bstroot, 3);
        System.out.println();
        binarySearchTree.inorder(bstroot);
        System.out.println("Inorder");
        binarySearchTree.preorder(bstroot);
        System.out.println("Preorder");
        binarySearchTree.postorder(bstroot);
        System.out.println("Postorder");

        System.out.println("is Present : " + binarySearchTree.isNodePresent(bstroot, 4));


    }

}
