package Moves;
import ru.ifmo.se.pokemon.*;

public class Leer extends StatusMove {
    public Leer() {super(Type.NORMAL,0,100); }

    @Override
    protected java.lang.String describe() {
        return "Leer lowers the target's Defense by one stage.";
    }

    @Override
    protected void applyOppEffects(Pokemon p){
    p.setMod(Stat.DEFENSE, -1);
    }
}
