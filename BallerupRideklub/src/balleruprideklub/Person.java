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

//    public Person(String firstName, String lastName, int weight, int height, String level, int BMI, boolean balance) {
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.weight = weight;
//        this.height = height;
//        this.level = level;
//        this.BMI = BMI;
//        this.balance = balance;
//    }
    
    private void calcPoints(int weightPoint, int heightPoint, int level, int BMIPoint, boolean balance){
        
    }
    
    public int weightCalc(int weight){
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
    
    public int heightCalc(int height){
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
    
    public int levelcalc(String level){
        System.out.println("level = " + level);
        int levelPoint = -1;
        
        if(level.equals("begynder")){
            levelPoint = 5;
        } else if(level.equals("letøvet")){
            levelPoint = 3;
        } else if("trained".equals(level)){
            levelPoint = 1;
        }
        
        return levelPoint;
    }
    
    public int BMIcalc(int BMI){
        int BMIPoint = 0;
        
        if(BMI > 27){
            BMIPoint = 1;
        }
        return BMIPoint;
    }
    
    public int balanceCalc(String balance){
        if(balance.equals("true")){
            return 0;
        } else if(balance.equals("false")){
            return 1;
        }
        
        return -1;
    }
    
    
            

}
