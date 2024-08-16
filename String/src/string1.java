public class string1
{
    public static void main(String[] args) {
        String s="Hello!";
        char ch=s.charAt(0);
        System.out.println(ch);

        System.out.println(ch);
        for(int i=0;i<s.length();i++) {
            char ch1[] = s.toCharArray();

//            System.out.print(ch1[i]);
//            System.out.println();
            if(ch1[i]=='l'){
                ch1[i]='o';
            }
            else if(ch1[i]=='o'){
                ch1[i]='l';
            }
            System.out.print(ch1[i]);

        }

        for(int i=0;i<s.length();i++){
//            char ch=ch1.charAt();
        }

    }
}
