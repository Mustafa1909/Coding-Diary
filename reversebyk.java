public class reversebyk {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        reverse(arr,2);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void reverse(int arr[],int k){
        int n=arr.length;
        k=k%n;

        reversebyk(arr,0,k-1);
        reversebyk(arr,k,n-1);
        reversebyk(arr,0,n-1);

    }
    public static void reversebyk(int arr[],int s,int e){
        while(s<e){
            int temp = arr[s];
            arr[s]=arr[e];
            arr[e]=temp;
            s++;
            e--;
        }
       
    }
}
