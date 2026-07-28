public class SquareOfSorted {
 
    public static void main(String[] args) {
        int arr[]={-4,-1,0,3,10};
        int res[] = SqSo(arr);

        for(int i:res){
            System.out.print(i+" ");
        }
        
        
       

    }
    public static int[] SqSo(int arr[]){
        int left = 0;
        int right = arr.length-1;
        int ans[]=new int [arr.length];
        int index = arr.length-1;

        while(left<=right){
            int leftsq = arr[left]*arr[left];
            int rightsq = arr[right]*arr[right];

            if(leftsq>rightsq){
                ans[index--]=leftsq;
                left++;
            }
            else{
                ans[index--]=rightsq;
                right--;
            }
        }
        return ans;


    }
}
