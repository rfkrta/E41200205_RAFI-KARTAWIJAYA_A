/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasC;

/**
 *
 * @author rafikarta
 */
public class AnimalApp {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.makeNoise();
        Dogs dog = new Dogs();
        dog.makeNoise();
        //Dogs animals = new Dogs();
        //animal.makeNoise();
        
       Animal animaldog = new Dogs();
       animaldog.makeNoise();
       
       if (animal instanceof Animal)
            System.out.println("animal is Animal");
       
       if (dog instanceof Animal)
            System.out.println("dog is Animal");
       
       if (animaldog instanceof Animal)
            System.out.println("animaldog is Animal");
       
       if (animal instanceof Dogs)
            System.out.println("animal is Dog");
    }
}
