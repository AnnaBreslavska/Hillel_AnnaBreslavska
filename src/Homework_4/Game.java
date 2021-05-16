package Homework_4;

import java.util.Random;

public class Game {
    //
    public static void main(String[] args) {
        Random random = new Random();
        int boardDivisions = 20;
        int currentBoardDivisions = 0;

        for (int throwDice = 0; throwDice < 5; throwDice++) {

            int dice = random.nextInt(6)+1;
            currentBoardDivisions = currentBoardDivisions + dice;


            System.out.println("Number of the throw: " + (throwDice + 1) );
            System.out.println( "On dice... " + dice);
            System.out.println("Your current Board position is: " + currentBoardDivisions);
            System.out.println( "You have to pass "  + (boardDivisions - currentBoardDivisions) + " places");

            if (currentBoardDivisions == 20) {
                System.out.println("You win");
                break;
            } else if (currentBoardDivisions > 20) {
                System.out.println("You lose");
                break;
            } else if (currentBoardDivisions < 20 && throwDice==5 ) {
                System.out.println("You lose");
            }
            }
        }
    }
