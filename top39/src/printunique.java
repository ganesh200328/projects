public class printunique {
    public static void main(String[] args) {
        String s="aabbaccd";
        char st[]=s.toCharArray();
        int oc[]=new int[s.length()];
        char ac[]=new char[s.length()];
        char temp='&';
        int c=0;
        for(int i=0;i<st.length;i++){
            int count=1;
            for(int j=i+1;j<st.length;j++){
                if(st[i]==st[j]){
                    count+=1;
                    oc[j]=temp;
                }
            }

            if(oc[i]!=temp){
                oc[i]=count;
            }
            if(oc[i]!=temp) {
                ac[i] = st[i];



            }
        }
        for(int i=0;i<st.length;i++) {
            System.out.print(st[i]);

        }
        System.out.println();
        for(int i=0;i<st.length;i++) {
            if (oc[i] != temp) {
                System.out.print(ac[i]);
            }
        }
        System.out.println();
        for(int i=0;i<st.length;i++) {
            if (oc[i] != temp) {
                System.out.println(st[i]+""+oc[i]);
            }
        }
        System.out.println("dup"+c);
    }
}
