import java.util.*;
class PercenttoGrade{
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter your percentage: ");
    int P=sc.nextInt();
    if (P>=90){
        System.out.print("Your grade is A+.");
    }else if (P>=80){
        System.out.print("Your grade is A.");
    }else if (P>=70){
        System.out.print("Your grade is B+.");
    }else if (P>=60){
        System.out.print("Your grade is B.");
    }else if (P>=50){
        System.out.print("Your grade is C+.");
    }else if (P>=50){
        System.out.print("Your grade is C.");
    }else{
        System.out.print("You are failed.No grade.");
    }
        
}
}
