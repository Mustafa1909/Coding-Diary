public class MaximumSubArray{
    public static void main(String[] args) {
        int arr[]={2,3,-8,7,-1,2,3};
        int res = Maximum(arr);
        System.out.print(res);
    }
    public static int Maximum(int arr[]){
        int curr=arr[0];
        int max = arr[0];

        for(int i=1;i<arr.length;i++){
            curr=Math.max(curr+arr[i],arr[i]);
            max=Math.max(max,curr);
        }
        return max;
    }
}