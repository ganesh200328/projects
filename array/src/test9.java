public class test9
{
    public static void main(String[] args) {
        int arr[]={14,12,13,11,10};
        int max=0;
        int secmax=0;
        for(int i=0;i<arr.length;i++) {
            if(arr[i]>max){
                secmax=max;
                max=arr[i];
            }
            else if(arr[i]>secmax){
                secmax=arr[i];
            }

        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("MAXX:"+max);
        System.out.println("Secmax:"+secmax);
    }
}
