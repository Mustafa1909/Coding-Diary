import java.util.*;

public class MaxRight {
    public static void main(String[] args) {
        int arr[] = {16, 17, 4, 3, 5, 2};

        maxRight(arr);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void maxRight(int arr[]) {
        int maxRight = -1;

        for (int i = arr.length - 1; i >= 0; i--) {
            int curr = arr[i];

            arr[i] = maxRight;

            if (curr > maxRight) {
                maxRight = curr;
            }
        }   
    }
}