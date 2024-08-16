public class vowelscount
{
    public static void main(String[] args) {
        String str="Gaaneeesh";
        int count=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if((ch=='A') || (ch=='a') || (ch=='E') || (ch=='e') || (ch=='I') || (ch=='i') || (ch=='O') || (ch=='o') || (ch=='U') ||ch=='u'){
                count+=1;

            }
        }
        System.out.println(count);
    }
}
