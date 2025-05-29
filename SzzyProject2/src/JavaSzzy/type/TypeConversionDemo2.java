package JavaSzzy.type;

public class TypeConversionDemo2 {
    public static void main(String[] args) {
        //Master the automatic type conversion of expressions
        byte a=10;
        int b=20;
        long c=30;
        long rs=a+b+c;
        System.out.println(rs);
    }

}
//在表达式中，byte，short，char是直接转换成int进行计算的