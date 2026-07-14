public class Calculator{
    public static void main(String args[]){
        double a = 7;
        double b = 3;
        char oper = '-';
        String again ="y";
        double result=0;

        while(again=="y"){
            if(oper == '+'){
                result=a+b;
            }else if(oper =='-'){
                result = a-b;
            }else if(oper=='*'){
                result =a*b;
            }else{
                if(b ==0){
                    System.out.println("Cannot be divided by zero");
                }
            }
            again = "n";
        }
        System.out.println("Result : "+result);
        System.out.println("Thank you for using Calculator");
    }
}