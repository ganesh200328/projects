public class prg24geteven_odd_separateArray
{
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        int even=0;
        int odd=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                even+=1;
            }
            else{
                odd+=1;
            }

        }
        int Even_array[]=new int[even];
        int odd_array[]=new int[odd];
        int e=0;
        int o=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0) {
                Even_array[e] =arr[i];
                e++;
            }
            else{
                odd_array[o]=arr[i];
                o++;

            }
        }
        for(int i=0;i<Even_array.length;i++){
            System.out.print(Even_array[i]+" ");
        }
        System.out.println();
        for(int i=0;i<odd_array.length;i++){
            System.out.print(odd_array[i]+" ");
        }
        System.out.println();
        if(Even_array.length==odd_array.length) {
            System.out.println("eQual");
        }
        else {
            System.out.println("NOt equal");

    }


}
}
