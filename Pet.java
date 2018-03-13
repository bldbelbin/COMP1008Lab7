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

public abstract class Pet {
    
    // instance variable name and breed for class Pet
    public String name;
    public String breed;
    
    // Constructor
    public Pet (String name, String breed) {
        
        setName(name);
        setBreed(breed);
    }

    // get name from setName
    public String getName() {
        return name;
    }

    // set the name
    public void setName(String name) {
        this.name = name;
    }

    // get breed from setBreed
    public String getBreed() {
        return breed;
    }
    
    // set the breed
    public void setBreed(String breed) {
        this.breed = breed;
        
    }  
    
    public abstract String speak();
            

    @Override
    public String toString() {
        
        return String.format("Name: %s Breed: %s", name, breed);
    }
}
