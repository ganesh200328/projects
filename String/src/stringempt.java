public class stringempt {
    public static void main(String[] args) {
        String s="This is a Word";
        String s1=new String("This is a Word");
        System.out.println(s==s1);
        String s2="rama";
        String s3="rama";
        String s4="sita";
        String s5="rama";
        String s6,s7,s9,s10;
        s6="rama"+"sita";
        s7=s2+s4;
        s10=s2+s4;
        System.out.println(s10==s7);
        s9="rama"+s4;
        String s8=s7;
        if (s7.equals(s6)){
            System.out.println("s1 pointing s2");
        }
        if(s9==s6){
            System.out.println("s9 and s6"+s9==s6);
            System.out.println("eqauals6s9");
        }
        if(s9.equals(s6)){
            System.out.println("s9 and s6"+s9.equals(s6));
            System.out.println("eqauals6s9");
        }
        if(s6==s8){
            System.out.println(s6==s8);
            System.out.println("eqaual");
        }
        for (int i=0;i<s7.length();i++){
            char ch=s7.charAt(i);
            System.out.print(ch);
        }
        for (int i=0;i<s7.length();i++){
            char ch[]=s7.toCharArray();
            char ch1[]=ch;
            //System.out.print(ch);
            System.out.println(ch1);
            System.out.println(ch1[3]);
        }
        char ch2[]=s7.toCharArray();
        System.out.println(ch2);


    }
}
