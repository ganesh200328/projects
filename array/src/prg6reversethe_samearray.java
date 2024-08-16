public class prg6reversethe_samearray
{
    public static void main(String[] args) {
        int arr[]={5,3,4,1,8,4,2};
        int temp=0;
        int j=arr.length-1;
        for(int i=0;i<arr.length/2;i++){
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            j--;


        }
        System.out.print("REVERSED ARRAY=");

        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
