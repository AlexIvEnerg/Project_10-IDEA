public class Main {
    public static void main(String[] args) {
        Double double1 = Double.valueOf("37");  // creating of Double objects
        Double double2 = Double.valueOf("46.76");
        System.out.println(double1);
        System.out.println(double2);

        double double_prim1 = Double.parseDouble("36.8");  // String -> double
        double double_prim2 = Double.parseDouble("4.7");
        System.out.println(double_prim1);
        System.out.println(double_prim2);

        double double_prim = double1.intValue();  //  Double -> primitive types
        int int_prim = double1.intValue();
        byte byte_prim = double1.byteValue();
        short short_prim = double1.shortValue();
        long long_prim = double1.longValue();
        float float_prim = double1.floatValue();

        System.out.println(double_prim);
        System.out.println(int_prim);
        System.out.println(byte_prim);
        System.out.println(short_prim);
        System.out.println(long_prim);
        System.out.println(float_prim);

        String double_str = Double.toString(3.14);  // double -> String
        System.out.println(double_str);
    }
}