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

public class Admin 
{
    SoundUtils su = new SoundUtils();
    
    public void Intro() throws InterruptedException
    {        
        System.out.println("Welcome to the ROLL THE DICE Game!");
        Thread.sleep(2000);
        
        System.out.println("\n");
        
        System.out.println("DIRECTIONS: Roll the Dice 5 times. \nTake turns with the computer. \nWinners receive the highest score.");
        Thread.sleep(5000);
        
        System.out.println("\n");
        
    } 
    
    public void Goodbye()
    {
        System.out.println("Thanks for playing! Goodbye.");
    }
}
