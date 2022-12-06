import java.util.*;
class Result
{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the marks of english: ");
        int E=sc.nextInt();
        System.out.print("enter the marks of nepali: ");
        int N=sc.nextInt();
        System.out.print("enter the marks of maths: ");
        int M=sc.nextInt();
        System.out.print("enter the marks of science: ");
        int S=sc.nextInt();
        if (E>=40 && N>=40 && M>=40 && S>=40){
                        System.out.println("You have passed the exam.");
                    }else{
                        System.out.println("You have failed the exam.");
                    
                    }
                }
}  
   
  