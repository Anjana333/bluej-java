import java.util.*;
class SumSquare{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter n:");
        int n=sc.nextInt();
        int S=(n*(n+1)*((2*n)+1))/6;
        System.out.println("The sum square of first "+n+ " natural numbers is:" +S);
    }
}