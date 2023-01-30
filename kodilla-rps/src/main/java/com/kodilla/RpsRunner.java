package com.kodilla;

import com.kodilla.rps.Rps;

import java.util.Scanner;

public class RpsRunner {
    public static void main(String[] args) {
        boolean end = false;
        Rps rps = new Rps();


        System.out.println("Welcome to the game rock paper scissors!");
        System.out.println("Please enter your name : ");

        Scanner scanner = new Scanner(System.in);
        String playerName;
        playerName = scanner.nextLine();
        System.out.println("We are playing until how many wins?");
        int wonRounds = scanner.nextInt();

        System.out.println("""
                Press - 1 - to play ROCK \s
                Press - 2 - to play SCISSORS\s
                Press - 3 - to play PAPER""");
        int playerVictory = 0;
        int computerVictory = 0;
        while (!end) {

            if (wonRounds > playerVictory && wonRounds > computerVictory) {
                rps.chooseWeapon();
                String playerWeapon = rps.getPlayerWeapon();
                rps.computerWeapon();
                String computerWeapon = rps.getComputerWeapon();
                System.out.println("Your weapon : " + playerWeapon + "\nOpponent's weapon : " + computerWeapon);
                String result = rps.fight();
                System.out.println(result);
                if (result.equals("Wictory")) playerVictory++;
                else if ("Defeat".equals(result)) computerVictory++;
                System.out.println(playerName + "'s victory : " + playerVictory +
                        "\nOpponent's victory : " + computerVictory);

            } else if (wonRounds == playerVictory || wonRounds == computerVictory) {
                if (playerVictory > computerVictory) {
                    System.out.println("\nYou won!");
                } else if (playerVictory < computerVictory) {
                    System.out.println("\nYou lost!");
                }
                System.out.println(playerName + "'s victory : " + playerVictory +
                        "\nOpponent's victory : " + computerVictory);
                System.out.println("""
                        Do you wont to continue?\s
                        Press - n - to start new game\s
                        Press - x - to end the game""");
                scanner.nextLine();
                String decision = scanner.nextLine();
                if (decision.equals("x")) {
                    System.out.println("""
                    Are you sure you want to quit playing?\s
                    Press - x - to confirm\s
                    Press - n - to start new game""");
                    decision = scanner.nextLine();
                    if (decision.equals("x")){end = true;}
                } else if (decision.equals("n")) {
                    System.out.println("""
                    Are you sure you want to start new game?\s
                    Press - n - to confirm\s
                    Press - x - end the game""");
                    decision = scanner.nextLine();
                    if (decision.equals("n")) {
                        System.out.println("We are playing until how many wins?");
                        wonRounds = scanner.nextInt();
                        playerVictory = 0;
                        computerVictory = 0;
                    }
                }
            }
        }
    }
}