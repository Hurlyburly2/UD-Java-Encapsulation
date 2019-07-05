package com.dsimon;

public class Main {

    public static void main(String[] args) {

        // THE BAD WAY
//        Player player = new Player();
//
//        player.name = "Doug";
//        player.health = 20;
//        player.weapon = "sword";
//
//        int damage = 10;
//        player.loseHealth(damage);
//
//        System.out.println("Remaining health = " + player.healthRemaining());
//
//        damage = 11;
//        player.loseHealth(damage);

        EnhancedPlayer player = new EnhancedPlayer("Doug", 50, "Sword");
        System.out.println("Initial health is: " + player.getHealth());
    }
}
