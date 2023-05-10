public class Constants {
    public static void main(String[] args) {
        final double PI = Math.PI;
        double radius = 5.25;
        double area = (radius * PI) * (radius * PI);
        // Math.pow(数字, 幂) => 幂运算
        System.out.println(Math.pow((radius * PI), 2));
        System.out.println(area);
    }
}
