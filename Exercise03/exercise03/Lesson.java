package main.java.org.dii.oop.exercise03;

public class Lesson {
    public static void run(){
        MusicAlbum x = new MusicAlbum();
        x.displayInfo();

        String BTS[] = {"Blood Sweat & Tears","First Love","Reflection"};
        MusicAlbum y = new MusicAlbum("Wings", BTS);
        y.displayInfo();

        String JeffSatur[] = {"Dum Dum","Fade","Loop"};
        MusicAlbum a = new MusicAlbum("Single+",JeffSatur);
        a.displayInfo();

        String PUN[] = {"Day One","Goodbye","I Just wanna Know"};
        MusicAlbum b = new MusicAlbum("Single",PUN);
        b.displayInfo();

        String TaylorSwift[] = {"Blank Space","Shake It Off","Style"};
        MusicAlbum c = new MusicAlbum("1989", TaylorSwift);
        c.displayInfo();

        String EdSheeran[] = {"Shape of You","Castle on the Hill","Perfect"};
        MusicAlbum d = new MusicAlbum("÷ (Divide)", EdSheeran);
        d.displayInfo();
    }
}
