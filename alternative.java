import java.util.ArrayList;

public class alternative{
    public static void main(String[] args) {
        int arr[]={1,-1,-2,3,4,5,-6};
        Alernative(arr);
       

        
    }
    public static void Alernative(int arr[]){
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                pos.add(arr[i]);
            }else{
                neg.add(arr[i]);
            }
        }
        int i=0;
        int j = 0;
         while(i<pos.size() && j <neg.size()){
            System.out.print(pos.get(i++)+" ");
            System.out.print(neg.get(j++)+" ");

         }
         while(i<pos.size()){
            System.out.print(pos.get(i++)+" ");
         }
         while(j<neg.size()){
            System.out.print(neg.get(j++)+" ");
         }

      

    
     

      

    }
 


    }
