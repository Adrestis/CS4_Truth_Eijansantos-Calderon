/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex02trutheijansantoscalderon;

/**
 *
 * @author TRUTH
 */
import java.util.Scanner;

public class Ex02TruthEijansantosCalderon {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
      String gamestart = "Start Game";
      String gamesettings = "Settings";
      String gameend = "End Application";
      int range = 10;
      int min = 1;
      int random = (int) Math.floor(Math.random()*range) + min;
      int x = 1;
      
      
      while(x < 5){
          System.out.println("Welcome to Higher or Lower! What will you do?\n -" + gamestart + "\n -" +  gamesettings + "\n -" + gameend);
          Scanner choiceInput = new Scanner(System.in);
          String Choice = choiceInput.nextLine();
          
          if (Choice.equals(gamestart)){
              System.out.println(random);
          }
          
          if (Choice.equals(gamesettings)){
              System.out.println("What is the lower limit of the random number?\n" + "What is the upper limit of the random number?\n" + "How many guesses are allowed?\n");
              
              System.out.println("Lower limit: ");
              Scanner lowerLimit = new Scanner(System.in);
              int lower = lowerLimit.nextInt();
              
              System.out.println("Upper limit: ");
              Scanner upperLimit = new Scanner(System.in);
              int upper = upperLimit.nextInt();
              
              System.out.println("Guesses: ");
              Scanner guessLimit = new Scanner(System.in);
              int guess = guessLimit.nextInt();
          }
          
          if (Choice.equals(gameend)){
              System.out.println("\nThank you for playing!");
              break;
          }
      }
    }
}
    

