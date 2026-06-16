public class move {
    public static void main(String[] args) {
        int arr[]={1,2,4,0,9,0,5,0,1,2};
        move(arr);
    }
    public static void move(int arr[]){
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
                j++; 
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
  
}
