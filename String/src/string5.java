public class string5
{
    public static void main(String[] args) {
        String s1="Ganesh";
        String s3="Ganesh";
        String s2=new String("Ganesh");
        if(s1.equals(s2)){
            System.out.println("true");
        }
        if(s1==s3){
            System.out.println("True");
        }
    }
}
