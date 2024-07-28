class Cours {
    private String nomCours;
    private String codeCours;
    private Professeur professeur;

    public Cours(String nomCours, String codeCours, Professeur professeur) {
        this.nomCours = nomCours;
        this.codeCours = codeCours;
        this.professeur = professeur;
    }

    public String getNomCours() {
        return nomCours;
    }

    public String getCodeCours() {
        return codeCours;
    }

    public Professeur getProfesseur() {
        return professeur;
    }
}
