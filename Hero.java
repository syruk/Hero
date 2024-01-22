import java.util.Random;

public class Hero {
    //VARIABLES
    private String name;
    private int level;
    private int health;
    private int maxHealth;
    private int experience;
    private int attack;
    private int defense;
    public static final int minimumLevel = 1;
    public static final int minimumExperience = 0;
    public static final int potion = 10;
    public static final int restHealth = 50;
    public static final int starterHealth = 100;

    //GETTERS
    public int getLevel() {
        return level;
    }
    public int getHealth() {
        return health;
    }
    public int getMaxHealth() {
        return maxHealth;
    }
    public int getExperience() {
        return experience;
    }
    public int getAttack() {
        return attack;
    }
    public int getDefense() {
        return defense;
    }
    //SETTERS
    public void setLevel(int level) {
        this.level = level;
    }
    public void setHealth(int health) {
        this.health = health;
    }
    public void setMaxHealth(int maxHealth) {
        this.maxHealth = maxHealth;
    }
    public void setExperience(int experience) {
        this.experience = experience;
    }
    public void setAttack(int attack) {
        this.attack = attack;
    }
    public void setDefense(int defense) {
        this.defense = defense;
    }
    //CONSTRUCTORES
    public Hero(String name, int attack, int defense){
        this.name = name;
        this.level = minimumLevel;
        this.health = starterHealth;
        this.maxHealth = starterHealth;
        this.experience = minimumExperience;
        this.attack = attack;
        this.defense = defense;
    }

    //METODOS
    public void drinkPotion() {
        health += potion;
        if (health > maxHealth) {
            health = maxHealth;
        }
    }
    public void rest() {
        health += restHealth;
        if (health > maxHealth) {
            health = maxHealth;
        }
    }
    public String toString() {
        return "Nombre: " + name + "\nNivel: " + level + "\nVida actual: " + health + "/" + maxHealth +
                "\nExperiencia: " + experience + "\nAtaque: " + attack + "\nDefensa: " + defense;
    }
    public void attack(Hero enemy) {
        Random random = new Random();
        int damage = Math.max(attack - enemy.defense, 10);
        enemy.health -= damage;
        experience += 10;

        if (experience >= 50) {
            levelUp();
        }
    }
    public void levelUp() {
        level++;
        health += 5;
        attack++;
        defense++;
        experience = 0;
    }
}
