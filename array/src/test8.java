public class test8
{
    public static void main(String[] args) {
        int arr[] = {14,12,13,11,10};
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("MAX: "+max);
        System.out.println("MIN: "+min);
    }





}



