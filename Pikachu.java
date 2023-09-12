package pikachu;

import java.util.Scanner;

public class Pikachu {
    
    int squirtleHealth = 100;
    int pikachuHealth = 100;  
    int squirtleStamina = 50;
    int pikachuStamina = 50;
   
public void thunderbolt() {
    if (squirtleHealth <= 0) {
                    System.out.print("You have already won the battle");
    }
    else {
                    System.out.print("Pikachu, use Thunderbolt!");
            squirtleHealth = squirtleHealth - 30;
            pikachuStamina = pikachuStamina - 10;
                    System.out.println("Ouch, opponent Squirtle took 30 damage from Pikachu's Thunderbolt.");
                    System.out.println("Pikachu lost 10 stamina points.");
                    System.out.println("Opponent Squirtle now has " + squirtleHealth + " health.");
                    System.out.println("Pikachu has " + pikachuStamina + " stamina points");
}}
    
    public void lightningStrike() {
    if (squirtleHealth <= 0) {
    System.out.println("You have already won the battle");
    }
    else {
    System.out.println("Pikachu, use Lightning Strike!");
    squirtleHealth = squirtleHealth - 50;
    pikachuStamina = pikachuStamina - 20;
    System.out.println("Ouch, opponent Squirtle took 50 damage from Pikachu's Lightning Strike.");
    System.out.println("Pikachu lost 20 stamina points.");
    System.out.println("Opponent Squirtle now has " + squirtleHealth + " health.");
    System.out.println("Pikachu has " + pikachuStamina + " stamina points");
    }
    }
    public void energyChannel() {
    if (squirtleHealth <= 0) {
    System.out.println("You have already won the battle");
    }
    else {
    System.out.println("Pikachu, use Energy Channel!");
    pikachuStamina = pikachuStamina + 10;
    System.out.println("Pikachu gained 10 stamina points.");
    System.out.println("Opponent Squirtle still has " + squirtleHealth + " health.");
    System.out.println("Pikachu has " + pikachuStamina + " stamina points");
    
    }
    }
    public static void main(String[] args){
    Pikachu pikachuUse = new Pikachu();
    pikachuUse.lightningStrike();
    }
}