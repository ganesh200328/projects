public class repitative_character
{
    public static void main(String[] args) {
        String str="aacbacc";
        char strarr[]=str.toCharArray();
        int temparr[]=new int[strarr.length];
        char newarr[]=new char[str.length()];
        char temp='&';
        for(int i=0;i<str.length();i++){
            int count=1;
            for(int j=i+1;j<str.length();j++) {
                if(strarr[i]==strarr[j]){
                    temparr[j]=temp;
                    count+=1;
                }
            }
            if(temparr[i]!=temp) {
                temparr[i] = count;
                newarr[i] = strarr[i];
            }

        }

        char reparr[]=new char[str.length()];
        int k1=0;
        for (int k=0;k<strarr.length;k++){
            if(temp!=temparr[k]) {
                if(temparr[k]>1) {
                    reparr[k1]=strarr[k];
                    k1++;
                }
            }
        }
        System.out.println();
        char unique[]=new char[str.length()];
        k1=0;
        for(int i=0;i<strarr.length;i++){
            if(temp!=temparr[i]){
                if(temparr[i]==1){
                    unique[k1]=strarr[i];
                    k1++;
                }
            }
        }
        System.out.println("String arr original");
        for (int i=0;i<strarr.length;i++){

            System.out.print(strarr[i]+" ");
        }
        System.out.println();
        System.out.println("count temporary array");
        for (int i=0;i<temparr.length;i++){
            System.out.print(temparr[i] + " ");

        }
        System.out.println();
        System.out.println("removed duplicate");
        for (int i=0;i<newarr.length;i++){
            if(temp!=temparr[i]) {

                System.out.print(newarr[i] + " ");
            }
        }
        System.out.println();
        System.out.println("Unique");

        for (int i=0;i<unique.length;i++){

            System.out.print(unique[i] + " ");

        }
        System.out.println();

        System.out.println("repitative aray");
        for (int i=0;i<reparr.length;i++){

            System.out.print(reparr[i] + " ");

        }
        System.out.println();







    }
}
