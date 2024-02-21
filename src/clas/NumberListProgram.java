package clas;
import java.util.Scanner;


public class NumberListProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter numbers (enter 'done' to finish):");

        double[] numbers = new double[1]; 
        int count = 0;

        while (true) {
            String input = scanner.next();
            if (input.equalsIgnoreCase("done")) {
                break;
            }
            try {
                double number = Double.parseDouble(input);
                if (count == numbers.length) {
                  
                    double[] temp = new double[numbers.length * 2];
                    System.arraycopy(numbers, 0, temp, 0, numbers.length);
                    numbers = temp;
                }
                numbers[count] = number;
                count++;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number or 'done' to finish.");
            }
        }

        System.out.println("Input numbers are:");
        for (int i = 0; i < count; i++) {
            System.out.println(numbers[i]);
        }
    }
}
