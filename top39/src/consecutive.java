public class consecutive
{
    public static void main(String[] args) {
        String str="GGGaaaneeshGg";
        str=str+" ";
        int i,j;
        for(i=0;i<str.length()-1;i++){
            char a1=str.charAt(i);
            if(str.charAt(i)!=str.charAt(i+1)){
                System.out.print(str.charAt(i)+" ");
            }

        }
//        char strarr[]=str.toCharArray();
//        char conarr[]=new char[str.length()];
//        int j=1;
//        int c=0;
//        for(int i=0;i<strarr.length-1;i++){
//            if(strarr[i]==strarr[j]){
//                int t=0;
//                for(int k=0;k<conarr.length;k++) {
//                    if(conarr[k]==strarr[i]) {
//                        t=1;
//
//                    }
//                }
//                if(t==0) {
//                    conarr[c] = strarr[i];
//                    c++;
//                }
//            }
//            j++;
//        }
//        for (int i=0;i<strarr.length;i++){
//            System.out.print(conarr[i]+" ");
//        }
    }
}
