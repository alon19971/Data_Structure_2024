package Stack;

import java.util.Stack;

public class Stack_theory {

    public static void main(String[] args) {

        // Stack = LIFO data structure. Last-in First-out
//         stores objects into a sort of "vertical tower"
//         push() to add to the top
//         pop() to remove from the top
//         peek() to take a look on the top without removing the object
//         search() get the serial number of the object in the stack
//         isEmpty() true if the stack is empty / false if not

        Stack<Integer> st = new Stack<Integer>();
        st.push(1);  //1
        st.push(2);  //2
        st.push(3);  //3
        st.push(4);  //4

        System.out.println(checkOddSum(st));

    }

    private static boolean checkOddSum(Stack<Integer> st) {
        int oddSumNumber = 0;
        int oddSumIndexes = 0;

        for (int i = 0; i < st.size(); i++) {
            int num = st.get(i);

            if (i % 2 == 0) {
                oddSumIndexes += num;
            }
            if (num % 2 == 1) {
                oddSumNumber += num;
            }
        }

        return oddSumIndexes == oddSumNumber;
    }
}
