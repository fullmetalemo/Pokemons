package Pokemons;
import ru.ifmo.se.pokemon.*;

public class Poliwrath extends Poliwhirl  {
    public Poliwrath(String name, int level) {
        super(name,level);
        setType(Type.WATER, Type.FIGHTING);
        setStats(90D,95D,95D,70D,90D,70D);
    }
}