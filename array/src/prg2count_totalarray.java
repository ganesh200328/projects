import java.util.Scanner;

public class prg2count_totalarray
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of array:  ");
        int n= sc.nextInt();
        int count=0;
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            Scanner scan=new Scanner(System.in);
            System.out.printf("Enter a number for index %d",i);
            arr[i]=scan.nextInt();
            count++;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
        System.out.println();

        System.out.println("count = "+count);
        int len=arr.length;
        System.out.println("Length= "+len);
    }
}
