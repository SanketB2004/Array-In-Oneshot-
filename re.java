

// Reverse Array 

public class re {
    public static void main(String[] args) {
      int [] arr = {1,2,3,4,5};

// int start = 1;

// int end = arr.length-3;

// while (start < end) {
    
//      int temp = arr[start];
     
//      arr[start] = arr[end];
//      arr[end] = temp;

//      start++;
//      end--;

int start = 1;

int end = 3;

while (start < end) {
    
     int temp = arr[start];
     
     arr[start] = arr[end];
     arr[end] = temp;

     start++;
     end--;


}
for (int ele : arr)System.out.print(" " +ele);
      }
    
}