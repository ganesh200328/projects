public class prime
{
    public static void main(String[] args) {
        int n=23;

        for(int j=1;j<=n;j++) {
            if (j == 2) {
                System.out.println("Prime"+" "+j);
            }
            else {
                int pcount=0;
                for (int i = 2; i <=j; i++) {
                    if (j > 2 && j % i == 0) {

                        pcount += 1;
                    }
                }
                if (pcount == 1) {
                    System.out.println("Prime"+" "+j);
                }
                else {
                    System.out.println("Not a prime"+" "+j);
                }
            }
        }

    }
}
