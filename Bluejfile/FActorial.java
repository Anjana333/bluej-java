import java.util.*;
class FActorial{
    public static void main(String[] args){
        long fact=1;
        int i=1;
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter number for factorial:");
        long n=sc.nextLong();
        
        while (i<=n){
            fact=fact*i;
            i++;
        }
        System.out.println("\nFactorial of "+n +"is:" + fact);
        
    }
}  