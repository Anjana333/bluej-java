import java.util.*;
class IfelseIf{
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter your age: ");
    int A=sc.nextInt();
    if (A<=10){
        System.out.print("You are child.");
    }else if (A>10 && A<=20){
        System.out.print("You are adult.");
    }else{ 
        System.out.print("You are senior");
    
    }
        
}
}
