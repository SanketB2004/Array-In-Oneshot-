public class passingArrayToMethod {
    public static void main(String[] args) {
        
        int x[] = {10,3,45,38};
      change(x);
      System.out.println(x[2]);  
    }
    public static void change(int[] y){  //referance variable 
        y[2] = 20;
        
    }
}
