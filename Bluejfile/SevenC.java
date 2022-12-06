import java.util.*;
class SevenC{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no of college credit earned:");
        int a=sc.nextInt();
        if (a>=90){
            System.out.print("Senior Status");
        }else if (a>=60){
            System.out.print("Junior Status");
        }else if (a>=30){
            System.out.print("Sophomore Status");
        }else{
            System.out.print("Freshman Status");
        }
    }
    
}