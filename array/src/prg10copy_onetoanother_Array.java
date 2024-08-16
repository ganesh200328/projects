import java.util.Arrays;

public class prg10copy_onetoanother_Array
{
    public static void main(String[] args) {
        int arr[]={3,2,1};
        int arr1[]=new int[3];
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
        System.out.println();
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++) {
            arr1[i] =arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println();
    }
}
