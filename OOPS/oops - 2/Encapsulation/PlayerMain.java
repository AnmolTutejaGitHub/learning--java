package Encapsulation;

public class PlayerMain {

    public static void main(String[] args) {

        // Player player = new Player();
        // player.name = "Tim";
        // player.health = 20;
        // player.weapon = "Sword";

        // int damage = 10;
        // player.loseHealth(damage);
        // System.out.println("Remaining health = " + player.healthRemaining());

        // player.health = 200;

        // //Allowing direct access to data on an object, can potentially bypass checks,
        // // and additional processing, your class has in place to manage the data.
        // // In Player class we introduced a method/check for player health can't be
        // // greater than 100

        // player.loseHealth(11);
        // System.out.println("Remaining health = " + player.healthRemaining());

        EnhancedPlayer tim = new EnhancedPlayer("Tim", 200, "Sword");
        System.out.println("Initial health is " + tim.healthRemaining()); // Initial health is 100
    }
}
