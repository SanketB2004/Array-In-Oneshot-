
public class TwoSum {
    public static void main(String[] args) {
        
        int[] arr1 = {1,88,1,4,5,6,7,8,9,10};
        int target = 2;

        for (int i = 0; i < arr1.length; i++) {

            for (int j = i + 1; j < arr1.length; j++) {

                if (arr1[i] + arr1[j] == target) {
                    System.out.println("True");
                }

            }
        }
    }
}
                
          