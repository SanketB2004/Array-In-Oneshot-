public class MissingNumberl {
    public static void main(String[] args) {
        // Example: numbers 1 ते 8, पण 6 missing
        int n = 8;
        int[] arr = {1, 2, 3, 4, 5, 7, 8};

        // Step 1: expected total sum
        int total = n * (n + 1) / 2;

        // Step 2: sum of array elements
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }

        // Step 3: missing number
        int missing = total - sum;

        System.out.println("Missing Number: " + missing);
    }
}