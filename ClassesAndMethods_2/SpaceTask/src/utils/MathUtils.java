package utils;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class MathUtils {
    public static final double PI;

    static {
        PI = roundPI();
    }

    public static double calculateSurfaceArea(double radius) {
        return 4 * PI * Math.pow(radius, 2);
    }

    public static double calculateEquatorLength(double radius) {
        return 2 * PI * radius;
    }

    private static double roundPI() {
        return BigDecimal.valueOf(Math.PI).setScale(4, RoundingMode.HALF_UP).doubleValue();
    }
}
