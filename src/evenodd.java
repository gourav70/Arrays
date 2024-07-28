//User function Template for Java

import java.util.ArrayList;
import java.util.*;
import java.util.Arrays;

public class evenodd {
    // Function to split the list into even and odd numbers
    public static ArrayList<ArrayList<Integer>> evenOdd(ArrayList<Integer> numbers) {
        ArrayList<Integer> evenNumbers = new ArrayList<>();
        ArrayList<Integer> oddNumbers = new ArrayList<>();

        for (Integer number : numbers) {
            if (number % 2 == 0) {
                evenNumbers.add(number);
            } else {
                oddNumbers.add(number);
            }
        }

        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        result.add(evenNumbers);
        result.add(oddNumbers);

        return result;
    }

    public static void main(String[] args) {
        // Example usage:
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        ArrayList<ArrayList<Integer>> result = evenOdd(numbers);

        System.out.println("Even Numbers: " + result.get(0));
        System.out.println("Odd Numbers: " + result.get(1));
    }
}
