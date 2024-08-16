import java.util.Scanner;

public class prg4count_neg_prg5print_negative_array
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of array:");
        int n=sc.nextInt();
        int negcount=0;
        int poscount=0;
        int count=0;
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            System.out.printf("Enter value of index %d ",i);
            System.out.println();
            arr[i]=sc.nextInt();
            count++;

        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<0){
                System.out.print("Negative:"+arr[i]+" ");
                negcount++;

            }


            if(arr[i]>0){
                System.out.print("Positive:"+arr[i]+" ");
                poscount++;
            }
        }
        System.out.println();
        System.out.println("count="+count);
        System.out.println("poscount="+poscount);
        System.out.print("negcount="+negcount);
    }
}
