package metods;

public class MethodsTask {
    public static void main(String[] args) {

    }

    public void displayHighScorePosition(String playersName, int positionInHighSchool) {
        playersName = "Aleksandra";
        positionInHighSchool = 1;
        System.out.println("Manegd to get into possition" + playersName);
        System.out.println("Possition" + positionInHighSchool);

    }

    public int calculateHighScorePostion(int playeerScore) {
        if (playeerScore > 1000) {
            return 1;
        } else if (playeerScore > 500 && playeerScore < 1000) {
            return 2;
        } else if (playeerScore > 100 && playeerScore < 500) {
            return 3;
        }else {
return 4;
        }


    }


}


