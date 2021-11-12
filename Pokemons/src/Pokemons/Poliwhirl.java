package Pokemons;
import Moves.Flatter;
import ru.ifmo.se.pokemon.*;
import Moves.Flatter;

public class Poliwhirl extends Poliwag  {
    public Poliwhirl(String name, int level) {
        super(name,level);
        setType(Type.WATER);
        setStats(65D,65D,65D,50D,50D,90D);
        setMove( new Flatter());
    }
}