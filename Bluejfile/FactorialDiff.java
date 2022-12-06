public class FactorialDiff{
    public static void main(String[] args){
        int i=1;
        int n1=4;
        int n2=7;
        int fact1=1;
        int fact2=1;
         while (i<=n1){
           fact1=fact1*i;
            i++;
        }
         while (i<=n2){
           fact2=fact2*i;
            i++;
        }
        System.out.println("The difference between 7! and 4! is:"+(fact2-fact1));
    }
}