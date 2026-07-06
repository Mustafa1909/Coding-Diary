public class Reverseword {
    public static void main(String[] args) {
        String str ="Mustafa is Learning dsa daily";
        reverse(str);
    }
    public static void reverse(String str){
        StringBuilder sb = new StringBuilder();
        int start =0;
        for(int i=0;i<str.length();i++){
           
            if(str.charAt(i)==' '){
                for(int j=i-1;j>=start;j--){
                    sb.append(str.charAt(j));
                }
                sb.append(' ');
                start=i+1;
            }
            }
           for(int j=str.length()-1;j>=start;j--){
            sb.append(str.charAt(j));
           }
           System.out.println(sb);
            
        }
       
    }


