import java.util.*;
class Interest
{ 
    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);
        System.out.print("Principal=");
        int a=sc.nextInt();
        System.out.print("time=");
        int b=sc.nextInt();
        System.out.print("rate=");
        int c=sc.nextInt();
        double d=(a*b*c)/100;
        double e=a+d;
        System.out.println("Simple interest is: " + d);
        System.out.println("Total amount is: " +e);
        
    }
}
  
        