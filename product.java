public class product {
    public static void main(String[] args) {
        int arr[]={10, 3, 5, 6, 20};
        int result = three(arr);
        System.out.println(result);
        
    }
    public static int three(int arr[]){
        int n = arr.length;
        int max =1;
              for(int i=0;i<n-2;i++){
                for(int j=i+1;j<n-1;j++){
                    for(int k=j+1;k<n;k++){
                        max=    Math.max(max,arr[i]*arr[j]*arr[k]);
                    }
                }

              }
              return max;
        
    }
}
