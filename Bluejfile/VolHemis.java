import java.util.*;
class VolHemis{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter value of r: ");
        double r=sc.nextDouble();
        double pi=3.14;
        double V=(2*pi*r*r*r)/3;
        System.out.printf("Volume of hemisphere is %.3f", V);
    }
}