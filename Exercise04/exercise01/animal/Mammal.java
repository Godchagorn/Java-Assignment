package main.java.org.dii.oop.exercise01.animal;

public class Mammal {

    String name;
    public Mammal(String name) {
        this.name = name;
    }
        public void eat(){
        System.out.println("Mammal eats");
    }

    public void travel() {
        System.out.println("Mammal travels");
    }

    public String getName() {
        return name;
    }
}


