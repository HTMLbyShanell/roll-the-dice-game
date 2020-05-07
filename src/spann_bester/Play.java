/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spann_bester;

/**
 *
 * @author Shanell A. Spann
 */
import java.util.Scanner;
import javax.sound.sampled.LineUnavailableException;

public class Play 
{
    playerRoll pr = new playerRoll();
    computerRoll cr = new computerRoll();
    SoundUtils su = new SoundUtils();
    Scanner keyboard = new Scanner(System.in);
    char continueIndicator;
    char playAgain = 'N';
    
    public void continueIndicator() throws InterruptedException, LineUnavailableException
    {
        System.out.println("Would you like to continue? Y or N?");
        continueIndicator = keyboard.next().toUpperCase().charAt(0);
        if(continueIndicator == 'Y')
        {
            Play();
        }
    }
    
    public void Play() throws InterruptedException, LineUnavailableException
    {
        
            System.out.println("\n*** Computer is Rolling ***");
            Thread.sleep(1000);
            System.out.println("*** Computer is Rolling ***");
            Thread.sleep(1000);
            System.out.println("*** Computer is Rolling ***");
            Thread.sleep(1000);
            System.out.println("*** Computer is Rolling ***");
            Thread.sleep(1000);
            System.out.println("*** Computer is Rolling *** \n");
            Thread.sleep(4000);
            
            su.tone(261,300);
            su.tone(659,170);

            System.out.println("YOUR TURN!");
            pr.playerRoll();
            Thread.sleep(4000);

            cr.computerRoll();
            System.out.println("\n");
            Winner();
        if (playAgain == 'Y')
        {
            System.out.println("\n\n");
            System.out.println("Please wait.");
            System.out.println("Your computer is rolling.");
            Thread.sleep(4000);
            System.out.println(". . . still rolling.");
            Thread.sleep(3000);
            

            System.out.println("YOUR TURN!");
            pr.playerRoll();
            Thread.sleep(4000);

            cr.computerRoll();
            System.out.println("\n");
            Winner();
        }
        
    }
    
    public void Winner() throws InterruptedException, LineUnavailableException 
    {
        if(cr.computerTotal > pr.playerTotal)
        {
            System.out.println("COMPUTER WINS !!!!!!");
            System.out.println("SORRY, YOU LOST BIG TIME\n");
            su.tone(261,300);
            su.tone(400,500);
            Thread.sleep(1000);
        }
        else if(cr.computerTotal < pr.playerTotal)
        {
            System.out.println("YOU'RE A WINNER !!!!!!");
            System.out.println("YOU'VE GOT A LUCKY ROLL\n");
            su.tone(659,170);
            su.tone(400,500);
        }
        else
        {
            System.out.println("IT'S A TIE !!!");
            su.tone(659,170);
            su.tone(659,170);
        }    
        
        Thread.sleep(1500);
        System.out.println("Would you like to play again? Y or N \n");
        playAgain = keyboard.next().toUpperCase().charAt(0);
    }
    
}
    
