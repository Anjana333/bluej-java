public class Triangle
{
    public static void main(String[] args)
    {
        int a=10;
        int b=13;
        double c=17.5;
        double s=(a+b+c)/2;
        double A=Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("The area of triangle is: "+ A);
    }
}