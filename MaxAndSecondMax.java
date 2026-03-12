public class MaxAndSecondMax {
    public static void main(String[] args) {

        int[] arr = {1,58,6,4,88,97,102,81,82,83};

        int max = arr[0];
        int secondMax = arr[0];

        // Find maximum
        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > max) {
                max = arr[i];
            }
        }

        // Find second maximum
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > secondMax && arr[i] != max) {
                secondMax = arr[i];
            }
        }

        System.out.println("Maximum element: " + max);
        System.out.println("Second Maximum element: " + secondMax);
    }
}