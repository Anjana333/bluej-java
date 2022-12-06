import java.util.*;
class Profitorloss{
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter S.P:");
        int sp=sc.nextInt();
        System.out.print("Enter C.P:");
        double cp=sc.nextDouble();
        double profit= ((sp-cp)/cp)*100;
        double loss= ((cp-sp)/cp)*100 ;
        if (sp>cp){
            System.out.println("profit percent is "+profit);
        }else if (cp>sp){
            System.out.println("loss percent is "+loss);
        }else{
            System.out.println("No profit, no loss ");
        }
        
    }
}  