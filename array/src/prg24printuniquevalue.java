public class prg24printuniquevalue
{
    public static void main(String[] args) {


        int arr[] = {1, 3, 4, 2, 4, 3};
        int brr[]=new int[6];
        int dup=0;

        int index=0;
        for(int i=0;i<arr.length;i++){
             int temp=0;
             for(int j=0;j<i;j++){
                 if(arr[i]==arr[j]){
                     dup++;
                     temp=1;
                     break;
                 }
             }
             if(temp==0){
                 brr[index]=arr[i];
                 index++;
             }
        }
        for(int i=0;i<brr.length;i++){
            System.out.print(brr[i]);
        }
        System.out.println();
        System.out.println("dup"+dup);
    }

}
