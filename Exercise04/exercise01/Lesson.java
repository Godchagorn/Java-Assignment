package main.java.org.dii.oop.exercise01;

// TO DO: import Mammal

import main.java.org.dii.oop.exercise01.animal.Mammal;

public class Lesson {

    public static void run() {
        // TO DO: uncomment to test the program
          Mammal m = new Mammal("John");
          System.out.println(m.getName());
          m.eat();
          m.travel();
    }
}
