package superheroes.weapons;

public class Staff extends Weapon
{
    private final  double spellPower;

    public Staff(double damage, double spellPower){
        super(damage);
        this.spellPower = spellPower;
    }

    @Override
    public double dealtDamageByWeapon() {
        return damage + spellPower;
    }
}
