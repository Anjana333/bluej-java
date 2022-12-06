public class SplitString{
    public static void main(String[] args){
        String dumb="You are like a child";
        String split[]=dumb.split("\\s");
        for (String s:split)
        System.out.println(s);
    }
}

        