import java.util.Arrays;

public class prg25tofind_dup_count
{
    public static void main(String[] args) {
        int arr[]={1,1,3,3,3,5,6,6,2,4,1,2,2};
        int dup=0;
        int index=0;
        for(int i=0;i<arr.length;i++){

            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    dup++;
                    break;
                }
            }

        }
        int brr[]=new int[arr.length-dup];
        for(int i=0;i<arr.length;i++){
            int temp=0;
            for(int j=0;j<i;j++){
                if(arr[i]==arr[j]){
                    temp=1;
                    break;
                }


            }
            if(temp==0){
                brr[index]=arr[i];
                index++;
            }
        }
        for(int i=0;i<brr.length;i++){
            System.out.print(brr[i]+" ");
        }
        System.out.println();
        int arrr[]={1,1,3,3,3,5,6,6,2,4,1,2,2};
        Arrays.sort(arrr);
        for(int i=0;i<arrr.length;i++){
            System.out.print(arrr[i]+" ");
        }


        System.out.println();
        System.out.println(dup);
    }
}
