package Pokemons;
import ru.ifmo.se.pokemon.*;
import Moves.DoubleTeam;
import Moves.Scratch;

public class Poliwag extends Pokemon  {
    public Poliwag(String name, int level) {
        super(name,level);
        setType(Type.WATER);
        setStats(40D,50D,40D,40D,40D,90D);
        setMove( new Scratch(),new DoubleTeam());
    }
}