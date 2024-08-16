public class insertelement_array
{
    public static void main(String[] args) {
        int arr[]={1,2,4,5};
        int index=2;
        int v=3;
        int brr[]=new int[arr.length+1];
        brr[2]=v;
        for(int i=0;i<index;i++){
            brr[i]=arr[i];
        }
        for(int i=arr.length-1;i>=index;i--){
            brr[i+1]=arr[i];

        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for(int i=0;i<brr.length;i++){
            System.out.print(brr[i]+" ");
        }
    }
}
