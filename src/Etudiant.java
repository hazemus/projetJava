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
        coursInscrits.add(cours);
    }

    public void abandonner(Cours cours) {
        coursInscrits.remove(cours);
    }

    public void attribuerNote(Cours cours, String note) {
        notes.put(cours, note);
    }

    public String getNote(Cours cours) {
        return notes.get(cours);
    }
    public List<Cours> getCoursInscrits() {
        return coursInscrits;
    }
}
