package Inheritance;

public class WildAnimals extends Animal{

    //@Override
    //Speak is not Overriding from the parent class. It is new method for Wild Animals
    public void speak(){
        System.out.println("Wild animal is speaking");
    }


    public void run(){
        System.out.println("Wild animal is running");
    }




    public static void main(String[] args) {

        WildAnimals wAnimal = new WildAnimals();
        wAnimal.eat();
        wAnimal.speak();
       // wAnimal.speak();  --> we can't use the features and inherit the feature from siblings
        // speak() method is available only for Domestic Animals

        Animal animal = new Animal();
        animal.eat();

    }
}
