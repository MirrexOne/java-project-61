package hexlet.code.games;

import hexlet.code.interfaces.Engine;
import hexlet.code.interfaces.Utils;

public class PrimeNumber {
    private static final String GAME_RULES_DESCRIPTION = "Answer 'yes' if given number is prime. "
            + "Otherwise answer 'no'.";

    public static void launchEvenGame() {
        String[][] gameData = generateGameData();
        Engine.launchEngine(GAME_RULES_DESCRIPTION, gameData);
    }

    private static String[][] generateGameData() {
        String[][] gameData = new String[3][2];

        for (int i = 0; i < gameData.length; i++) {
            int randomNumber = Utils.generateRandomNumber(1, 102);
            String question = String.valueOf(randomNumber);
            String correctAnswer = isPrime(randomNumber) ? "yes" : "no";
            gameData[i][0] = question;
            gameData[i][1] = correctAnswer;

        }
        return gameData;
    }

    private static boolean isPrime(int randomNumber) {
        double root = Math.sqrt(randomNumber);
        int roundToFloor = (int) Math.floor(root);

        if (randomNumber <= 1) {
            return false;
        }

        boolean result = true;
        int initialValue = 2;
        while (initialValue <= roundToFloor) {
            if (randomNumber % initialValue == 0) {
                result = false;
                break;
            }
            initialValue++;
        }
        return result;
    }
}

