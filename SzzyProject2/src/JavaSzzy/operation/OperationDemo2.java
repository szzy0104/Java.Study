package JavaSzzy.operation;

public class OperationDemo2 {
    public static void main(String[] args) {
        //Master increment and decrement operations
        int a = 10;
        //pre-increment；Use first,then add
        ++a;
        System.out.println(a);
        //post-increment;Add first,then use
        a++;
        System.out.println(a);
//        System.out.println(2++); Can't be applied to a literal
    }
}
