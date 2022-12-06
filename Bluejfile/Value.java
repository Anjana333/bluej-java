public class Value{
    public static void main(String[] args){
        int k=5;
        int num=0;
        int num1=num+k*2;
        int num2=num+k*2;
        System.out.println("value of num1 and num2 are:" + num1 + "," +num2);
        if (num1==num2){
            System.out.println("value of num1 and num2 are equal.");
        }else{
            System.out.println("value of num1 and num2 aren't equal.");
        }
    }
}