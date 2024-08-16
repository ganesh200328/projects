public class arrayocuurence
{
    public static void main(String[] args) {
        int arr[]={1,1,2,2,3,4,4};
        int brr[]=new int[arr.length];
        int crr[]=new int[arr.length];
        int temp=-1;
        int t=0;
        for(int i=0;i<arr.length;i++){
            int count=1;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count+=1;
                    brr[j]=temp;
                }
            }
            if(brr[i]!=temp){
                brr[i]=count;
                for (int k = 0; k < arr.length; k++) {
                    if (arr[i] != crr[k]) {
                        crr[i] = arr[i];
                    }
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            //if(brr[i]!=temp){
            //System.out.println(arr[i]+" "+brr[i]);
            //}
            if(brr[i]!=temp) {
                System.out.print(crr[i]);
            }
//

        }

    }

}
