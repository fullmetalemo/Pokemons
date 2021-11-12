package Moves;
import ru.ifmo.se.pokemon.*;

public class RockTomb extends PhysicalMove {
    public RockTomb() {super(Type.ROCK,60,95); }

    @Override
    protected java.lang.String describe() {
        return "Rock Tomb deals damage and lowers the target's Speed by one stage.";
    }

    @Override
    protected void applyOppEffects(Pokemon p){
    p.setMod(Stat.SPEED, -1);
    }
}
