package Game;

import java.util.ArrayList;
import java.util.Scanner;
import static java.lang.System.exit;

public class GameMain {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ShowSettings.showSkills();

        //Part1 : 输入双方设定
        Player player = new Player();
        ArrayList<Enemy> enemies = new ArrayList<>();
        Enemy tmp = new Enemy();

        player.setValues("玩家");
        ShowSettings.showCLS();
        tmp.setValues("怪物");
        ShowSettings.showCLS();
        enemies.add(tmp);
        //继续增加数量
        while (true) {
            System.out.println("还需要继续增加怪物数量吗？（yes/no）");
            String s = in.nextLine();
            if (! s.equals("yes")) {
                ShowSettings.showLine();
                break;
            }
            Enemy newTmp = new Enemy();
            newTmp.setValues("怪物");
            ShowSettings.showCLS();
            enemies.add(newTmp);
        }

        //Part2 : 显示画面
        boolean flag = true;
        int round = 0, livingEnemy = 0;
POINT:
        while (flag) {
            ShowSettings.showCLS();
            System.out.println("第" + (++round) + "回合：");
            ShowSettings.showLine();
            System.out.println("生命值：");
            ShowSettings.showHP(player, 0);
            livingEnemy = 0;
            for (Enemy e : enemies) {
                if (e.getHP() > 0) {
                    ShowSettings.showHP(e, ++livingEnemy);
                }
            }
            ShowSettings.showLine();

            //结束判断
            if (player.getHP() == 0) {
                ShowSettings.playerFail();
                exit(0);
            }
            else if (livingEnemy == 0) {
                ShowSettings.playerWin();
                exit(0);
            }

            ShowSettings.showSkillsInOneRound();
            player.selectSkill(enemies);
            ShowSettings.showLine();

            for (Enemy e : enemies) {
                if (e.getHP() > 0) {
                    e.selectSkills(player);
                }
            }

            System.out.println("\n按回车进行下一回合：");
            in.nextLine();
        }
    }
}
