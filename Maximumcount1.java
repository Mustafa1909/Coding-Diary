public class Maximumcount1{
    public static void main(String[] args) {
        int nums[]={1,1,1,0,0,0,1,1,1,1,0};
        int k = 2;
        int res= longestOnes(nums, k);
        System.out.println(res);
    }
    public static int longestOnes(int nums[],int k){
        int left = 0;
        int zeroC=0;
        int maxlen=0;

        for(int right=0;right<nums.length;right++){
            if(nums[right]==0){
                zeroC++;
            }
            while(zeroC>k){
                if(nums[left]==0){
                    zeroC--;
                }
                left++;
            }
            maxlen=Math.max(maxlen, right-left+1);

        }
        return maxlen;
    }

    

}