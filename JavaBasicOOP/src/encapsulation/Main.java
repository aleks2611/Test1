package encapsulation;

public class Main {


    public static void main(String[] args) {
/*
        Player player = new Player();
        player.name = "Aleks";
        player.health = 5;
        player.weapon = "AleksandraGun";

        int damage = 10;
        player.loseHealth(damage);
        System.out.println("Remaining health" + player.healthRemaining());
*/


        EnhancedPalyer player = new EnhancedPalyer("Aleks", 20, "Aleksandra");
        System.out.println("This is my method " + player.getHealth());
    }
}
