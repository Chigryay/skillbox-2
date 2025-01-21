public class Main {
    public static void main(String[] args) {
        double radiusEarth = 6371;

        double areaOfSphere = MathUtils.calculateSurfaceArea(radiusEarth);
        System.out.println("Площадь Земли: " + areaOfSphere);

        double lengthCircle = MathUtils.calculateEquatorLength(radiusEarth);
        System.out.println("Длина экватора: " + lengthCircle);

        System.out.println(MathUtils.PI);
    }
}
