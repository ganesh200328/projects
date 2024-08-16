public class ex5findstringindex_addtofirst
{
    public static void main(String[] args) {
        String str="String-confusion";
        char ch[]=str.toCharArray();
        char temp=0;
        int index=0;
        char value='-';
        for(int i=0;i<ch.length;i++){
            if(ch[i]==value){
                temp=ch[i];
                System.out.println(temp);
                index=i;
            }
        }
        for(int i=index-1;i>=0;i--) {
            ch[i+1]=ch[i];


        }
        ch[0]=temp;

        for (int i=0;i<ch.length;i++){
            System.out.print(ch[i]);
        }
    }
}
