import java.util.LinkedList;

public class Linkedlist2 {
    public static void main(String[] args) {
        // Create a LinkedList of Integers
        LinkedList<Integer> numbers = new LinkedList<>();

       
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println("Sum of all numbers: " + sum);

                int max = numbers.getFirst();
        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
        }
        System.out.println("Maximum number: " + max);

        
        numbers.remove(2); 

        
        System.out.println("Remaining elements in the LinkedList:");
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
