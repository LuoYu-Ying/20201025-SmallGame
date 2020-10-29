package Game;

public class SkillsOfEnemy extends LivingCreatureBasicSettings{
    public SkillsOfEnemy() {
    }

    public int atkPlayer(Player aPlayer) {
        int aHP = aPlayer.getHP();
        int damage = ((getATK() - aPlayer.getDEF()) <= 0) ? 1 : (getATK() - aPlayer.getDEF());
        if (aHP <= damage)
            aPlayer.setHP( 0 );
        else
            aPlayer.setHP(aHP - damage);
        return damage;
    }

    public void atkInc() {
        super.setATK(super.getATK() * 11 / 10);
    }


    public void defInc() {
        super.setDEF(super.getDEF() * 11 / 10);
    }
}
