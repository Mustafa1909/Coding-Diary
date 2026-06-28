public class SubarrayshavingproductlessthanK {
    public static void main(String[] args) {
        int arr[]={1, 2,3,4};
        int k = 10;
        int resu = product(arr, k);
        System.out.println(resu);
    }
    public static int product(int arr[],int k){
        int count = 0;
       for(int i=0;i<arr.length;i++){
        if(arr[i]<k){
            count++;


           int  mul = arr[i];

           for(int j=i+1;j<arr.length;j++){
            mul = mul * arr[j];

            if(mul <k){
                count++;
            }else{
                break;
            }
           }
        }
       }
        return count;
    }
}
