import java.util.Scanner;

public class array1
{
    public static void main(String[] args) {
        int sum=0;
        int mul=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number for n==");
        int n= sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            System.out.println("Enter value for Array"+i);
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
            sum+=arr[i];
            mul*=arr[i];
        }
        System.out.println();
        System.out.println("Summ of AArRAayyy++++==>>>>"+sum);
        System.out.println("Mul of array========......>>>>>"+mul);

    }
}
