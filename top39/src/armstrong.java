public class armstrong
{
    static int power(int d,int l,int p){
        for(int i=1;i<=l;i++){
            p=d*p;
        }
        return p;
    }
    static void check(int arm,int temp){
        if (arm==temp) {

            System.out.println(temp+"  Armstrong  "+arm);
        }
    }
    public static void main(String[] args) {
        int j=5000;
        for(int k=1;k<=j;k++) {
            int n=k;
            int temp = k;
            int arm = 0;
            int p = 1;
            String s = String.valueOf(n);
            //System.out.println(s);
            int l = s.length();
            //System.out.println(l);
            for (int i = 0; i < l; i++) {
                int d = n % 10;
                arm = arm + power(d, l, p);
                n = n / 10;
            }
            check(arm, temp);
        }
    }
}
