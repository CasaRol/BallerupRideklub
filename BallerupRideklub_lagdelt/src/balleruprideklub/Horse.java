/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package balleruprideklub;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Alexa
 */
public class Horse {
    
    public List<Horse> horses = new ArrayList<>();
    
    private String name;
    private int niveau;

    public Horse(String name, int niveau) {
        this.name = name;
        this.niveau = niveau;
    }
    
    public Horse(){
        
    }

    public String getName() {
        return name;
    }

    public int getNiveau() {
        return niveau;
    }
    
    public void fillArray() {
        try(Scanner scan = new Scanner(new File("HorseLevel.txt"))) {
            while(scan.hasNextLine()) {
                String line = scan.nextLine();
                String[] tokens = line.split("/");
                
                String name = tokens[0];
                int level = Integer.parseInt(tokens[1]);
                
                horses.add(new Horse(name, level));
                System.out.println(horses.size());
            }
        } catch(Exception e) {
            System.out.println("Fejl ved indlæsning af .txt");
            System.out.println(e);
        }
    }

    @Override
    public String toString() {
        return name + ",\t" + niveau;
    }
    
    
    
}
