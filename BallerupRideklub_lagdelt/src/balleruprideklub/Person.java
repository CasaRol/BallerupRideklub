/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package balleruprideklub;

/**
 *
 */
public class Person {
    
    String firstName;
    String lastName;
    int weight;
    int height;
    String level;
    int BMI;
    boolean balance;
    
    
    
    public int calcScore(int weight, int height, String level, boolean balance){
        int weightPoint = weightCalc(weight);
        System.out.println("weightPoint = " + weightCalc(weight));
        int heightPoint = heightCalc(height);
        System.out.println("heightPoint = " + heightCalc(height));
        int levelPoint = levelcalc(level);
        System.out.println("levelPoint = " + levelcalc(level));
        int BMIPoint = BMIcalc(weight, height);
        System.out.println("BMIPoint = " + BMIcalc(weight, height));
        int balancePoint = balanceCalc(balance);
        System.out.println("balancePoint = " + balanceCalc(balance));
        
        int score = -1;
        if(weightPoint != -1 && heightPoint != -1 && levelPoint != -1 && BMIPoint != -1 && balancePoint != -1) {
            score = (weightPoint + heightPoint + levelPoint + BMIPoint + balancePoint);
        }
        System.out.println("Score = " + score);
        
        return score;
    }
    
    private int weightCalc(int weight){
        int weightPoint = -1;
        if(weight <= 0){
            weightPoint = -1;
        } else if(weight < 55){
            weightPoint = 1;
        } else if(weight < 60){
            weightPoint = 2;
        } else if(weight < 65){
            weightPoint = 3;
        } else if(weight < 70){
            weightPoint = 4;
        } else if(weight < 75){
            weightPoint = 5;
        } else if(weight < 80){
            weightPoint = 6;
        } else if(weight < 85){
            weightPoint = 7;
        } else if(weight < 90){
            weightPoint = 8;
        } else if(weight < 95){
            weightPoint = 9;
        } else if(weight < 100){
            weightPoint = 10;
        } else if(weight < 105){
            weightPoint = 11;
        } else if(weight < 110){
            weightPoint = 12;
        } else if(weight < 115){
            weightPoint = 13;
        } else if(weight < 120){
            weightPoint = 14;
        }
        
        return weightPoint;
    }
    
    private int heightCalc(int height){
        int heightPoint = -1;
        
        if(height < 150){
            heightPoint = 3;
        } else if(height < 160){
            heightPoint = 5;
        } else if(height < 170){
            heightPoint = 6;
        } else if(height < 180){
            heightPoint = 8;
        } else if(height < 190){
            heightPoint = 9;
        } else if(height < 200){
            heightPoint = 10;
        } else if(height <= 0){
            heightPoint = -1;
        }
        
        return heightPoint;
    }
    
    private int levelcalc(String level){
        System.out.println("level = " + level);
        
        int levelPoint = -1;
        
        switch (level) {
            case "Begynder":
                levelPoint = 5;
                break;
            case "Letøvet":
                levelPoint = 3;
                break;
            case "Øvet":
                levelPoint = 1;
                break;
        }
        System.out.println("LevelPoint = " + levelPoint);
        
        return levelPoint;
    }
    
    private int BMIcalc(int weight, int height){
        double heightConvert = (height + 0.0);
        double BMI = (weight/Math.pow((heightConvert/100), 2));
        System.out.println("BMI = " + BMI);
        
        int BMIPoint = 0;
        
        if(BMI > 27){
            BMIPoint = 1;
        }
        
        System.out.println("BMIPoint = " + BMIPoint);
        
        return BMIPoint;
    }
    
    private int balanceCalc(boolean balance){
        if(balance = true) {
            return 0;
        } else if(balance = false) {
            return 1;
        }
        
        return -1;
    }
    
    
            

}
