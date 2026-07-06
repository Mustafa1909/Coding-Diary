public class ContainerWithMostWatre {
    public static void main(String[] args) {
        int nums[]={1,8,6,2,5,4,8,3,7};
       int res = MaxHeight(nums);
       System.out.println(res);
    }
    public static int MaxHeight(int nums[]){
        int left =0;
        int right = nums.length-1;
        int MaxArea = 0;
        while(left<right){
            int height = Math.min(nums[left],nums[right]);
            int width = right-left;
            int area = height*width;
            MaxArea=Math.max(MaxArea, area);
            if(nums[left]<nums[right]){
                left++;
            }else{
                right--;
            }
        }
        return MaxArea;
    }
}
