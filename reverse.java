public class reverse {
    public static void main(String[] args) {
        
        int arr[]={1,2,3,4,5,6,7,8};
        int n = arr.length;
        
        int k = 2;
        swap(arr,2);
        
    }
    public static void swap(int arr[],int k){
        for(int i=0;i<arr.length;i+=k){
            int f =i;
            int l =Math.min(i+k-1,arr.length-1);
            while(f<l){
                
                int temp= arr[f];
                arr[f]=arr[l];
                arr[l]=temp;
                f++;
                l--;
      
            }
        }
        
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
