import java.util.ArrayList;
import java.util.List;

class ReleveDeNotes {
    private Etudiant etudiant;
    private List<Note> notes = new ArrayList<>();

    public ReleveDeNotes(Etudiant etudiant) {
        this.etudiant = etudiant;
    }

    public void ajouterNote(Note note) {
        notes.add(note);
    }

    public List<Note> getNotes() {
        return notes;
    }
}