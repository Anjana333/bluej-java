
import java.util.*;
class Shop
 {
  public static void main(String[] args) {
    Scanner sc=new Scanner (System.in);
    System.out.println("Enter your size:");
    int size =sc.nextInt();
    String Preference;

    switch (size) {

      case 29:
        Preference = "Available";
        break;

      case 32:
       Preference = "Available";
        break;

      case 36:
       Preference = "Available";
        break;

      case 40:
        Preference = "Available";
        break;
      
      default:
       Preference="not available ";

    }
    System.out.println("Your size T-shirt is: " + Preference);
  }
}