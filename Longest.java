public class Longest{
    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};

        System.out.println(longestSeq(strs));

    
    }
    public static String longestSeq(String[] strs){
        if(strs.length==0){
            return "";
        }
        
        String first=strs[0];
        StringBuilder sb = new StringBuilder();

        for(int i=0;i<first.length();i++){
            char ch = first.charAt(i);

            for(int j=1;j<strs.length;j++){
                if(ch!=strs[j].charAt(i)){

                    return sb.toString();
                }
            }
            sb.append(ch);
        }
        return sb.toString();

    }
    
}