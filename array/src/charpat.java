public class charpat {
    public static void main(String[] args) {
        int n=5;
        char ch='A';
        for(int i=n;i>=1;i--){

            for(int j=1;j<=i;j++){
                System.out.print(ch+" ");
                ch++;
            }
            for (int j=i;j<=n;j++){
                System.out.print("  ");
            }
            System.out.println();
        }
    }
}
