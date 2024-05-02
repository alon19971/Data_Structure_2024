package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Queue_theory {

    public static void main(String[] args) {

        // Queue = FIFO data structure. First-in first-out
        //         A collection designed for holding elements prior to processing
        //         Linear data structure
        //         add = enqueue, offer()
        //         remove = dequeue, poll()

        // Where are queue are useful:
        // 1. Keyboard Buffer (letters should appear on the screen in the order they are passed)
        // 2. Printer queue (print jobs should be completed in order)
        // 3. used in linkedLists, priorityQueues, Breadth-first search

        Queue<String> queue = new LinkedList<String>();


        queue.offer("Karen");
        queue.offer("Chad");
        queue.offer("Steve");
        queue.offer("Harold");

        System.out.println(queue.isEmpty());               // will return false
        System.out.println(queue.peek());                  // will output the first object to be previewed
        queue.poll();                                      // will remove the first object ("Karen")
        System.out.println(queue.size());                  // will return the current size of the queue objects
        System.out.println(queue.contains("Karen"));       // will return true if the object is included in the queue

        System.out.println(queue);

    }
}
