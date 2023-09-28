package superheroes;

import java.util.Random;

public class Rogue extends Hero implements Spellcaster{
    private final double agility;

    public Rogue(double health, double damage, double agility) {
        super(health, damage);
        this.agility = agility;
    }
    @Override
    public void dealDamage(Hero attackedHero) {
        Random rand = new Random();
        double randomMultiplier = rand.nextDouble(2);
        double dealtDamage = (damage + (agility / 4)) * randomMultiplier;
        attackedHero.getAttacked(dealtDamage);
        attackHeroWithWeapon(attackedHero);
    }

    @Override
    public String toString() {
        return "Rogue{" +
                "agility=" + agility +
                '}';
    }

    @Override
    public void assassinate(Hero attackedHero) throws UnabilityException
    {
        throw new UnabilityException();
    }

    @Override
    public void castFireball(Hero attackedHero) {
        Random rand = new Random();
        double randNumber = rand.nextDouble(1);
        double dealtDamage = (agility + damage) * randNumber;
        attackedHero.getAttacked(dealtDamage);
    }
}
