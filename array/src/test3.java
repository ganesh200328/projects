public class test3
{
    public static void main(String[] args) {
        int arr[]={-1,2,-3,4,-5};
        int negcount=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
                negcount++;
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("NEGATIVE COUNT:"+negcount);
    }
}
