import java.util.Scanner;

public class Fibonacci {
	 // Method to get and validate user input
    private static int getUserInput(Scanner scanner) {
        int inputNumber;
        while (true) {
            try {
                System.out.print("Enter a positive integer: ");
                inputNumber = Integer.parseInt(scanner.nextLine());
                if (inputNumber < 1) {
                    throw new IllegalArgumentException();
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a positive integer.");
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid input. Please enter a positive integer greater than 0.");
            }
        }
        return inputNumber;
    }
    // Method to calculate the nth Fibonacci number iteratively
    private static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        //initialize prev and current to 1 and 0 since fib sequence starts with 1
        int prev = 0;
        int current = 1;
        /*use a loop that iterates  from 2 to n and calulate next fibnumber
        by adding prev and current and update prev to current and current to next
        return value of current as as the nth fib number*/
        for (int i = 2; i <= n; i++) {
            int next = prev + current;
            prev = current;
            current = next;
        }
        return current;
    }

	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

        // Ask the user for input and validate it
        int inputNumber = getUserInput(scanner);

        // Generate and print the Fibonacci sequence
        System.out.println("Fibonacci Sequence up to " + inputNumber + ":");
        for (int i = 0; i <= inputNumber; i++) {
            System.out.print(fibonacci(i) + " ");
        }
	}
}
