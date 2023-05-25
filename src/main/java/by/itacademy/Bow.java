package by.itacademy;

public class Bow implements Weapon {

    private final Arrow arrow;

    public Bow(Arrow arrow) {
        this.arrow = arrow;
    }

    @Override
    public Integer getDamage() {
        return arrow.getDamage();
    }
}
