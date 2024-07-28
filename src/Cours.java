
class Cours {
    private String nomCours;
    private String codeCours;
    private Professeur enseignant;

    public Cours(String nomCours, String codeCours, Professeur enseignant) {
        this.nomCours = nomCours;
        this.codeCours = codeCours;
        this.enseignant = enseignant;
    }

    public String getNomCours() {
        return nomCours;
    }

    public String getCodeCours() {
        return codeCours;
    }

    public Professeur getEnseignant() {
        return enseignant;
    }
}