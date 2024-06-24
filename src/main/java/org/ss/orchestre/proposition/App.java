package org.ss.orchestre.proposition;

public class App {
    public App() {
    }

    public static void main(String[] args) {
        System.out.println("Le batteur : ");
        Musicien batteur = new Musicien(new Batterie(), "La 9eme de Beethoven");
        batteur.jouerMorceau();
        System.out.println("Le pianiste : ");
        Musicien pianiste = new Musicien(new Piano(), "La 9eme de Beethoven");
        pianiste.jouerMorceau();
        System.out.println("Le violoniste : ");
        Musicien violoniste = new Musicien(new Violon(), "La 9eme de Beethoven");
        violoniste.jouerMorceau();
        System.out.println("L'orchestre : ");
        Orchestre orchestre = new Orchestre();
        orchestre.ajout(pianiste);
        orchestre.ajout(violoniste);
        orchestre.jouer();
    }
}
