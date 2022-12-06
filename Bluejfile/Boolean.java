public class Boolean{
    public static void main(String[] args){
    
boolean result = true && true;
boolean result1 = true && false || true;
boolean result2 = false && false || true;
boolean result4 = !(false) && true;
boolean result5 = !(true && !(false &&
false));
boolean result6 = (10 > 14) && (4 == 5);
boolean result8 = (3 * 4) != (14 - 2) && ('C' >= 'D');
boolean result9 = (12 * 2) == (3 * 8);
boolean result10 = (14 * 2) != (3 * 8);  
 System.out.println(result);
     System.out.println(result1);
     System.out.println(result2);
     
    System.out.println(result4);
     System.out.println(result5);
     System.out.println(result6);
     System.out.println(result8);
    System.out.println(result9);
     System.out.println(result10);
   }
}