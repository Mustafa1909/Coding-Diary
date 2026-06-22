public class MajorityElement{
    public static void main(String[] args) {
        int arr[]={1, 1, 2, 1, 3, 5, 1};
        int res= Element(arr);
        System.out.println(res);

    }
    public static int Element(int arr[]){
        int count = 0;
        int candidate = 0;

        for(int num : arr){
            if (count == 0){
                candidate=num;

            }
            if(num==candidate){
                count++;
            }else{
                count--;
            }
        }
        return candidate;
    }
}