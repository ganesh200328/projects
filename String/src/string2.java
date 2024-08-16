public class string2
{
    public static void main(String[] args) {
        String s="HEllo";
        String rev="";
        for(int i=s.length()-1;i>=0;i--){
            char ch=s.charAt(i);
            rev=ch+rev;


        }
        System.out.print(rev);
    }
}
