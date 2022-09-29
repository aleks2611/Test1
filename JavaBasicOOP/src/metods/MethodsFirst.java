package metods;

public class MethodsFirst {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.printf("I am calculate variable");

        gameOver = true;
        score = 1000;
        levelCompleted = 8;

        highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.printf("I am calculate variable second");


    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            System.out.println("Your final score was " + finalScore);
            return finalScore;

        }
        return score;

    }
}


