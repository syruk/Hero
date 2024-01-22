import java.sql.SQLOutput;

public class MainHero {
    public static void main(String[] args) {
        Hero Akira = new Hero("Akira", 50,50);
        System.out.println(Akira);
        Hero Orc = new Hero("Grushk", 10,10);
        System.out.println(Orc);
        Akira.attack(Orc);
        Akira.drinkPotion();
        Akira.drinkPotion();
        Akira.rest();
        Akira.levelUp();
        System.out.println(Akira);
    }
}
