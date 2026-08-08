public class passbyone{
    public static void main(String[] args) {
    int arr[]={1,2,3,4,5}; 
    passbyon(arr);
    for(int num:arr){
        System.out.print(num+" ");
    }   
    }
    public static void passbyon(int arr[]){

        int temp=arr[0];

        for(int i=1;i<arr.length;i++){
            arr[i-1]=arr[i];
        }
        arr[arr.length-1]=temp;
    }

}