
public class AverageCalculator {
	
	public static double calculateAverage(int[] numbers) {
	    int total = 0;
	    for (int num : numbers) {
	        total += num;
	    }
	    /*total and numbers.lenght are of type integer, thus the average
	    will calculate as an integer an lose decimal precision, to solve this I have 
	    I have explicitly cast one of the operands to double before division */
	    double average = (double) total / numbers.length;
	    return average;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]data = {5,10, 20, 25};
		double result = calculateAverage(data);
		System.out.println("The average is: " + result);

	}

}
