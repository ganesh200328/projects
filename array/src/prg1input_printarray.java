import java.util.*;

public class prg1input_printarray
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a no for n array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            System.out.printf("Enter a number for index %d:",i);
            arr[i]=sc.nextInt();

        }
        for(int i=0;i<arr.length;i++){

            System.out.print(arr[i]);
        }

    }
}
