public class prg6reverse_array
{
    public static void main(String[] args) {

        int arr[]={1,2,3,4,5};
        int length=arr.length;
        for(int i=length-1;i>=0;i--){
            System.out.print(arr[i]);
        }


        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            --length;
            System.out.print(arr[length]);

        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[arr.length-1-i]);

        }

    }
}
