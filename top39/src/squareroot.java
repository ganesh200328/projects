public class squareroot
{
    public static void main(String[] args) {
        //System.out.println(Math.sqrt(5));
        int n=5;
        double temp;
        double sr=n/2;
        do{
            temp=sr;
            sr=(temp+(n/temp))/2;
        }while((temp-sr)!=0);
        System.out.println(sr);
    }
}


