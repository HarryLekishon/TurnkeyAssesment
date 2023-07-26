import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MaximumDifference {
    
	public static int maxDifference(List<Integer> numbers) {
        if (numbers == null || numbers.size() < 2) {
            return 0;
        }

        int minElement = Integer.MAX_VALUE;
        int maxElement = Integer.MIN_VALUE;

        // Find the minimum and maximum elements in the list
        for (int num : numbers) {
            if (num < minElement) {
                minElement = num;
            }
            if (num > maxElement) {
                maxElement = num;
            }
        }

        // Calculate the difference between the maximum and minimum elements
        int maxDifference = maxElement - minElement;

        return maxDifference;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);
	        List<Integer> numbers = new ArrayList<>();

	        System.out.println("Enter the number of elements in the list:");
	        int numElements = scanner.nextInt();

	        System.out.println("Enter " + numElements + " integers:");
	        for (int i = 0; i < numElements; i++) {
	            int num = scanner.nextInt();
	            numbers.add(num);
	        }

	        scanner.close();
	        
	        System.out.println(maxDifference(numbers));

	}

}
