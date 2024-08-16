public class foreacharray
{
    public static void main(String[] args){
        int a[]={1,2,3,4,5};
        String b[]={"gan","esh","kum"};
        int sum=0,mul=1;
        for (int i:a)
        {
            System.out.print(i);
            sum+=i;
            mul*=i;
        }
        System.out.println();
        System.out.println("SUMMM==>>"+sum);
        System.out.println("MULLL==>>"+mul);
    }
}
