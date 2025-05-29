package JavaSzzy.type;

public class TypeConversionDemo1 {
    public static void main(String[] args) {
        //Understand the automatic type conversion mechanism
        byte a = 1;
        int b = a;
        System.out.println(a);
        System.out.println(b);

        char c = 'a';
        int d = c;
        System.out.println(d);
    }
}
