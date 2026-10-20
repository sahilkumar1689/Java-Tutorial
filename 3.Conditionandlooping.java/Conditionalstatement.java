
import java.lang.Thread;
import java.util.*;

public class Conditionalstatement {
    public static void main(String[] args) throws InterruptedException {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        // 1. Make a full fledge rock,paper and scissor game:

        System.out.println("\t\tWelcome in the Rock,Paper and Scissor game. \t \n");
        
        System.out.println("Please enter the game mode(Easy/Medium/Hard):");
        String str = sc.nextLine();
        
        System.out.println("Please enter the number of game you want too play:");
        byte nGames = sc.nextByte();
        byte n=nGames;

        System.out.println("\n\t\tPlease wait game will setup for "+str+" mode...\n");
        Thread.sleep(3000);

        if (nGames > 0 && nGames <= 100) {

            byte playerScore = 0, computerScore = 0, player1; 
            int player2;

            for (int i = 0; i < n; i++) {
                System.out.println("\n------------------------------------------------------------");
                System.out.println("Mode="+str+"\t GameNo.="+(nGames--));
                System.out.println("\nPlease enter 1 for Rock,2 for paper,3 for scissor:");
                player1 = sc.nextByte();

                if (player1 == 1 || player1 == 2 || player1 == 3) {
                    player2 = rand.nextInt(3);

                    switch (player1) {
                        case 1:
                            if (player2 == 0) {
                                Thread.sleep(1000);
                                System.out.println("It's a draw.\nComputer guess is:Rock.");
                                break;
                            } else if (player2 == 1) {   
                                Thread.sleep(1000);
                                System.out.println("You lost:\ncomputer guess is:Paper.");
                                computerScore++;
                                Thread.sleep(1000);
                                System.out.println("Your Sore:" + playerScore + "\nComputer Score:" + computerScore);
                                break;
                            } else {
                                Thread.sleep(1000);
                                System.out.println("You Won:\ncomputer guess is:Scissor.");
                                playerScore++;
                                Thread.sleep(1000);
                                System.out.println("Your Sore:" + playerScore + "\nComputer Score:" + computerScore);
                                break;
                            }
                        case 2:
                            if (player2 == 0) {
                                Thread.sleep(1000);
                                System.out.println("You Won: \nComputer guess is:Rock.");
                                playerScore++;
                                Thread.sleep(1000);
                                System.out.println("Your Sore:" + playerScore + "\nComputer Score:" + computerScore);
                                break;
                            } else if (player2 == 1) {
                                Thread.sleep(1000);
                                System.out.println("It's a draw. \nComputer guess is:Rock.");
                                break;

                            } else {
                                Thread.sleep(1000);
                                System.out.println("You lost:\ncomputer guess is:Scissor.");
                                computerScore++;
                                Thread.sleep(1000);
                                System.out.println("Your Sore:" + playerScore + "\nComputer Score:" + computerScore);
                                break;
                            }
                        case 3:
                            if (player2 == 0) {
                                Thread.sleep(1000);
                                System.out.println("You lost:\ncomputer guess is:Rock.");
                                computerScore++;
                                Thread.sleep(1000);
                                System.out.println("Your Sore:" + playerScore + "\nComputer Score:" + computerScore);
                                break;
                            } else if (player2 == 1) {
                                Thread.sleep(1000);
                                System.out.println("You Won: \nComputer guess is:paper.");
                                playerScore++;
                                Thread.sleep(1000);
                                System.out.println("Your Sore:" + playerScore + "\nComputer Score:" + computerScore);
                                break;
                            } else {
                                Thread.sleep(1000);
                                System.out.println("It's a draw. \nComputer guess is:Scissor.");
                                break;
                            }
                    }
                } else {
                    System.out.println("Please enter the valid number.");
                    i--;
                    nGames++;
                    continue;
                }

                if(nGames!=0)
                    System.out.println("\nGeat Ready for next game...");
                Thread.sleep(5000);

            }
            System.out.println("Wait your game complete.");
            System.out.println("\n\tYour result will be processing...");
            Thread.sleep(5000);

            if(computerScore>playerScore) System.out.println("\nYour Lost better luck next time.\nYour score is:"+playerScore+"\n Computer Score is:"+computerScore);
            else if(playerScore>computerScore) System.out.println("\nKudos Your Win\nYour score is:"+playerScore+"\nComputer Score is:"+computerScore);
            else System.out.println("\nGreat Match it's a tie.");

        } else
            System.out.println("Please enter the valid number of games.");

        sc.close();
    }
}
