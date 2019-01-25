/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package balleruprideklub;

import Business.Person;
import java.util.Scanner;
import javafx.application.ConditionalFeature;
/**
 *
 */
public class BallerupRideklub {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int weight = -1;
        int height = -1;
        int level = -1;
        int BMI = -1;
        int balance = -1;
        
        int totalScore = -1;
        
        while(true){
            Scanner input = new Scanner(System.in);
            Person person = new Person();
            
            System.out.println("Please enter your weight:");
            weight = person.weightCalc(input.nextInt());
            System.out.println("weight = " + weight);
            System.out.println("Please enter your height:");
            height = person.heightCalc(input.nextInt());
            System.out.println("height = " + height);
            System.out.println("Please enter your level ranking form: \"begynder\", \"letøvet\" and \"øvet\"");
            level = person.levelcalc(input.next());
            System.out.println("level = " + level);
            System.out.println("Please enter your BMI:");
            BMI = person.BMIcalc(input.nextInt());
            System.out.println("BMI = " + BMI);
            System.out.println("Please state yes or no if you can stand on one foot for at lease 30 consecutive seconds:");
            balance = person.balanceCalc(input.next());
            
            totalScore = weight + height + level + BMI + balance;
            
            System.out.println("Your total score is " + totalScore + "!");
             System.exit(0);
        }
    }

}
