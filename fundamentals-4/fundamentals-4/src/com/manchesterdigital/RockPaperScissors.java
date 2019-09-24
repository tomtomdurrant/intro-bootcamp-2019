package com.manchesterdigital;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        String userChoice = userInput.nextLine();

        Random random = new Random();
        double computerChoiceAsDouble = random.nextDouble();

        String tempResult = checkWhoWins(userChoice, computerChoiceConverter(computerChoiceAsDouble));
        System.out.printf("The result is %s", tempResult);
    }

    private static String checkWhoWins(String userChoice, String computerChoice){
        String resultOfGame;
        if (userChoice.equalsIgnoreCase(computerChoice)){
            resultOfGame = "Draw";
        }
        else if (((userChoice.equalsIgnoreCase("Rock")) && computerChoice.equalsIgnoreCase("Scissors")) || ((userChoice.equalsIgnoreCase("Paper")) && computerChoice.equalsIgnoreCase("Rock"))
         || ((userChoice.equalsIgnoreCase("Scissors")) && computerChoice.equalsIgnoreCase("Paper"))){
            resultOfGame = "User Wins";
        }
        else {
            resultOfGame = "Computer Wins";
            }
        return resultOfGame;

    }
    private static String computerChoiceConverter(double computerChoiceAsDouble){
        if (computerChoiceAsDouble <= 0.33) {
            System.out.println("Computer chose rock");
            return "Rock";
        } else if (computerChoiceAsDouble <= 0.66) {
            System.out.println("Computer chose paper");
            return "Paper";
        } else {
            System.out.println("Computer chose scissors");
            return "Scissors";
        }
    }
}
