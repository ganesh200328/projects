public class anagram
{
    public static void main(String[] args) {
        String str="gentlemaan";
        String str1="elegantman";
        int count=0;
//        if(str.length()!=str1.length()) {
//            System.out.println("Not anagram");
//        }

        for(int i=0;i<str.length();i++){
            for(int j=0;j<str1.length();j++){
                char ch=str.charAt(i);
                char ch1=str1.charAt(j);
                if(ch==ch1){
                    System.out.println(ch+""+ch1);
                    count+=1;
                    break;
                }
            }
        }
        System.out.println(count);
        if(count==str.length()){
            System.out.println("Anagram");
        }
        else{
            System.out.println("Not Anagram");
        }
    }
}
