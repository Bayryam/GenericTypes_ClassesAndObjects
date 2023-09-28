package superheroes;

import java.util.Random;


public class Mage extends Hero implements Spellcaster,Knight
{

    private final double intelligence;

    public Mage(double health, double damage, double intelligence) {
        super(health, damage);
        this.intelligence = intelligence;
    }
    @Override
    public void dealDamage(Hero attackedHero) {
        Random rand = new Random();
        double randomMultiplier = rand.nextDouble(1.5);
        double dealtDamage = (damage + (intelligence / 3)) * randomMultiplier;
        attackedHero.getAttacked(dealtDamage);
        attackHeroWithWeapon(attackedHero);
    }

    @Override
    public String toString() {
        return "Mage{" +
                "intelligence=" + intelligence +
                '}';
    }

    @Override
    public void charge(Hero attackedHero)
    {
        Random rand = new Random();
        double randNumber = rand.nextDouble(1);
        double dealtDamage = 2 * damage * randNumber;
        attackedHero.getAttacked(dealtDamage);
    }

    @Override
    public void castFireball(Hero attackedHero)
    {
        double dealtDamage = damage * intelligence;
        attackedHero.getAttacked(dealtDamage);
    }
}
