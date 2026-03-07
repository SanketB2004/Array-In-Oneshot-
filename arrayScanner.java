import java.util.Scanner;

public class arrayScanner {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] sanket = new int[8];

        // input values
        for (int i = 0; i < sanket.length; i++) {
            sanket[i] = sc.nextInt();
        }

        // print array
        for (int i = 0; i < sanket.length; i++) {
            System.out.print(sanket[i]);
        }

        // print first element
        System.out.println("First element: " + sanket[0]);

        sc.close();
    }
}