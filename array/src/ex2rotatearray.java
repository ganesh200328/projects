public class ex2rotatearray
{
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50};
        int rotate=3;
        for(int i=0;i<rotate;i++){
            int temp=arr[0];
            for(int j=0;j<arr.length-1;j++){
                arr[j]=arr[j+1];
            }
            arr[arr.length-1]=temp;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
