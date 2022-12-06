public class WhileLoopBackCount{
    public static void main(String[] args){
        int num=25;
        while (num>=10){
            System.out.println("The square root of " +num+ " is " +Math.sqrt(num));
            num-=5;
        }
        
    }
}