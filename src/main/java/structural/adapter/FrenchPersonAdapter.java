package structural.adapter;

import structural.adapter.english.IPerson;
import structural.adapter.french.IFrenchPerson;

/**
 * Created by mtumilowicz on 2017-11-11.
 */
public class FrenchPersonAdapter implements IPerson {
    private final IFrenchPerson frenchman;
    
    public FrenchPersonAdapter(IFrenchPerson frenchman) {
        this.frenchman = frenchman;
    }

    @Override
    public String name() {
        return frenchman != null ? frenchman.nom() : null;
    }

    @Override
    public String lastName() {
        return frenchman != null ? frenchman.prenom() : null;
    }
}
