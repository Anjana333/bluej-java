import java.util.*;
class PositiveorNegative{
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter number: ");
    int n=sc.nextInt();
    if (n>0){
        System.out.print(n + " is positive number.");
    }else if (n<0){
        System.out.print(n + " is negative number.");
    }else{
        System.out.print(n + " is zero number.");
    }
    
}
}
