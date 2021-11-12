package Moves;
import ru.ifmo.se.pokemon.*;

public class Flatter extends StatusMove {
    public Flatter() {super(Type.DARK,0,100); }

    @Override
    protected java.lang.String describe() {
        return "Confuses opponent, but raises its Special Attack by two stages.";
    }
    @Override
    public void applySelfEffects(Pokemon p){
        p.setMod(Stat.SPECIAL_ATTACK, +2);

    }
}

