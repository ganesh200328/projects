public class occurrence {
    public static void main(String[] args) {
        String s="aabbaccd";
        char st[]=s.toCharArray();
        int oc[]=new int[s.length()];
        char ac[]=new char[s.length()];
        char temp='&';
        System.out.println(temp);
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
            if(ac[i]!=temp){
                ac[i]=st[i];
            }
        }
        for(int i=0;i<st.length;i++){
            if (oc[i]!=temp) {

                System.out.println(st[i] + " " + oc[i]);
            }
        }
    }
}
