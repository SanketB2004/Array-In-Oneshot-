// Search array
public class Search {
    
    public static void main(String[] args) {

        boolean found = false;
        int x[] = {1,5,8,9,78,45,788,413,25};
        int a = 5;

        for (int i = 0; i < x.length; i++) {

            if (x[i] == a) {
                System.out.println("Number found: " + a);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Your chosen number is not in this array. Try another number.");
        }
    }
}