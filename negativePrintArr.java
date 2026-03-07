public class negativePrintArr {
    public static void main(String[] args) {
        
int[] arr = {1,2,3,4,5,-9,-8,-7,12,45,-78,75,64,-6,-7};

for (int i = 0; i <= arr.length; i++) {
    if(arr[i] < 0){
        System.out.println(arr[i]);
    }
}
         
    }
}
