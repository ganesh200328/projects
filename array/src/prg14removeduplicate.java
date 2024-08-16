public class prg14removeduplicate
{
    public static void main(String[] args) {
        int arr[]={1,2,3,4,2,7,8,8,3,6,8};
        int c=0;
        for(int i=0;i<arr.length/2;i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]==arr[j])
                {
                    c+=1;
                    System.out.print(arr[j]+" ");
                }
            }
        }
        System.out.println();
        System.out.println(c);
    }
}
