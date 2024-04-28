package LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {

        // Create nodes
        Node<Integer> node1 = new Node<>(10);
        Node<Integer> node2 = new Node<>(20);
        Node<Integer> node3 = new Node<>(30);

        // Linking nodes
        node1.setNext(node2);
        node2.setNext(node3);

        // Display the list
        System.out.println("Linked List:");
        node1.print();

        // Testing the getters
        System.out.println("Value of node1: " + node1.getValue());
        System.out.println("Value of node2: " + node2.getValue());
        System.out.println("Value of node3: " + node3.getValue());

        // Testing hasNext
        System.out.println("Does node1 have next? " + node1.hasNext());
        System.out.println("Does node2 have next? " + node2.hasNext());
        System.out.println("Does node3 have next? " + node3.hasNext());

        // Add a new node after node3
        Node<Integer> node4 = new Node<>(40);
        node3.setNext(node4);

        // Display the updated list
        System.out.println("Updated Linked List:");
        node1.print();

        System.out.println(node1.getNext());


    }
}

