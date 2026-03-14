
import java.util.ArrayList;

public class arraylist {
    public static void main(String[] args) {
        
        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(150);
        arr.add(250);
        arr.add(350);
        arr.add(450);
        arr.add(550);
        arr.add(650);
        arr.add(750);
    
        System.out.println(arr.get(5));

        arr.set(5, 5000);

        System.out.println(arr.get(5));

        System.out.println(arr);

        int n = arr.size();

        for (int i = 0; i < n; i++) {
            System.out.print(arr.get(i)+ " ");

        }
    for (int ele : arr) {
        System.out.print(  "\n"+ ele + " ");
    }

    arr.add( 45, 4555555);

   
    

    

    }
}
