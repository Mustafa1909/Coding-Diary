public class RemoveAllTheOcc {
    public static void main(String[] args) {
        String str = "daabcbaabcbc";
        String part = "abc";
    }
    public static String RemoveOccurance(String str,String part){
        int i = 0;
        int j = 0;

        while(i<str.length() && j<part.length()){
            if(str.charAt(i)==part.charAt(j)){
                i++;
                j++;
                String left = str.substring(0, i );
                String right = str.substring(i, str.length());
            }
        }
        
    }
}
