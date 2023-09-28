package superheroes.weapons;

public class Sword extends Weapon
{
    public Sword(double damage)
    {
        super(damage);
    }

    @Override
    public double dealtDamageByWeapon() {
        return damage;
    }
}
