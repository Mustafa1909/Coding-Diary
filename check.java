public class check {
    public static void main(String[] args) {
        String str1 = "MUST";
        String str2 ="TMUS";
        System.out.println(checkVa(str1, str2));
        
    }
    public static boolean checkVa(String str1,String str2){
    
       
        
            if(str1.length() != str2.length()){
                return false;
            }
        
            for(int i=0;i<str1.length();i++){
                if(str1.equals(str2)){
                    return true;
                }
                StringBuilder sb = new StringBuilder();
                for(int k=1;k<str1.length();k++){
                    sb.append(str1.charAt(k));
                }
                sb.append(str1.charAt(0));
                str1=sb.toString();


               
            }
            return false;
           
          

    }
}
