package Pokemons;
import ru.ifmo.se.pokemon.*;
import Moves.Tackle;
public class Araquanid extends Dewpider  {
    public Araquanid(String name, int level) {
        super(name,level);
        setType(Type.WATER, Type.BUG);
        setStats(68D,70D,92D,50D,132D,42D);
        setMove( new Tackle());
    }
}