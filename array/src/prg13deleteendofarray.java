public class prg13deleteendofarray
{
    public static void main(String[] args) {
        int arr[]={1,2,3,4,7,8,5};

        int n=7;
        int index=0;
        int brr[]=new int[arr.length-1];
        for(int i=0;i<arr.length;i++){
            if(arr[i]==n) {
                break;
            }
            else{
                index+=1;
            }
        }
        System.out.println("index"+index);
        for(int i=0;i<index;i++){
            brr[i]=arr[i];
        }
        for(int i=arr.length-1;i>index;i--){
            brr[i-1]=arr[i];

        }

        for(int i=0;i<brr.length;i++){
            System.out.print(brr[i]);

        }








    }
}
