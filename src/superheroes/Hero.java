package superheroes;

import superheroes.weapons.Weapon;

import java.util.Random;

public abstract class Hero {
    protected double health;
    protected final double damage;

    protected Weapon weapon;

    protected Hero(double health, double damage) {
        this.health = health;
        this.damage = damage;
    }

    public boolean isDead() {
        return (health <= 0);
    }

    public double getHP(){
        return health;
    }

    public void getAttacked(double dealtDamage) {
        health = health - dealtDamage;
    }

    public abstract void dealDamage(Hero attackedHero);

    public void swapWeapon(Weapon newWeapon){
        weapon = newWeapon;
    }
    public void attackHeroWithWeapon(Hero attackedHero){
        attackedHero.getAttacked(weapon.dealtDamageByWeapon());
    }

    public void assassinate(Hero attackedHero) throws UnabilityException{
         final int MAX_DICE_VALUE = 11;
         final int PERCENT_DAMAGE_DICE_VALUE = 10;
         final double PERCENT_DAMAGE_VALUE = 90;
         final int INSTANT_KILL_VALUE = 11;


            Random rand = new Random();
            int diceResult  = rand.nextInt(MAX_DICE_VALUE+1);
            double dealtDamage = 0;
            if (diceResult == PERCENT_DAMAGE_DICE_VALUE)
            {
                dealtDamage = attackedHero.getHP() * (PERCENT_DAMAGE_VALUE/100);
            }
            else if (diceResult == INSTANT_KILL_VALUE)
            {
                dealtDamage = attackedHero.getHP();
            }

            attackedHero.getAttacked(dealtDamage);
    }


}
