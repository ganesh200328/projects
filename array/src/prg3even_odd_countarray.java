import java.util.Scanner;

public class prg3even_odd_countarray
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number of array:: ");
        int n= sc.nextInt();
        int arr[]=new int[n];
        int count=0;
        int pcount=0;
        int ncount=0;
        for (int i=0;i<arr.length;i++){
            Scanner scan=new Scanner(System.in);
            System.out.printf("Enter a number of index %d =",i);
            arr[i]=scan.nextInt();
            count++;
            if(arr[i]%2==0){

            }

        }
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
            System.out.println();
            if((arr[i]%2)==0){
                System.out.print("Even number= "+arr[i]);
                pcount++;
            }

            else
            {
                System.out.print("ODD number="+arr[i]);
                ncount++;
            }
            System.out.println();


        }
        System.out.println("COunt of array="+count);
        System.out.println("Even="+pcount);
        System.out.println("Odd="+ncount);
    }
}
