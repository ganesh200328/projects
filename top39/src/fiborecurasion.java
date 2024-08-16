import java.util.Scanner;

public class fiborecurasion
{
    static void fibo(int a,int b,int n,int c){

        c=a+b;
        a=b;
        b=c;

        if(c<n){
            System.out.println(c);
            fibo(a,b,n,c);
        }
    }

    public static void main(String[] args) {
        int a=0;
        int b=1;
        int c=0;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(a);
        System.out.println(b);
        fibo(a,b,n,c);
    }
}
