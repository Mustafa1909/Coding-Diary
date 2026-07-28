public class MergeArr{
    public static void main(String[] args) {
        int num1[]={1,2,3,0,0,0};
        int num2[]={2,5,6};
        int m = 3;
        int n = 3;
        Merge(num1,num2,m,n);
    }
    public static void Merge(int num1[],int num2[],int m ,int n){
        int i= m-1;
        int j = n-1;
        int k = m+n-1;
        while(j>=0){
            if(i>=0 && num1[i]>num2[j]){
                num1[k--]=num1[i--];

            }else{
                num1[k--]=num2[j--];
            }

        }
        for(int a=0;a<num1.length;a++){
            System.out.print(num1[a]+" ");

        }
    }

}