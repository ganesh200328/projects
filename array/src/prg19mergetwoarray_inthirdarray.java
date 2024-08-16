public class prg19mergetwoarray_inthirdarray
{
    public static void main(String[] args) {
        int arr[]={10,20,30,40};
        int brr[]={50,60,70,80};
        int crr[]=new int[arr.length+brr.length];
        for(int i=0;i<arr.length;i++){
            crr[i]=arr[i];
        }
        int j=brr.length-1;
        for(int i=crr.length-1;i>=arr.length;i--){
            crr[i]=brr[j];
            j--;

        }
        for(int i=0;i<crr.length;i++) {
            System.out.print(crr[i]+" ");
        }
    }
}
