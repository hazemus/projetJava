import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Etudiant extends PersonneImpl implements IInscription, INote {
    private List<Cours> coursInscrits = new ArrayList<>();
    private Map<Cours, String> notes = new HashMap<>();

    public Etudiant(String nom, String id) {
        super(nom, id);
    }

    public void inscrire(Cours cours) {
        coursInscrits.add(cours); // Adding the course to the list of enrolled courses
    }

    public void abandonner(Cours cours) {
        coursInscrits.remove(cours); // Removing the course from the list of enrolled courses
    }

    public void attribuerNote(Cours cours, String note) {
        notes.put(cours, note); // Assigning a grade to a course
    }

    public String getNote(Cours cours) {
        return notes.get(cours); // Retrieving the grade for a specific course
    }
    public List<Cours> getCoursInscrits() {
        return coursInscrits;
    }
}
