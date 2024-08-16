public class stringarray
{
    public static void main(String[] args) {
        String str="hi this is String";
        str+=" ";
        String arr[]=new String[str.length()];
        String str1="";
        int count=0;
        int j=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(!Character.isWhitespace(ch)){
                str1=str1+ch;
            }
            else {
                arr[j]=str1;
                j++;

                str1="";
            }
        }
        int max=0;
        int secmax=0;
        String maxString="";
        String SecString="";
        for(int i=0;i<arr.length;i++) {
            if (arr[i] != null) {
                if (max < arr[i].length()) {
                    secmax = max;
                    max = arr[i].length();
                    SecString = maxString;
                    maxString = arr[i];

                } else if (secmax < arr[i].length()) {
                    secmax = arr[i].length();
                    SecString = arr[i];
                }
            }
        }
        System.out.println(max);
        System.out.println(maxString);
        System.out.println(secmax);
        System.out.println(SecString);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] !=null){
                System.out.print(arr[i] + " ");
            }
        }
    }
}
