package superheroes;

import java.util.ArrayList;
import java.util.Random;

public class Battlefield {

    private ArrayList<Hero> heroes = new ArrayList<>();

    public Battlefield(ArrayList<Hero> heroes) {
        this.heroes = heroes;
    }

    public void startBattle() {
        int aliveHeroes = heroes.size();
        Random rand = new Random();
        while (aliveHeroes != 1) {
            int attackingHeroIndex = rand.nextInt(aliveHeroes);
            int attackedHeroIndex = rand.nextInt(aliveHeroes);
            if (attackingHeroIndex != attackedHeroIndex) {
                Hero attacker = heroes.get(attackedHeroIndex);
                Hero attacked = heroes.get(attackedHeroIndex);
                attacker.dealDamage(attacked);

                if (attacked.isDead()) {
                    heroes.remove(attacked);
                    aliveHeroes--;
                }
            }


        }
        System.out.println("The winner is: ");
        System.out.println(heroes);

    }

}


