package by.itacademy;

import java.util.List;

public class Warrior {

    private final String name;
    private final List<Weapon> weapons;
    private final Armour armour;

    public Warrior(String name, List<Weapon> weapons, Armour armour) {
        this.name = name;
        this.weapons = weapons;
        this.armour = armour;
    }
}
