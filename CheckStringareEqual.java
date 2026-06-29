public class CheckStringareEqual{
    public static void main(String[] args) {
        String str1 = "aab";
        String str2 ="aba";
        System.out.println(Check(str1,str2));
    }
    public static boolean Check(String str1,String str2){
        

        for(int i=0;i<str1.length();i++){
            if(str1.equals(str2)){
            return true;
        }

        char last = str1.charAt(str1.length()-1);
        str1=last+str1.substring(0, str1.length()-1);
        }
        return false;
    }

}
