package com.company;
import Pokemons.*;
import ru.ifmo.se.pokemon.*;

public class Main {

    public static void main(String[] args) {
        Battle b = new Battle();
        Pokemon p1 = new Castform("Castform", 1);
        Pokemon p2 = new Dewpider("Dewpider", 1);
        Pokemon p3 = new Araquanid("Araquanid", 1);
        Pokemon p4 = new Poliwag("Poliwag", 1);
        Pokemon p5 = new Poliwhirl("Poliwhirl", 1);
        Pokemon p6 = new Poliwrath("Poliwrath", 1);
        b.addAlly(p1);
        b.addAlly(p2);
        b.addAlly(p3);
        b.addFoe(p4);
        b.addFoe(p5);
        b.addFoe(p6);

        b.go();
    }
}
