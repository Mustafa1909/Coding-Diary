public class stock{
    public static void main(String[] args) {
        int arr[]={100, 180, 260, 310, 40, 535, 695};
        int res = Stock(arr);
        System.out.println(res);
        
    }
    public static int Stock(int arr[]){
        int result =0;
        
        for(int i=1;i<arr.length;i++){
            if(arr[i]>arr[i-1]){
                result+=arr[i]-arr[i-1];
            }
       
        }
        return result; 
    }
}