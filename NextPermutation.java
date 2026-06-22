public class NextPermutation{
    public static void main(String[] args) {
        int arr[]={2, 4, 1, 7, 5, 0};
        Next(arr);
    }
    public static void Next(int arr[]){
        int n = arr.length;
        int pivot = -1;

        for(int i=n-2;i>=0;i--){
            if(arr[i]<arr[i+1]){
                pivot=i;
                break;
            }
        }
        if(pivot != -1){
             for(int i=n-1;i>pivot;i--){
            if(arr[i]>arr[pivot]){
                int temp = arr[i];
                arr[i]=arr[pivot];
                arr[pivot]=temp;
                break;
            }
        }

        }
       
        int l = pivot + 1;
        int r = n-1;
        while(l<r){
            int temp = arr[l];
            arr[l]=arr[r];
            arr[r]=temp;
            l++;
            r--;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}