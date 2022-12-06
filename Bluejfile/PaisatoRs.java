import java.util.*;
class PaisatoRs{
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter the value in Paisa:");
        double paisa=sc.nextDouble();
        double a=paisa/100;
        
        System.out.println("paisa into rs is: " +a);
    }
    
}