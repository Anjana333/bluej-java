import java.util.*;
class PrintCopies{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Number of copies to be printed:");
        int C=sc.nextInt();
        double a=0.30;
        double b=0.28;
        double c=0.27;
        double d=0.26;
        double e=0.25;
        if (C<=99){
            System.out.println("The price per copy is $"+a);
            System.out.printf("The total price for printing copies is $ %.2f",(a*C));
        }else if(C>99 && C<=499){
               System.out.println("The price per copy is $"+b); 
                System.out.printf("The total price for printing copies is $%.2f",(b*C));
            }else if (C>499 && C<=799){
                 System.out.println("The price per copy is $"+c); 
                System.out.printf("The total price for printing copies is $%.2f",(c*C));
            }else if (C>799 && C<=1000){
                 System.out.println("The price per copy is $"+d); 
                System.out.printf("The total price for printing copies is $%.2f",(d*C));
            }else{
                 System.out.println("The price per copy is $"+e); 
                System.out.printf("The total price for printing copies is $%.2f",(e*C));
            }
            
        
    }
}