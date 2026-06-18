public class dupilcate{
    public static void main(String[] args) {
        int arr[]={1,2,2,3,3,4,5};
        int res = Duplicate(arr);
       for(int i=0;i<res;i++){
        System.out.print(arr[i]+" ");
       }


    }
    public static int Duplicate(int arr[]){
        int temp =0;
        int first = arr[0];

        arr[temp]=first;
        temp++;

        int n = arr.length;

        for(int i=1;i<n;i++){
            if(arr[i]!=first){
                arr[temp++]=arr[i];
                first = arr[i];
            }
        }
        
        return temp;
    }
}