package Moves;
import ru.ifmo.se.pokemon.*;

public class DoubleTeam extends SpecialMove {
    public DoubleTeam() {super(Type.NORMAL,0,0); }

    @Override
    protected java.lang.String describe() {
        return "Double Team raises the user's Evasiveness by one stage, thus making the user more difficult to hit.";
    }
    @Override
    protected void applySelfEffects(Pokemon p){

        p.setMod(Stat.EVASION, +1);
    }
}

