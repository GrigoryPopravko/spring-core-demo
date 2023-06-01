package by.itacademy;

public class Sword implements Weapon {

    private Integer damage;
    private final Integer price;
    private final String material;

    public static Sword goldenSword(Integer damage, Integer price) {
        return new Sword(damage, price, "golden");
    }

    public static Sword bronzeSword(Integer damage, Integer price) {
        return new Sword(damage, price, "bronze");
    }

    private Sword(Integer damage, Integer price, String material) {
        this.damage = damage;
        this.price = price;
        this.material = material;
    }

    @Override
    public Integer getDamage() {
        return damage;
    }

    @Override
    public Integer getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Sword{" +
                "damage=" + damage +
                ", price=" + price +
                ", material='" + material +
                '}';
    }
}
