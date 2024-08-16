public class charpattern
{
    public static void main(String[] args) {
        int one=65;
        int t=one+4;
        for (int i=one;i<=t;i++){
            for(int j=one;j<=t;j++){
                System.out.print((char)j);
            }
            System.out.println();
        }
    }
}
