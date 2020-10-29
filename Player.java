package Game;

import com.sun.beans.editors.ShortEditor;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Player extends SkillsOfPlayer{
    public Player() {
    }

    /**
     * @param size the size of the enemies
     * @param opt  the option of player
     * opt = 0 attack a random enemy
     * opt = 1 attack all enemies
     * opt = 2 attack the selected enemy
     * opt = 3 increase ATK
     * opt = 4 increase DEF
     * @return the option player choiced
     */
    public int selectSkill(ArrayList<Enemy> e) {
        Scanner in = new Scanner(System.in);
        Random r = new Random();
        int opt = in.nextInt() - 1;
        Enemy eTmp;
        ShowSettings.showLine();
        if (opt == 0) {
            do {
                int randomNum = r.nextInt();
                while (randomNum <= 0) randomNum += e.size();
                randomNum %= e.size();
                eTmp = e.get(randomNum);
            }while (eTmp.getHP() <= 0);
            System.out.println(getName() + "对" + eTmp.getName() + "造成了" + atkSelected(eTmp) + "点伤害");
        }
        else if (opt == 1) {
            for (Enemy ee : e) {
                if (ee.getHP() <= 0) continue;
                System.out.println(getName() + "对" + ee.getName() + "造成了" + atkSelected(ee) + "点伤害");
            }
        }
        else if (opt == 2) {
            System.out.println("请输入你想攻击的序号：");
            opt = in.nextInt() - 1;
MAKEDAMAGE :do {
                int cnt = 0;
                for (Enemy ee : e) {
                    if (ee.getHP() > 0) {
                        if (cnt++ == opt) {
                            ShowSettings.showLine();
                            System.out.println(getName() + "对" + ee.getName() + "造成了" + super.atkSelected(ee) + "点伤害");
                            break MAKEDAMAGE;
                        }
                    }
                }
                System.out.println("请输入正确的序号：");
                opt = in.nextInt();
            } while (true);
        }
        else if (opt == 3) {
            super.atkInc();
            System.out.println(getName() + "提升了攻击力");
        }
        else if (opt == 4) {
            super.defInc();
            System.out.println(getName() + "提升了防御力");
        }
        return opt;
    }
}
