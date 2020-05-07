/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spann_bester;

import javax.sound.sampled.LineUnavailableException;

/**
 *
 * @author Shanell A. Spann
 * ITDEV110 - ITOOP
 * Assignment #9
 * Due: 11/14/19
 */
public class Spann_Bester {

    /**
     * @param args the command line arguments
     * @throws java.lang.InterruptedException
     * @throws javax.sound.sampled.LineUnavailableException
     */
    public static void main(String[] args) throws InterruptedException, LineUnavailableException {
       
        Admin a = new Admin();
        Play p = new Play();
        SoundUtils su = new SoundUtils();
        
        su.tone(261,300);
        su.tone(659,170);
        su.tone(400,500);
        Thread.sleep(1000);
        
        a.Intro();
        p.continueIndicator();
        a.Goodbye();
        
        su.tone(400,500);
        su.tone(261,300);
   
    }
    
}
