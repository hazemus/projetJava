import java.util.ArrayList;
import java.util.List;

class Departement {
    private String nom;
    private List<Cours> coursList = new ArrayList<>();

    public Departement(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void ajouterCours(Cours cours) {
        coursList.add(cours);
    }

    public List<Cours> getCoursList() {
        return coursList;
    }
}

