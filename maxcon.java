public class maxcon {
    public static void main(String[] args) {
        int arr[]={0,1,0,1,1,1,1,1};
        int result = maxCon(arr);
        System.out.println(result);
    }
    public static int maxCon(int arr[]){
        int maxcount =0;
        int count=1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]==arr[i-1]){
                count++;
            }else{
                count=1;
            }
        }
        return Math.max(maxcount,count);
    }
}
