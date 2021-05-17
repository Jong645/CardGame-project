package space.jong.cardgame;

public class Card {
    public String name;
    public String elementes;
    public int health;
    public int damage;
    public int cost;

    public Card(String name, int health, int damage, int cost, String elementes ) {
        this.name = name;
        this.elementes = elementes;
        this.health = health;
        this.cost = cost;
        this.damage = damage;
    }

}
