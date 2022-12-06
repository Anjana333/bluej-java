import java.util.*;
class Costofpaint{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the length of walls: ");
        int l=sc.nextInt();
        System.out.print("enter the breadth of walls: ");
        int b=sc.nextInt();
        System.out.print("enter the height of walls: ");
        int h=sc.nextInt();
        System.out.print("enter the  of cost to paint per square unit: ");
        double C=sc.nextDouble();
        double A=2*(l+b)*h;
        double T=A*C;
        System.out.printf("Total cost to paint four walls is %.2f:",T);
        
    }
}