public class prg29addzero_toendofArray
{
    public static void main(String[] args) {
        int arr[]={0,2,1,0};
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]==0) {
                int temp = arr[i];
                for (int j = i - 1; j >= 0; j--) {
                    arr[j+1]=arr[j];

                }
                arr[0]=temp;
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
