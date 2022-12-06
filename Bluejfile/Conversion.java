public class Conversion{
    public static void main(String[] args){
        int time=13445;
        int a=time%60;
        
        int b=time/60;
        int c=b%60;
        int d=b/60;
        System.out.println(d +"hours,"+c+"minutes and"+a+ "seconds.");
        
    }
}