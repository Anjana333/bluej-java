import java.util.*;
class GradePercent{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your marks in English: ");
        int e=sc.nextInt();
        System.out.print("Enter your marks in Nepali: ");
        int n=sc.nextInt();
        System.out.print("Enter your marks in Mathematics: ");
        int m=sc.nextInt();
        System.out.print("Enter your marks in Science: ");
        int s=sc.nextInt();
        System.out.print("Enter your marks in computer: ");
        int c=sc.nextInt();
        int T = e + n + m + s + c;
        double P = (T/500.0)*100.0;
        System.out.println("Your total marks is:" +T);
        System.out.println("You have secured " +P + "percentage.");
      
        if (e>=40 && n>=40 && m>=40 && s>=40 && c>=40){
            System.out.print("You are pass.");
            if (P>=90 ){
                System.out.print("Your grade is A+.");
            }if (P<90 && P>=80){
                System.out.print("Your grade is A.");
            }if (P<80 && P>=70){
                System.out.print("Your grade is B+.");
            }if (P<70 && P>=60){
                System.out.print("Your grade is B.");
            }if (P<60 && P>=50){
                System.out.print("Your grade is C+.");
            }
            if (P<50){
                System.out.print("Your grade is C.");
            }
        }
            else{
                System.out.print("You are failed. No grade.");
            }
            
            }
        }
        
            
            
                    
 
   
  