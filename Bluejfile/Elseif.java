import java.util.*;
class Elseif
{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter A or B or C: ");
        char x=sc.next().charAt(0);
        
      
         if (x=='A'){
            System.out.println("Apple");
        }else if(x=='B'){
            System.out.println("Banana");
        }else if (x=='C'){
            System.out.println("Coconut");
        }else{
                System.out.println("Nothing");
            }
            }
                    
}  
   
  