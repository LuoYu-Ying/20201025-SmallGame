package Game;

import java.util.Scanner;

public class LivingCreatureBasicSettings {
    private String name;
    private int HP, fullHP;
    private int ATK;
    private int DEF;

    public LivingCreatureBasicSettings() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHP() {
        return HP;
    }

    public int getFullHP() {
        return fullHP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public void setFullHP(int fullHP) {
        this.fullHP = fullHP;
    }

    public int getATK() {
        return ATK;
    }

    public void setATK(int ATK) {
        this.ATK = ATK;
    }

    public int getDEF() {
        return DEF;
    }

    public void setDEF(int DEF) {
        this.DEF = DEF;
    }

    public void setValues(String aName) {
        Scanner in = new Scanner(System.in);
        String name;
        int val;
        ShowSettings.showLine();
        System.out.println("请输入" + aName + "名称：");
        name = in.nextLine();
        setName(name);
        ShowSettings.showLine();
        System.out.println("请输入" + aName + "生命值：");
        val = in.nextInt();
        setHP(val);
        setFullHP(val);
        ShowSettings.showLine();
        System.out.println("请输入" + aName + "攻击力：");
        val = in.nextInt();
        setATK(val);
        ShowSettings.showLine();
        System.out.println("请输入" + aName + "防御值：");
        val = in.nextInt();
        setDEF(val);
        ShowSettings.showLine();
        System.out.println("");
    }

}
