public class MaximumProduct {
    public static void main(String[] args) {
        int arr[]={-2,6,-3,-10,0,2};
        int res = MaxMul(arr);
        System.out.println(res);
    }
    public static int MaxMul(int arr[]){
        int max=arr[0];
        int min= arr[0];
        int ans = arr[0];

        for(int i=1;i<arr.length;i++){
            if(arr[i]<0){
                int temp = max;
                max=min;
                min=temp;
            }

                max=Math.max(max*arr[i],arr[i]);
                min=Math.min(min*arr[i],arr[i]);
                ans=Math.max(ans,max);
            
        }
        return ans;
    }
}
