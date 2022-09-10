/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex02eijansantoscalderon;

import java.util.Scanner;
public class Ex02EijansantosCalderon {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
      String gamestart = "Start Game";
      String gamesettings = "Settings";
      String gameend = "End Application";
      int guessCount = 3;
      int min = 1;
      int max = 10;
      
      while(true){
          System.out.println("Welcome to Higher or Lower! What will you do?\n -" + gamestart + "\n -" +  gamesettings + "\n -" + gameend);
          Scanner choiceInput = new Scanner(System.in);
          String Choice = choiceInput.nextLine();
          
          if (Choice.equals(gamestart)){
              int random = (int) Math.floor(Math.random()*(max-min)) + min;
              var replayyes = "y";
              var replayno = "n";
              
              for (int i = guessCount;i > 0; i--) {
                  System.out.println("You have " + i + " guess(es)! What is your guess?");
                  Scanner guessInput = new Scanner(System.in);
                  int Guess = guessInput.nextInt();
                  
                  if (Guess == random){
                      System.out.println("You got it!");
                      System.out.println("Play again (y/n)?");
                      break;
                      
                  } else if (Guess > random) {
                      System.out.println("Guess lower! You have " + i + " guess(es) left! What is your guess?");
                  } else if (Guess < random) {
                      System.out.println("Guess higher! You have " + i + " guess(es) left! What is your guess?");
                  }
              }
              
              Scanner replayInput = new Scanner(System.in);
              String Replay = replayInput.nextLine();
              if (Replay.equals(replayyes))
                     continue;
              if (Replay.equals (replayno))
                     System.out.println("\nThank you for playing!");
                     break;
          }
          
          if (Choice.equals(gamesettings)){
              System.out.println("""
                                 What is the lower limit of the random number?
                                 What is the upper limit of the random number?
                                 How many guesses are allowed?
                                 """);
              
              System.out.println("Lower limit: ");
              Scanner lowerLimit = new Scanner(System.in);
              min = lowerLimit.nextInt();
              
              System.out.println("Upper limit: ");
              Scanner upperLimit = new Scanner(System.in);
              max = upperLimit.nextInt();
              
              System.out.println("Guesses: ");
              Scanner guessLimit = new Scanner(System.in);
              guessCount = guessLimit.nextInt();
          }
          
          if (Choice.equals(gameend)){
              System.out.println("\nThank you for playing!");
              break;
          }
          
          else {
              System.out.println("Not a choice! The choices are 'Start Game', 'Settings', and 'End Application'! Keep in mind that said choices are case-sensitive. Please try again.");
          }
      }
    }
    
}
