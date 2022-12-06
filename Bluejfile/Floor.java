import java.util.*;
class Floor{
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Floor:");
    int Floor=sc.nextInt();
    int actual_floor;
    if (Floor>12){
        System.out.println("The floor isn't actual floor");
        actual_floor=Floor-1;
    }else {
        System.out.println("The floor is actual floor");
        actual_floor=Floor;
    }
    
    System.out.println("The elevator will travel to the actual floor "+actual_floor);
    
}
}