package Moves;
import ru.ifmo.se.pokemon.*;

public class Swagger extends StatusMove {
    public Swagger() {super(Type.NORMAL,0.0,85); }
    @Override
    protected java.lang.String describe() {
        return "Swagger confuses the target and raises its Attack by two stages.";
    }
    @Override
    protected void applyOppEffects(Pokemon p){
        p.setMod(Stat.ATTACK, 2);
    }
}