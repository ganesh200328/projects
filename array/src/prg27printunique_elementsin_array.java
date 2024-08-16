public class prg27printunique_elementsin_array
{
    public static void main(String[] args) {
        int arr[]={1,2,3,3,2,1,4};
        int brr[]=new int[arr.length];
        int crr[]=new int[arr.length];
        int brrindex=0;
        int crrindex=0;
        for(int i=0;i<arr.length;i++){
            int temp=0;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    temp=1;
                    break;

                }
            }
            if(temp==1){
                crr[crrindex]=arr[i];
                crrindex++;
            }
            if(temp==0){
                int t=0;
                for(int j=0;j<crr.length;j++)
                {
                    if(arr[i]==crr[j]) {
                        t=1;
                        break;


                    }
                }
                if(t==0){
                    brr[brrindex]=arr[i];
                    brrindex++;
                }
            }
        }
        for(int i=0;i<brrindex;i++){
            System.out.print(brr[i]+" ");

        }
    }
}
