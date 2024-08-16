public class sortstring_casesense
{
    public static void main(String[] args) {
        String str="GAnesh";
        char strarr[]=new char[str.length()];
        int j=0;
        for (int i = 0; i < strarr.length; i++) {
            char ch=str.charAt(i);
            if(Character.isUpperCase(ch)){
                strarr[j]=ch;
                j+=1;
            }
        }
        String lstr =str.toLowerCase();
        char lstrarr[]=lstr.toCharArray();
        for(int i=0;i<lstrarr.length;i++){
            for(int k=i+1;k<lstrarr.length;k++){
                if(lstrarr[i]> lstrarr[k]){
                    char temp=lstrarr[i];
                    lstrarr[i]= lstrarr[k];
                    lstrarr[k]=temp;
                }
            }
        }
        for (int i = 0; i < strarr.length; i++)
        {
            System.out.print(strarr[i]);
        }
        System.out.println();
        for (int i = 0; i < lstrarr.length; i++)
        {
            System.out.print(lstrarr[i]);
        }
        System.out.println();
        for (int i=0;i<strarr.length;i++){
            for(int k=0;k<lstrarr.length;k++){
                int t=strarr[i]+32;
                if(t==lstrarr[k]){
                    lstrarr[k]=strarr[i];
                    break;
                }
            }
        }
        for (int i = 0; i < lstrarr.length; i++)
        {
            System.out.print(lstrarr[i]);
        }






    }
}
