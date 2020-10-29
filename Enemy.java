package Game;

import java.util.Random;

public class Enemy extends SkillsOfEnemy{
    public int selectSkills(Player aPlayer) {
        Random r = new Random();
        int opt = r.nextInt();
        while (opt <= 0) opt += 3;
        opt %= 3;
        if (opt == 0) {
            System.out.println(getName() + "对" + aPlayer.getName() + "造成了" + super.atkPlayer(aPlayer) + "点伤害");
        }
        else if (opt == 1) {
            super.atkInc();
            System.out.println(getName() + "提升了攻击力");
        }
        else if (opt == 2) {
            super.defInc();
            System.out.println(getName() + "提升了防御力");
        }
        return opt;
    }
}
