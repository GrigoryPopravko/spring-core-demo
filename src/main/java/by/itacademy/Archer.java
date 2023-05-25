package by.itacademy;

public class Archer {

    private final String name;
    private final Weapon weapon;
    private final Armour armour;
    private Squad squad;

    public Archer(String name, Weapon weapon, Armour armour) {
        this.name = name;
        this.weapon = weapon;
        this.armour = armour;
    }

    public void setSquad(Squad squad) {
        this.squad = squad;
    }
}
