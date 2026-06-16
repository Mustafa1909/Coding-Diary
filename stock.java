public class stock{
    public static void main(String[] args) {
        int arr[]={1, 3, 6, 9, 11};
        int res = Stock(arr);
        System.out.println(res);
        
    }
    public static int Stock(int arr[]){
        int currmax=0;
        int minprice=arr[0];

        for(int i=0;i<arr.length;i++){
        minprice=Math.min(minprice,arr[i]);
        currmax=Math.max(currmax,arr[i]-minprice);
        }
        return currmax;



        
    }
}