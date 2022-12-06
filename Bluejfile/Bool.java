public class Bool
{
    public static void main(String [] args)
    {
        int C=7;
        int D=7;
     boolean result1 = true && true;
    boolean result2= true && false || true;
    boolean result3= false && false || true;
    
    boolean result5= !(false) && true;
    boolean result6= !(true && !(false && false));
    boolean result7= (10 > 14) && (4 == 5);
    
    boolean result9= (3 * 4) != (13 - 2) && ('C' >= 'D');
    boolean result10= (12 * 2) == (3 * 8);
    boolean result11= (14 * 2) != (3 * 8);
    System.out.println(result1);
    System.out.println(result2);
    System.out.println(result3);
    System.out.println(result5);
    System.out.println(result6);
    System.out.println(result7);
    System.out.println(result9);
    System.out.println(result10);
    System.out.println(result11);
}
    
}