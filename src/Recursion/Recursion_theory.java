package Recursion;

public class Recursion_theory {

    public static void main(String[] args) {

        // Definition:
        // A function that calls herself in order to
        // help to solve a big problem by solving
        // small problem within a big problem


    }

    // A function that prints recursively
    public static void print(int n) {
        if (n == 0) {
            System.out.println("N= " + n + " We stopped!");
        } else {
            System.out.println("N= " + n + " We are in the loop!");
            print(n - 1);
        }
    }


    // A function that execute sum
    // of the number until the given number in recursive way
    public static int sum(int n) {
        if (n < 1) {
            return 0;
        } else {
            return n + sum(n - 1);
        }
    }


    // A function to calculate factorial of a number
    public static int fact(int n) {
        if (n == 0)
            return 1;
        else {
            return n * fact(n - 1);
        }
    }


    // A function that returns the value in the Fibonacci series
    public static int fibonacci(int n) {
        if (n <= 1)  // stopping condition
            return 1;

        if (n == 2)  // stopping condition
            return 1;

        return fibonacci(n - 1) + fibonacci(n - 2);   // recursion function calling

    }

    // A function that calculate factorial only of odd numbers
    public static int oddFact(int n) {
        if (n == 1)
            return 1;
        else if (n % 2 == 1)
            return oddFact(n - 1) * n;
        else
            return oddFact(n - 1);
    }


}
