package hexlet.code.interfaces;

import java.util.Random;

public class Utils {
    private static final Random RANDOM = new Random();

    public static int generateRandomNumber() {
        return RANDOM.nextInt(1, 101);
    }

    public static int generateRandomNumber(int upperBound) {
        return RANDOM.nextInt(1, upperBound);
    }

    public static int generateRandomNumber(int lowerBound, int upperBound) {
        return RANDOM.nextInt(lowerBound, upperBound);
    }
}
