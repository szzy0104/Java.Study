package JavaSzzy.type;

public class TypeConversionDemo3 {
    public static void main(String[] args) {
        //Goal:Master explicit type conversion
        int a = 9999999+1;
        byte b = (byte) a;//alt+enter
        System.out.println(a);
        System.out.println(b);

        double c=99.5;
        int d=(int)c;
        System.out.println(d);
    }
}
