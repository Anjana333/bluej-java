import java.util.*;
class Price{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the quantity of pen: ");
        int a=sc.nextInt();
        System.out.print("enter the quantity of copy: ");
        int b=sc.nextInt();
        System.out.print("enter the quantity of pencil: ");
        int c=sc.nextInt();
        System.out.print("enter the  rate of pen: ");
        double d=sc.nextDouble();
         System.out.print("enter the  rate of copy: ");
        double e=sc.nextDouble();
         System.out.print("enter the  rate of pencil: ");
        double f=sc.nextDouble();
        double T=(a*d)+(b*e)+(c*f);
        System.out.printf("Total cost amount is:"+T);
        
    }
}