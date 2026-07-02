import java.util.*;
public class MergeIntervals{
    public static void main(String[] args) {
        int arr[][]={{1,3},{2,6},{8,10},{15,18}};
         int[][] ans = Merge(arr);

        for (int[] interval : ans) {
            System.out.println(Arrays.toString(interval));
        }

    }
    public static int[][] Merge(int arr[][]){
        ArrayList<int[]> res = new ArrayList<>();
        res.add(arr[0]);

        for(int i=1;i<arr.length;i++){
            int last[]=res.get(res.size()-1);
            if(last[1]>=arr[i][0] && last[1]<arr[i][1]){
                last[1]=arr[i][1];
            }else if(last[1]<arr[i][0]){
                res.add(arr[i]);
            }
        }
        return res.toArray(new int[res.size()][]);

    }
}