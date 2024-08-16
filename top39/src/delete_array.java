public class delete_array
{
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int brr[]=new int[arr.length-1];
        int v=3;
        int index=0;
        for(int i=0;i<arr.length;i++){
            if(v==arr[i]){
                index=i;
            }
        }
        for(int i=0;i<index;i++){
            brr[i]=arr[i];
        }
        for(int i=arr.length-1;i>index;i--){
            brr[i-1]=arr[i];
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
