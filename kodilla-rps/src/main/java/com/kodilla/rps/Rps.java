package com.kodilla.rps;

import java.util.Random;
import java.util.Scanner;

public class Rps {

    private int playerChoice;
    private String playerWeapon;
    private  int computerChoice;
    private String computerWeapon;
    private int badChoice;

    public void chooseWeapon() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose your weapon!");
        playerChoice = scanner.nextInt();
        if (playerChoice == 1) {
            playerWeapon = "ROCK";
        } else if(playerChoice == 2) {
            playerWeapon = "SCISSORS";
        } else if(playerChoice == 3) {
            playerWeapon = "PAPER";
        } else {
            System.out.println("Wrong number!");
        }
    }
    public String getPlayerWeapon() {
        return playerWeapon;
    }
    public int getMakeItHarder() {
        if (playerChoice == 1) {
            badChoice = 2;
        } else if (playerChoice == 2) {
            badChoice = 3;
        } else {
            badChoice = 1;
        }
        return badChoice;
    }
    public void computerWeapon() {
        Random random = new Random();
        computerChoice = random.nextInt(1,4);
        int x = getMakeItHarder();

        if (computerChoice == x) {
            computerChoice = random.nextInt(1,4);
        }
        if (computerChoice == 1) {
            computerWeapon = "ROCK";
        } else if(computerChoice == 2) {
            computerWeapon = "SCISSORS";
        } else if (computerChoice == 3){
            computerWeapon = "PAPER";
        }
    }
    public String getComputerWeapon() {
        return computerWeapon;
    }
    public String fight() {
        String result = "";
        if (playerChoice == computerChoice) {
            result = "Draw";
        } else if (playerChoice == 1 && computerChoice == 3 || playerChoice == 2 && computerChoice == 1 || playerChoice == 3 && computerChoice == 2) {
            result = "Defeat";
        } else if (playerChoice == 1 && computerChoice == 2 || playerChoice == 2 && computerChoice == 3 || playerChoice == 3 && computerChoice == 1) {
            result = "Wictory";
        }
        return result;
    }
}