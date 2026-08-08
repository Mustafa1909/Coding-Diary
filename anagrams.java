public class anagrams{
    public static void main(String[] args) {
        String str1 = "tar";
        String str2 ="rat";
        

       boolean isAna = true;
       int freq[]=new int[26];

       for(int i=0;i<str1.length();i++){
        freq[str1.charAt(i)-'a']++;
       }
       for(int j=0;j<str2.length();j++){
        freq[str2.charAt(j)-'a']--;
       }
       for(int num:freq){
        if(num != 0){
            isAna = false;
        }
       }
  System.out.println(isAna);
    
      
        
    }

}