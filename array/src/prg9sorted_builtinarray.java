import java.util.Arrays;

public class prg9sorted_builtinarray
{
    public static void main(String[] args) {
        int arr[]={6,2,9,4,8,5,};
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]);
        }
        System.out.println();
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);

        }
        System.out.println();
        System.out.println("Second largest = "+arr[arr.length-2]);
    }
}
