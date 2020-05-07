/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spann_bester;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author Shanell A. Spann
 * ITDEV110 - ITOOP
 */
public class computerRoll 
{
    int [][] dieRollArray = new int[][] 
    {
        {0,0,0,0,0},   
        {0,0,0,0,0},  
        {0,0,0,0,0},  
        {0,0,0,0,0},  
        {0,0,0,0,0}   
    };
    
    int a = 0;
    int computerTotal;
    
    public void computerRoll()
    {
        while(a < 5)
        {
            loadRandomRolls();
            a++; 
        }
        printDieRollArray();            
    }
    
    
    public int randomRoll()
    {
        int dieScore;
        Random p = new Random();
        
        dieScore = p.nextInt(6 - 1)+ 1; 
        return dieScore;    
    }
    
    public void loadRandomRolls()
    {
        for(int i = 0; i < 5; i++) 
        {
             dieRollArray[a][i] = randomRoll(); 
             computerTotal += dieRollArray[a][i];
        }
    }
    
    public void printDieRollArray()
    {     
        for(int i = 0; i < dieRollArray.length; i++)
        {
            System.out.println();
            System.out.println("ROUND " + (i + 1) + " scores: ");
            for(int j = 0; j < dieRollArray[i].length; j++) 
            {
                System.out.print(dieRollArray[i][j] + ","); 
            }       
        }
        System.out.println("\n");
        System.out.println("COMPUTER TOTAL = " + computerTotal);   
   }
}

