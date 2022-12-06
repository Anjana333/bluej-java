import java.util.*;
class UserInput{
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter your last name:");
        String last_name=sc.nextLine();
        System.out.print("Enter your age:");
        int age=sc.nextInt();
        System.out.print("Enter temperature:");
        float current_temperature=sc.nextFloat();
        System.out.println(last_name);
        System.out.println(age);
        System.out.println(current_temperature);
    
}
}