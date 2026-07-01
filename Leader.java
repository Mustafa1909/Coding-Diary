import java.util.*;
public class Leader {
    public static void main(String[] args) {
        int arr[]={16, 17, 4, 3, 5, 2};
         ArrayList<Integer> result = Leader(arr);
        for (int r : result) {
            System.out.print(r + " ");
        }
        System.out.println();
    }
    static ArrayList<Integer> Leader(int arr[]){
        ArrayList<Integer> res = new ArrayList<>();

        int n = arr.length;

        int max = arr[n-1];
        res.add(max);

        for(int i=n-2;i>=0;i--){
            if(arr[i]>=max){
                max=arr[i];
                res.add(max);
            }
        }
        Collections.reverse(res);
        return res;

    }
}
