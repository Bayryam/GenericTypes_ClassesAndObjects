package superheroes.weapons;

public abstract class Weapon
{
    protected final double damage;

    public Weapon(double damage){
        this.damage = damage;
    }

    public abstract double dealtDamageByWeapon();
}
