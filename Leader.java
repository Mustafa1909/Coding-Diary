import java.util.*;
public class Leader {
   public static void main(String[] args) {
      
       int arr[] = {16, 17, 4, 3, 5, 2};
       findmax(arr);
   }
   public static void findmax(int arr[]){
      ArrayList<Integer> list = new ArrayList<>();

      int max = arr[arr.length-1];
      list.add(max);

      for(int i=arr.length-2;i>=0;i--){
         if(arr[i]>max){
            list.add(arr[i]);
            max=arr[i];
         }
      }
      for(int i=list.size()-1;i>=0;i--){
         System.out.print(list.get(i)+" ");

      }
   }
   

   
}