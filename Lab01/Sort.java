import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        
        int[] numbers = {12, 5, 3, 19, 8, 7, 10};
        
        Arrays.sort(numbers);
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        double average = (double) sum / numbers.length;
		
        System.out.println("Sorted Array: " + Arrays.toString(numbers));
        System.out.println("Sum of array elements: " + sum);
        System.out.println("Average of array elements: " + average);
    }
}
