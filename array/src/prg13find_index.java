public class prg13find_index {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int n = 5;
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]!=n) {
                index+=1;



            }
            else{
                break;
            }
        }
        System.out.println(index);
    }
}

