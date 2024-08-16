import javax.crypto.spec.PSource;

public class sortStringarray
{
    public static void main(String[] args) {
        String s="GaNesh";
//        char ch=s.charAt(0);
//        System.out.println((int)ch);
        String capital="";
        String small="";
        for (int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch>64  && ch<92){
                capital=capital+ch;
            }
            else{
                small=small+ch;
            }

        }
        char caparr[]=capital.toCharArray();
        char smallarr[]=small.toCharArray();
        //char temp=' ';
        for(int i=0;i<caparr.length;i++){
            for(int j=i+1;j<caparr.length;j++){
                if(caparr[i]>caparr[j]){
                    char temp=caparr[i];
                    caparr[i]=caparr[j];
                    caparr[j]=temp;
                }
            }
        }
        for(int i=0;i<smallarr.length;i++){
            for(int j=i+1;j<smallarr.length;j++){
                if((int)smallarr[i]>(int)smallarr[j]){
                    char temp=smallarr[i];
                    smallarr[i]=smallarr[j];
                    smallarr[j]=temp;
                }
            }
        }
        String str2="";
        for(int i=0;i<smallarr.length;i++){
            str2=str2+smallarr[i];
        }
        for(int i=0;i<caparr.length;i++){
            str2=str2+caparr[i];
        }

        System.out.println(str2);
        for (int i = 0; i < caparr.length; i++) {
            System.out.println(caparr[i]);

        }
    }
}
