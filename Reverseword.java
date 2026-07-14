public class Reverseword {
    public static void main(String[] args) {
        String str = "Mustafa is dsa";
        System.out.println(reverse(str));
    }
    public static String reverse(String str){
       
        String[] words= str.trim().split("\\s+");

        StringBuilder sb = new StringBuilder();
        for(int i=words.length-1;i>=0;i--){
            sb.append(words[i]);
            if(i!=0){
                sb.append(' ');
            }
        }
        return sb.toString();
        }
       
    }


