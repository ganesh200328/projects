public class ex1find_index
{
    public static void main(String[] args) {
        int arr[]={10,20,30,30,40,50};
        int T=30;
        int index=0;
        int freq=0;
        System.out.println();
        System.out.println("Index..");
        for(int i=0;i<arr.length;i++){
            if(T==arr[i]){
                System.out.print(i+" ");
                index=i;
                freq++;
            }
        }
        System.out.println();
        System.out.println(freq);
    }
}

