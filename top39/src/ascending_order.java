public class ascending_order
{
    public static void main(String[] args) {
        String Strarr[]={"Ganesh","Kumar","Arun","arun"};
        for(int i=0;i<Strarr.length;i++){
            for(int j=i+1;j<Strarr.length;j++){
                if(Strarr[i].compareTo(Strarr[j])>0){
                    String temp=Strarr[i];
                    Strarr[i]=Strarr[j];
                    Strarr[j]=temp;
                }
            }
        }
        for(int i=0;i<Strarr.length;i++) {
            System.out.print(Strarr[i]+" ");
        }
    }
}

