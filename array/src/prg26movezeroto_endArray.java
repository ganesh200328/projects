public class prg26movezeroto_endArray
{
    static void mymethod() {
        int arr[]={1,0,2,0,4,2,0,9};
        for (int i=0;i<arr.length;i++){
            if(arr[i]==0){
                int temp=arr[i];
                for(int j=i+1;j<arr.length;j++){
                    arr[j-1]=arr[j];
                }
                arr[arr.length-1]=temp;
            }
        }
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();


    }

    public static void main(String[] args) {

        mymethod();
    }
}
