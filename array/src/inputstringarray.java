import java.util.Scanner;

public class inputstringarray
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Scanner sca=new Scanner(System.in);
        int n;
        System.out.println("Enter a number of string array length==");
        n=sca.nextInt();
        String txt[]=new String[n];
        for (int i=0;i<txt.length;i++){
            System.out.println("Enter words of index"+i);
            txt[i]=sc.nextLine();

        }
        System.out.println();
        for (int i = 0; i < txt.length; i++) {
            System.out.println("Array wordss"+i+"==" + txt[i]);
        }
    }

}
