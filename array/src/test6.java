public class test6
{
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        int even=0;
        int odd=0;
        for(int i=0;i< arr.length;i++){
            if(arr[i]%2==0){
                even++;
            }
            else {
                odd++;
            }
        }
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("EVEN:"+even);
        System.out.println("ODD:"+odd);
    }
}
