public class prg12insert_endofarray
{
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int n=6;
        int brr[]=new int[arr.length+1];
        for(int i=0;i<arr.length;i++){
            brr[i]=arr[i];
        }
        brr[brr.length-1]=6;
        for(int i=0;i<brr.length;i++){
            System.out.print(brr[i]+" ");
        }
    }
}
