public class sortstring {
    public static void main(String[] args) {
        String str="GaNesh";
        char sarr[]=str.toCharArray();
        for(int i=0;i<sarr.length;i++){
            System.out.print(sarr[i]);
        }
        System.out.println();
        for (int i=0;i<sarr.length;i++){
            for(int j=i+1;j<sarr.length;j++){
                if(sarr[i]<sarr[j]){
                    char temp=sarr[i];
                    sarr[i]=sarr[j];
                    sarr[j]=temp;
                }
            }
        }
        for(int i=0;i<sarr.length;i++){
            System.out.print(sarr[i]);
        }


    }
}
