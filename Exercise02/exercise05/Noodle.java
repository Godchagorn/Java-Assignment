package main.java.org.dii.oop.exercise05;

public class Noodle {
    public String noodleTexture;
    public String onion;
    public String garlic;
    public String spicy;
    public String porkType;
    public String flavorStrength;
    public String rich;

    public void displayOrder() {
        System.out.println("Noodle Order:");
        System.out.println("Texture: " + noodleTexture);
        System.out.println("Onion: " + onion);
        System.out.println("Garlic: " + garlic);
        System.out.println("Spiciness: " + spicy);
        System.out.println("Pork: " + porkType);
        System.out.println("Flavor Strength: " + flavorStrength);
        System.out.println("Richness: " + rich);
        System.out.println();
    }
}