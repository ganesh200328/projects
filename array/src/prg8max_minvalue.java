public class prg8max_minvalue {
    public static void main(String[] args) {
        int arr[]={66,4,5,2,98,1};
        int maxvalue=0;
        int minvalue=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>maxvalue) {
                maxvalue = arr[i];
            }
            if(arr[i]<minvalue){
                minvalue=arr[i];
            }
        }
        System.out.printf("MAx %d\n",maxvalue);
        System.out.printf("MIN %d",minvalue);
    }
}
