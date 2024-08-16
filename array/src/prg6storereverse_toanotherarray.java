public class prg6storereverse_toanotherarray
{
    public static void main(String[] args) {
        int arr[]={4,3,7,8,6,1,2};
        int brr[]=new int[arr.length];
        int i=arr.length-1;
        for(int j=0;j<arr.length;j++,i--){
            brr[j]=arr[i];
        }
        System.out.print("REVERSED=");
        for(int j=0;j<brr.length;j++){
            System.out.print(brr[j]);
        }
        System.out.println();
    }
}
