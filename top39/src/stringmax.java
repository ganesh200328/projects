public class stringmax
{
    public static void main(String[] args) {
        String str="mohan rajj is a bot";
        str=str+" ";
        String str1="";
        String str2="";
        String temp="";
        int max=0;
        int count=0;
        int c=0;
//        for(int i=0;i<str.length();i++){
//            char ch=str.charAt(i);
//            if (!Character.isWhitespace(ch)) {
//                count += 1;
//                str1=str1+ch;
//
//            }
//            else{
//                c=c+1;
//
//                if(tempmax<count){
//                    tempmax=count;
//                    temp=str1;
//                }
//                str1="";
//                count=0;
//            }
//        }
        int secmax=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(!Character.isWhitespace(ch)){
                count=count+1;
                str1=str1+ch;
            }
            else{
                c+=1;
                if(max<count){
                    secmax=max;
                    max=count;
                    str2=temp;
                    temp=str1;
                }
                else if (secmax<count) {
                    secmax=count;
                    str2=str1;
                }
                count=0;
                str1="";
            }
        }
        System.out.println(max);
        System.out.println(secmax);
        System.out.println(temp);
        System.out.println(str2);
        System.out.println(c);
    }
}
