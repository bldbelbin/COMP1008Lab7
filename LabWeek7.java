/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labweek7;

/**
 *
 * @author Jarvis
 */
public class LabWeek7 {

    public static void main(String[] args) {
        
        Dog dog  = new Dog ("Spot", "Dog");
       
        Cat cat  = new Cat ("Gus", "Cat");
        
        Duck duck  = new Duck ("Sir Quacks-a-lot", "Duck");
        
        System.out.printf("%s Say: %s%n", dog, dog.speak());
        System.out.printf("%s Say: %s%n", cat, cat.speak());
        System.out.printf("%s Say: %s%n", duck, duck.speak());
    
        
    }
    
}
