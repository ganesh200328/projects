public class stringtochararrayy
{
    public static void main(String[] args) {
        String str="Ganesh";
//        char ch[]={'p'};
        char ch[]=str.toCharArray();
        System.out.println(ch);
        System.out.println("len of str:"+str.length());
        System.out.println("len of char:"+ch.length);
        for (char i:ch){
            System.out.println(i);
        }
    }
}
