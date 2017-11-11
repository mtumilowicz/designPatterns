package structural.adapter.french;

/**
 * Created by mtumilowicz on 2017-11-11.
 */
public class Frenchman implements IFrenchPerson {
    private String nom;
    private String prenom;

    public Frenchman(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    @Override
    public String nom() {
        return nom;
    }

    @Override
    public String prenom() {
        return prenom;
    }
}
