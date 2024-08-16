public class                                                                                                                                                                                                                                                                                                stringcharAt
{
    public static void main(String[] args) {
        String str="Ganesh";
        char ch=str.charAt(2);
        System.out.println(ch);


        System.out.println();
        String arr[]={"Ganesh","Kumar"};
        for(int i=0;i<arr.length;i++){
//            int len=arr[i].length();
            for(int j=0;j<arr[i].length();j++) {
                char Char = arr[i].charAt(j);
                System.out.print(Char);
            }
            System.out.println();
        }
    }
}
