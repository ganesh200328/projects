public class prg9sortarray_wobuiltin
{
    public static void main(String[] args) {
        int arr[]={9,3,8,4,7,5,6,1};
        int temp;
        int sortarray[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            sortarray[i]=arr[i];

        }
        System.out.println("Origninal array:");
        for(int i=0;i<arr.length;i++){
            System.out.print(sortarray[i]);
        }
        System.out.println();


        for (int j=0;j<arr.length;j++) {
            for (int i = 0; i < arr.length-1 ; i++) {
                System.out.println(i);

                if (arr[i] > arr[i + 1]) {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
        System.out.println("Sorted array Accending:");
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]);
        }
        System.out.println();
        System.out.println("Second largest="+arr[arr.length-2]);
        int store_ascsort[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            store_ascsort[i]=arr[i];
        }

        temp=0;
        int j=arr.length-1;
        for(int i=0;i<arr.length/2;i++){
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            j--;
        }
        System.out.println("DSC ARRAY:");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
        System.out.println();


    }
}
