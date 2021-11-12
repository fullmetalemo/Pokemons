package Moves;
import ru.ifmo.se.pokemon.*;

public class Tackle extends PhysicalMove {
    public Tackle() {super(Type.NORMAL,40,100); }

    @Override
    protected java.lang.String describe() { return "Aura Sphere deals damage and ignores changes to the Accuracy and Evasion stats."; }

    @Override
    protected void applySelfEffects(Pokemon p){
    p.setMod(Stat.DEFENSE, 1);
    }
}

