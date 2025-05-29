package JavaSzzy.operation;

public class OperationDemo5 {
    public static void main(String[] args) {
        //Master the use of logical operations
        //The phone must have a size of at least 6.5 inches and a memory capacity of at least 8GB
        double size=6.8;
        int storage=16;
        boolean rs=size>=6.5&&storage>=8;
        System.out.println(rs);
    }
}
