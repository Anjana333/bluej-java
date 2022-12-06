import java.util.*;
class Hemisphere{
    public static void main(String[] args){
        Scanner ak=new Scanner(System.in);
        System.out.print("Enter the value of radius:");
        int r=ak.nextInt();
        double pi=3.14;
        double TSA=3*pi*r*r;
        System.out.println("TSA of hemisphere :" +TSA );
        
    }
}