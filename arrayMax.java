public class arrayMax {
    public static void main(String[] args) {

        int[] arr = {1,58,6,4,88,97,102,81,82,83};

        int max = arr[0];   // start with first element

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("Maximum element: " + max);
    }
}