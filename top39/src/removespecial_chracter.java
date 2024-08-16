public class removespecial_chracter
{
    public static void main(String[] args) {
        String str="Ga@$#h";
        String str1="";
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if((ch>64 && ch<92) || (ch>96 && ch<123)){
                str1=str1 +ch;
            }
        }
        System.out.println(str1);
    }
}
