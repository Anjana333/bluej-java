import java.util.*;
class Arithmetic{
 public static void main(String[] args){
     Scanner sc=new Scanner (System.in);
     System.out.println("Enter first number:");
     int a=sc.nextInt();
       System.out.println("Enter second number:");
     int b=sc.nextInt();
    System.out.println("a + b = " + (a + b));
    System.out.println("a - b = " + (a - b));
    System.out.println("a * b = " + (a * b));
    System.out.println("a / b = " + (a / b));
    System.out.println("a % b = " + (a % b));
    System.out.println("a ** b = "+ Math.pow(a , b));
  }
}