package kg.geektech.game.players;

import kg.geektech.game.general.RPG_Game;

public class Magic extends Hero {
    public Magic(int health, int damage) {
        super(health, damage, SuperAbility.BOOST);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        int confsentformagic = RPG_Game.random.nextInt(5)+2;
        for (int i = 0; i < heroes.length; i++)
            heroes[i].setDamage(heroes[i].getDamage() * confsentformagic);
            System.out.println("маг увеличил урон" + confsentformagic);

        }
    }

