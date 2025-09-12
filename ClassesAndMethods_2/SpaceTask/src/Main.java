import utils.MathUtils;

public class Main {
    public static void main(String[] args) {
        final double radiusEarth = 6371;
        System.out.println("Площадь поверхности шара = " + MathUtils.calculateSurfaceArea(radiusEarth));
        System.out.println("Длина экватора = " + MathUtils.calculateEquatorLength(radiusEarth));
        System.out.println(MathUtils.PI);
    }
}
