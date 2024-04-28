
public class Node<E> {

    public E value;      // Stores the data
    public Node<E> next;  // Reference to the next Node in the list.

    // Constructor to initialize a Node with only a 'value', next is set to null.
    public Node(E value) {
        this.value = value;
        this.next = null;
    }

    // Constructor to initialize a Node with a value and a reference to the next Node.
    public Node(E value, Node<E> next) {
        this.value = value;
        this.next = next;
    }

    // ------Getters and Setters------

    // Retrieves the value of this node.
    public E getValue() {
        return value;
    }


    // Sets the value of this node
    public void setValue(E value) {
        this.value = value;
    }


    // Retrieves the reference to the next node
    public Node<E> getNext() {
        return next;
    }


    // Sets the reference to the next node
    public void setNext(Node<E> next) {
        this.next = next;
    }


    // Returns true if there is a next node linked to this node
    public boolean hasNext() {
        return next != null;
    }


    // Returns the string representation of the node's value
    @Override
    public String toString() {
        return this.value.toString();
    }


    // Recursively prints the node and its successors in the list
    public void print() {
        System.out.print(this.value + " -> ");
        if (this.next == null)
            System.out.print(null + "\n");
        else this.next.print();
    }

}


