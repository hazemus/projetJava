import java.util.ArrayList;
import java.util.List;

class Bibliotheque {
    private List<Livre> livres = new ArrayList<>();

    public void ajouterLivre(Livre livre) {
        livres.add(livre);
    }

    public void supprimerLivre(Livre livre) {
        livres.remove(livre);
    }

    public List<Livre> getLivres() {
        return livres;
    }
}