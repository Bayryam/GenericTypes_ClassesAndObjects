package superheroes.weapons;

import java.util.Random;

public class Dagger extends Weapon{

    static private final int MAX_DICE_VALUE = 11;
    static private final int MID_DICE_VALUE = 6;

    public Dagger(double damage){
        super(damage);
    }
    @Override
    public double dealtDamageByWeapon() {

        Random rand = new Random();
        int diceResult = rand.nextInt(MAX_DICE_VALUE+1);
        double dealtDamage = damage;
        if (diceResult >MID_DICE_VALUE)
        {
            dealtDamage = (dealtDamage * 2);
        }

        return dealtDamage;
    }
}
