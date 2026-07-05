public class DuplicateS{
    public static void main(String[] args) {
        String str = "aabbccdd";
    
       

        for(int i=0;i<str.length();i++){
            boolean isDu=false;
            for(int j=0;j<i;j++){
                if(str.charAt(i)==str.charAt(j)){
                    isDu=true;
                    break;
                }
            }
            if(isDu){
                continue;
            }
            StringBuilder sb = new StringBuilder();

            sb.append(str.charAt(i));
            System.out.print(sb+" ");
            

            
        }
    }
}