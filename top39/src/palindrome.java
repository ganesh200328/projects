public class palindrome
{
    public static void main(String[] args) {
        int n=11211;
        int temp=n;
        int sum=0;
        String s=String.valueOf(n);
        int l=s.length();
        for(int i=0;i<=l;i++){
            if(n!=0)
            {
                int d = n % 10;
                sum = (sum * 10) + d;
                n = n / 10;
            }
        }
        if(temp==sum){
            System.out.println("Palindrome");
        }
    }
}
