import java.util.ArrayList;
import java.util.List;

class Club {
    private String nom;
    private List<Etudiant> membres = new ArrayList<>();

    public Club(String nom) {
        this.nom = nom;
    }

    public void ajouterMembre(Etudiant etudiant) {
        membres.add(etudiant);
    }

    public void supprimerMembre(Etudiant etudiant) {
        membres.remove(etudiant);
    }

    public List<Etudiant> getMembres() {
        return membres;
    }

    public String getNom() {
        return nom;
    }
}
