import java.util.*;
class Cylinder{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the height of cylinder:");
        double h=sc.nextDouble();
        System.out.print("enter value of radius:");
        double r=sc.nextDouble();
        double pi=3.14;
        double TSA=2.0*pi*r*(r+h);
        double V=pi*r*r*h;
        System.out.printf("TSA is "+TSA+ "," + "V is "+V);
    
    }
}