package org.ss.orchestre.proposition;

public class Batterie implements Instrument {
    @Override
    public void afficher() {
        System.out.println("Je suis une batterie...");
    }

    @Override
    public void jouer() {
        System.out.println("Boom Boom Schack");
    }
}
