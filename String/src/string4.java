public class string4
{
    public static void main(String[] args) {
        String s="GaNeShKuMaR";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(Character.isUpperCase(ch)){
                ch=Character.toLowerCase(ch);
            }
            else if (Character.isLowerCase(ch)) {
                ch=Character.toUpperCase(ch);

            }
            System.out.print(ch);
        }
    }
}
