public class MergeTwoSorted {
    public static void main(String[] args) {
        int nums1[]={1,2,3};
        int nums2[]={2,5,6};
        Merge(nums1, nums2);
    }
    public static void Merge(int nums1[],int nums2[]){
        int m = nums1.length;
        int n = nums2.length;

        int i=0;
        int j=0;
        while(i<m && j<n){
            if(nums1[i]<nums2[j]){
                System.out.print(nums1[i]+" ");
                i++;
            }else{
                System.out.print(nums2[j]+" ");
                j++;
            }
        }
        while(i<m){
            System.out.print(nums1[i]+" ");
            i++;
        }
        while(j<n){
            System.out.print(nums2[j]+" ");
            j++;
        }

    }
}
