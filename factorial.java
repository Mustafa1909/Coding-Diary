public class factorial{//basic recurrsion problems
    public static void main(String[] args) {
        int result = factorial(5);
        System.out.println(result);
        
    }
    public static int factorial(int n){
        if (n==0){
            return 1;
        }
        int fnm1 = factorial(n-1);
        int fact = n * fnm1;


        return fact;
    } 
  
    

}