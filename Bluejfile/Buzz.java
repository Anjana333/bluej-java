import java.util.*;
class Buzz{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        int n=sc.nextInt();
        if (n%7==0 || n%10==7){
          System.out.print(n +" is a buzz number.");  
        }else{
        
          System.out.print(n +" isnot a buzz number."); }
    }
}