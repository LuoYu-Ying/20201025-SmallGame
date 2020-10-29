package Game;

public class SkillsOfPlayer extends LivingCreatureBasicSettings{
    public SkillsOfPlayer() {
    }

    public int atkSelected(Enemy aEnemy) {
        int aHP = aEnemy.getHP();
        int damage = ((getATK() - aEnemy.getDEF()) <= 0) ? 1 : (getATK() - aEnemy.getDEF());
        if (aHP <= damage)
            aEnemy.setHP( 0 );
        else
            aEnemy.setHP(aHP - damage);
        return damage;
    }

    public void atkInc() {
        super.setATK(super.getATK() * 11 / 10);
    }


    public void defInc() {
        super.setDEF(super.getDEF() * 11 / 10);
    }
}
