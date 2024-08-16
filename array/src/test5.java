public class test5
{
    public static void main(String[] args) {

        int arr[]={10,20,30,40};
        int brr[]=new int[arr.length];
        int j=arr.length-1;
        for(int i=0;i<arr.length;i++) {
            brr[i]=arr[j];
            j--;

        }
        for(int i=0;i<brr.length;i++){
            System.out.print(brr[i]+" ");
        }
        System.out.println();
    }
}
