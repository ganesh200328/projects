public class string3
{
    public static void main(String[] args) {
        String s="aaabbbcc";
        int countB=0;
        int countA=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='a'){
                countB++;
                ch='b';
                ch=Character.toUpperCase(ch);
            }
            else if (ch=='b') {
                countA++;
                ch='a';
                ch=Character.toUpperCase(ch);


            }
            System.out.print(ch);

        }
        System.out.println();
        System.out.println(countA);
        System.out.println(countB);

    }
}
