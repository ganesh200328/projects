public class ex4strapple
{
    public static void main(String[] args) {
        String str="apples";
        char ch[]=str.toCharArray();
        char ch1='a';
        char ch2='p';
        System.out.println(ch1);
        for(int i=0;i<ch.length;i++){
            if(ch[i]==ch1){
                ch[i]=ch2;


            }
            else if(ch[i]==ch2){
                ch[i]=ch1;
            }
        }
        for(int i=0;i<ch.length;i++) {
            System.out.print(ch[i]);
        }

    }
}
