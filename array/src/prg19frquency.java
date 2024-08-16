public class prg19frquency
{
    public static void main(String[] args) {
        int arr[]={1,2,2,3,3,3};
        int brr[]=new int[arr.length];
        int temp=-1;
        for(int i=0;i<arr.length;i++){
            int count=1;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    brr[j]=temp;
                    count++;
                }
            }
            if(brr[i]!=temp) {
                brr[i] = count;
            }
        }
        int pair=0;
        int sum=0;
        for(int i=0;i<brr.length;i++){
            if(brr[i]!=temp) {
                pair=brr[i]/2;
                sum+=pair;

            }
        }
        System.out.println(sum);
    }
}
