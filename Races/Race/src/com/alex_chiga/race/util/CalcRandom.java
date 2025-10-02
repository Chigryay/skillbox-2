package com.alex_chiga.race.util;

import java.util.Random;

public class CalcRandom {
    public static int calcRandom() {
        Random random = new Random();
        return random.nextInt(100) + 1;
    }
}
