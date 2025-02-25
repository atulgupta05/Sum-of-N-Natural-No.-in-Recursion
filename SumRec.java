package Recursion;

public class SumRec {

    // Recursive method to calculate the sum of natural numbers
    public static int sumOfNaturalNumbers(int n) {
        // Base case: if n is 0, return 0
        if (n == 0) {
            return 0;
        }
        // Recursive case: n + sum of (n - 1)
        return n + sumOfNaturalNumbers(n - 1);
    }

    public static void main(String[] args) {
        int number = 5; // You can change this value for testing
        int result = sumOfNaturalNumbers(number);
        System.out.println("Sum of first " + number + " natural numbers is: " + result);
    }
}
