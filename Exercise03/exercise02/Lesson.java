package main.java.org.dii.oop.exercise02;

public class Lesson {
    public static void run(){ //ตอนแรกไม่มี static เลย run lesson เลยไมไ่ด้
        // do something
        Student x = new Student("Emma","Carter",25);
        Student z = new Student("Liam","Johnson",32);
        Student a = new Student("Sophia","Martinez",28);
        Student b = new Student("Noah","Smith",21);
        Student c = new Student("Olivia","Brown",30);
        Student y = new Student();

        x.displayInfo();
        System.out.println();
        y.displayInfo();
        System.out.println();
        z.displayInfo();
        System.out.println();
        a.displayInfo();
        System.out.println();
        b.displayInfo();
        System.out.println();
        c.displayInfo();
    }
}
