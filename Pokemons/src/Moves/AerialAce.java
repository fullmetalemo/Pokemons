package Moves;
import ru.ifmo.se.pokemon.*;

public class AerialAce extends PhysicalMove {
    public AerialAce() {super(Type.FLYING,60,10000); }

    @Override
    protected java.lang.String describe() {
        return "Aerial Ace deals damage and ignores changes to the Accuracy and Evasion stats.";
    }

    @Override
    protected void applyOppDamage(Pokemon def, double damage){
        def.setMod(Stat.HP, (int)damage);
    }
}