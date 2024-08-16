public class array
{
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        System.out.println(arr);
        for(int i=0;i<=arr.length;i++){
            System.out.print(i);

        }
        System.out.println();
        int arr1[][]={{1,2,3},{4,5,6}};
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr1[0].length;j++){
                System.out.print(arr1[i][j]);
            }
            System.out.println();

        }
        System.out.println();
        int arr3[][][]={{{1,2,3},{4,5,6},{7,8,9}},{{10,11,12},{13,14,15},{16,17,18}}};
        System.out.println("3-D");
        int n=arr3[1][1][2];
        System.out.println("NNNNN=====>"+n);
        for(int i=0;i<arr3.length;i++){
            for(int j=0;j<arr3[0].length;j++){
                for (int k=0;k<arr3[0][0].length;k++){
                    System.out.print(arr3[i][j][k]);
                }
                System.out.println();
            }
        }
    }
}
