public class prg26checkarray_value_equal
{
    public static void main(String[] args) {
        int arr[]={1,3,5,7};
        int brr[]={1,3,5};
        int e=0;
        for(int i=0;i<brr.length;i++){
            if(arr[i]==brr[i]){
                e++;
            }

        }
        if(e==arr.length) {
            System.out.println("Equal");
        }
        else{
            System.out.println("not equal");
        }
    }
}
