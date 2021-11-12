package Pokemons;
import ru.ifmo.se.pokemon.*;
import Moves.Rest;
import Moves.RockTomb;
import Moves.Leer;
import Moves.AerialAce;



public class Castform extends Pokemon  {
    public Castform(String name, int level) {
        super(name,level);
        setType(Type.NORMAL);
        setStats(70D,70D,70D,70D,70D,70D);
        setMove( new Rest(),new RockTomb(), new Leer(), new AerialAce());
    }
}
