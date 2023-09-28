package superheroes;

import java.util.Random;

public class Warrior extends Hero implements Knight {
    private final double strength;

    public Warrior(double health, double damage, double strength) {
        super(health, damage);
        this.strength = strength;
    }


    @Override
    public void dealDamage(Hero attackedHero) {
        Random rand = new Random();
        double isAttacking = rand.nextDouble(1);
        double dealtDamage = (damage + (strength / 2)) * isAttacking;
        attackedHero.getAttacked(dealtDamage);
        attackHeroWithWeapon(attackedHero);
    }

    @Override
    public void assassinate(Hero attackedHero) throws UnabilityException
    {
        throw new UnabilityException();
    }


    @Override
    public String toString() {
        return "Warrior{" +
                "strength=" + strength +
                '}';
    }

    @Override
    public void charge(Hero attackedHero) {
        double dealtDamage = 2 * damage + strength;
        attackedHero.getAttacked(dealtDamage);
    }
}
