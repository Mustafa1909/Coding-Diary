public class print {
    public static void main(String[] args) {
        print(5);
        
    }
    public static void print(int n){
        if (n==0){
            return;
        }
        
          print(n-1);//1 to n as it runs until the base case then it prints 
        System.out.print(n+" "); 
       // // print(n-1);//n to 1 as it first prints then check the base case
    }
    
}
