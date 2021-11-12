package Pokemons;
import ru.ifmo.se.pokemon.*;
import Moves.Rest;
import Moves.Swagger;
import Moves.Confide;



public class Dewpider extends Pokemon  {
    public Dewpider(String name, int level) {
        super(name,level);
        setType(Type.WATER, Type.BUG);
        setStats(38D,40D,52D,40D,72D,27D);
        setMove( new Rest(),new Confide(), new Swagger());
    }
}