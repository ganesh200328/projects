import java.util.Scanner;


public class test1{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter No of Array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            System.out.println("Enter A value for array: "+i);
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
}