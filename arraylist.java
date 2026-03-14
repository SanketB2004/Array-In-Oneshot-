
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
    
    //     System.out.println(arr.get(5));

    //     arr.set(5, 5000);

    //     System.out.println(arr.get(5));

    //     System.out.println(arr);

    //     int n = arr.size();

    //     for (int i = 0; i < n; i++) {
    //         System.out.print(arr.get(i)+ " ");

    //     }
    // for (int ele : arr) {
    //     System.out.print(  "\n"+ ele + " ");
    // }

    // arr.add( 45, 4555555);

   
    // array element delet 

    //arr.remove(arr.size()-1);

    System.out.println(arr);

    //Collections.reverse(arr);  // Reverse Method Of Array 

    System.out.println(arr);
int i = 0 ,  j = arr.size()-1;

 while (i<j) {
    int temp = arr.get(i);
arr.set(i, arr.get(j));

arr.set(j,temp);

i++;
j--;
}
System.out.println(arr);
    }
}// reverse arraylist
