package MahatTest_01;

import java.util.LinkedList;
import java.util.Queue;

public class Question_02 {
    public static void main(String[] args) {

        // LinkedList class, implement Queue interface class
        // The generic representation of the Queue interface is:
        // public interface Queue<T> extends Collection<T>

        // Create a Queue using LinkedList
        Queue<Integer> queue = new LinkedList<>();

        // Insert elements into the queue
        // Offer is preferred over 'add()' for Queue operations
        // because it does not throw exceptions when the capacity is restricted.
        // Good practice for code that might later switch to a capacity-restricted Queue.

        queue.offer(2); // Rear - first to be removed
        queue.offer(5);
        queue.offer(5);
        queue.offer(7);
        queue.offer(2);
        queue.offer(4);
        queue.offer(1);
        queue.offer(3);
        queue.offer(2);
        queue.offer(5);
        queue.offer(5);
        queue.offer(1); // Front -  last to be removed


        Queue<Integer> fileredQueue = filterQueue(queue);
        System.out.println(fileredQueue);


    }

    // Function that receives Queue of Integers.
    // the values in the Queue are not sorted and can be appeared several times.
    // the function will return a new Queue that includes
    // only the values that appears more than twice

    // for Example:
    // for the following array - [2, 5, 5, 7, 2, 4, 1, 3, 2, 5, 5, 1]
    // the function will return a new Queue of [2, 5]
    public static Queue<Integer> filterQueue(Queue<Integer> q) {
        // LinkedList Allows us to use methods which are crucial for this implementation.
        // LL is chosen because it provides efficient removals and insertions.
        LinkedList<Integer> tempList = new LinkedList<>(q);     // LinkedList that gets the Queue 'q'
        Queue<Integer> resultQueue = new LinkedList<Integer>(); // empty Queue for storage later

        while (!tempList.isEmpty()) {
            int element = tempList.getFirst();
            int count = 0;

            // Iterate through tempList to count occurrences of element
            for (int i = 0; i < tempList.size(); i++) {
                if (tempList.get(i).equals(element)) {
                    count++;
                }
            }

            // If element occurs more than twice and is not already in resultQueue
            // add to resultQueue
            if (count > 2 && !resultQueue.contains(element)) {
                resultQueue.offer(element);
            }

            // Remove all occurrences of the element from tempList
            tempList.removeIf(n -> n.equals(element));
        }

        return resultQueue;
    }


}
