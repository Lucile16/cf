package org.ss.orchestre.proposition;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Orchestre {
    private List<Musicien> listeMusiciens = new ArrayList();

    public Orchestre() {
    }

    public void ajout(Musicien musicien) {
        this.listeMusiciens.add(musicien);
    }

    public void jouer() {
        Iterator var1 = this.listeMusiciens.iterator();

        while(var1.hasNext()) {
            Musicien musicien = (Musicien)var1.next();
            musicien.jouerMorceau();
        }

    }
}
