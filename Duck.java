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
public class Duck extends Pet {
    
      public Duck(String name, String breed) {
        super(name, breed);
    }

    @Override
    public String speak() {
        
         return "Quack Quack";
    }
    
}
