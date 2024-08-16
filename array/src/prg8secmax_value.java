public class prg8secmax_value
{
    public static void main(String[] args) {
        int arr[] = {5,4,2,1,3};
        int max = 0;
        int secmax = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max) {
                secmax=max;
                max = arr[i];
            }
            else if(arr[i]>secmax) {
                secmax = arr[i];
            }
        }
        System.out.println(max);
        System.out.println(secmax);


    }
}

