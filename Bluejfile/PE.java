import java.util.*;
class PE
{
    public static void  main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Mass= ");
        double a=sc.nextDouble();
        System.out.print("Height= ");
        double b=sc.nextDouble();
        double g=9.8;
        double P=a*g*b;
        System.out.println("The potential energy is: " + P);
        
    }
}