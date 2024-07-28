import java.util.ArrayList;
import java.util.List;

class Departement {
    private String nom;
    private List<Cours> cours = new ArrayList<>();

    public Departement(String nom) {
        this.nom = nom;
    }

    public void ajouterCours(Cours cours) {
        this.cours.add(cours); // Adding a course to the department's list of courses
    }

    public void supprimerCours(Cours cours) {
        this.cours.remove(cours); // Removing a course from the department's list of courses
    }

    public List<Cours> getCours() {
        return cours; // Returning the list of courses in the department
    }
}
