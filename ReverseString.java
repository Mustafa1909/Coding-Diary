public class ReverseString {
    public static void main(String[] args) {
        String str= "Mustafa";
        System.out.println(Reverse(str));

        
    }
    public static String Reverse(String str){
        int left = 0, right = str.length() - 1;
      
        
        StringBuilder res = new StringBuilder(str);
      
        while (left < right) {
            char temp = res.charAt(left);
            res.setCharAt(left, res.charAt(right));
            res.setCharAt(right, temp);
            left++;
            right--;
        }
        return res.toString();
    }
    
}
