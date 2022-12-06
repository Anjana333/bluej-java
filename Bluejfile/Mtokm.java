import java.util.*;
class Mtokm{
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter the value in meter:");
        int m=sc.nextInt();
        int a=m%1000;
        int b=m/1000;
        System.out.println("Meter into Km and m is: " +b +"Km and " + a +"m.");
    }
    
}