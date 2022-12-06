import java.util.*;
class IndefiniteLoop{
    public static void main(String[] args){
        int sum=0;
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter any number:");
        int num=sc.nextInt();
        while (num!=0){
            sum=sum+num;
            System.out.println("Enter another number,or 0 to stop");
            num=sc.nextInt();
            
            
        }
        System.out.print("the sum of numbers="+sum);
        
        
    }
}  