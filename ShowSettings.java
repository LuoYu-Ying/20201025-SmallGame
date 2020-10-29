package Game;

import java.util.Scanner;

public class ShowSettings {

    public static void showSkills() {
        showLine();
        System.out.println("玩家技能：1.随机攻击一名怪物");
        System.out.println("        2.全体攻击");
        System.out.println("        3.指定攻击一名怪物");
        System.out.println("        4.提升自身攻击力10%");
        System.out.println("        5.提升自身防御力10%");
        showLine();
        System.out.println("怪物技能：1.攻击玩家");
        System.out.println("        2.提升自身攻击力10%");
        System.out.println("        3.提升自身防御力10%");
        showLine();
        System.out.println("\n按回车继续：");
        new Scanner(System.in).nextLine();
        for (int i = 0; i < 50; i++) {
            System.out.println("");
        }
    }

    /**
     * show the HP of every living creature
     */
    public static void showHP(LivingCreatureBasicSettings x, int index) {
        int len = x.getHP() * 10 / x.getFullHP();
        System.out.printf("(%d) %s : ", index, x.getName());
        for (int i = 1; i <= 10; i++) {
            if (len >= i) System.out.print("■");
            else System.out.print("□");
        }
        System.out.println(" " + x.getHP() + "/" + x.getFullHP());
    }

    public static void showCLS() {
        for (int i = 0; i < 50; i++) {
            System.out.println("");
        }
    }

    public static void showLine() {
        System.out.println("============================================================");
    }

    public static void showSkillsInOneRound() {
        System.out.println("技能：");
        System.out.println("---------------------------------------");
        System.out.println("| 1.随机攻击 | | 2. 全体攻击| | 3.指定攻击 |");
        System.out.println("---------------------------------------");
        System.out.println("| 4.提升攻击 | | 5.提升防御 |");
        System.out.println("--------------------------");
        System.out.println("请选择你想使用的技能：");
    }

    public static void playerWin() {
        ShowSettings.showCLS();
        ShowSettings.showLine();
        System.out.println("你赢啦！");
        ShowSettings.showLine();
    }

    public static void playerFail() {
        ShowSettings.showCLS();
        ShowSettings.showLine();
        System.out.println("你输啦！");
        ShowSettings.showLine();
    }
}
