package JavaSzzy.operation;

public class OperationDemo6 {
    public static void main(String[] args) {
        //Master the use of ternary operator
        double score=98.5;
        String rs=score>90?"pass":"fail";
        System.out.println(rs);

        int a=20,b=20;
        String t=a>b?"a":"b";
        System.out.println(t);
//The &&(logical AND)operator is a higher precedence than the ||(logical OR) operator

        System.out.println(10 > 3 || 10 > 3 && 10 < 3);
        ;
    }
}
