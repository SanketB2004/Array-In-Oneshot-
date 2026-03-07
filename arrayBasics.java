
import java.util.Scanner;

// 

public class arrayBasics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    //     int[] sanket = {1,2,5,6,7,6,};// First method array make

    //     System.out.println(sanket[0]);// first method inisilazation

    //  // updating element 
    //  sanket[0]=89;
    //  System.out.println(sanket[0]);

//      int[] arr = new int[4]; // four size array and this index is 0 to 3

//      arr[0]= 10;
//      arr[1]= 100;
//      arr[2]= 1000;
//      arr[3]= 10000;
// for (int i = 0; i <=arr.length; i++) {
//     System.out.println(arr[i]);
// }
    // input in defult array 
int[] sanket = new int[8];

        // input values
        for (int i = 0; i <= sanket.length; i++) {
            sanket[i] = sc.nextInt();
        }

        // print array
        for (int i = 0; i <= sanket.length; i++) {
            System.out.println(sanket[i]);
        }
System.out.println(sanket[0]);
        
    }
}