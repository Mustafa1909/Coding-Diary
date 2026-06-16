public class plusone {
    public static void main(String[] args) {
        int arr[]={9,9,9};
       int result[] =plusOne(arr);
        for(int i=0;i<result.length;i++){
            System.out.print(result[i]);
        }
    }
    public static int[] plusOne(int arr[]){
      for(int i=arr.length-1;i>=0;i--){
        if(arr[i]<9){
            arr[i]++;
            return arr;
        }else{

            arr[i]=0;
        }
        
       
       
      }
      int result[]=new int[arr.length+1];
      result[0]=1;
      return result;
      
    }
}
