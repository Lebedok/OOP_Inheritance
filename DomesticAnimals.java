package Inheritance;

public class DomesticAnimals extends  Animal{

    public void speak(){
        System.out.println("DomesticAnimal is speaking");
    }


    // Method Overriding -->  using method overriding we can update&change the implementation
    // for the methods from parent class

    @Override
    public void run(){    // run() method coming from child class
        System.out.println("Domestic Animal is running.");
    }





    public static void main(String[] args) {

        DomesticAnimals dAnimal= new DomesticAnimals();
        dAnimal.run();
        dAnimal.speak();


        Animal animal = new Animal();
        animal.run();
        // animal.speak(); -->  speak() method is not available for Parent class



    }

}
