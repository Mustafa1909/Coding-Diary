public class SortColour {
    public static void main(String[] args) {
        int nums[]={2,0,2,1,1,0};
        Sort(nums);
    }
    public static void Sort(int nums[]){
        int s = 0;
        int c = 0;
        int e = nums.length-1;

        while(c<=e){
            if(nums[c]==0){
                int temp = nums[s];
                nums[s]=nums[c];
                nums[c]=temp;
                s++;
                c++;


            }else if(nums[c]==0){
                c++;
            }else{
                int temp = nums[c];
                nums[c]=nums[e];
                nums[e]=temp;
                e--;
            }
        }
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
    }
}
