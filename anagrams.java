public class anagrams{
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 ="slient";
        

        for(int i=0;i<str1.length();i++){
            int count1 = 0;
            int count2 = 0;
            for(int j=0;j<str1.length();j++){
                if(str1.charAt(i)==str2.charAt(j)){
                   count1++;
                }
            }
            for(int j=0;j<str2.length();j++){
                if(str2.charAt(i)==str2.charAt(j)){
                    count2++;
                }
            }
            if(count1!=count2){
                System.out.print("not Anagrams");
                return;
            }
        }
        System.out.print("anagrams");
      
        
    }

}