public class prg15reverse_rotational
{
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50};
        int rotate=3;
        for(int i=0;i<3;i++)
        {
            int temp=arr[arr.length-1];
            for(int j=arr.length-1;j>0;j--)
            {
                arr[j]=arr[j-1];

            }
            arr[0]=temp;

        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }


    }
}
