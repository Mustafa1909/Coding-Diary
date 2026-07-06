public class countwords {
    public static void main(String[] args) {
        String str ="Mustafa is Learning dsa daily";

        int count =0;

        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' '){
                count++;

            }
        }
        System.out.println(count + 1);
    }
}
