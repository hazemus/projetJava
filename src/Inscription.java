class Inscription {
    private Etudiant etudiant;
    private Cours cours;
    private String semestre;

    public Inscription(Etudiant etudiant, Cours cours, String semestre) {
        this.etudiant = etudiant;
        this.cours = cours;
        this.semestre = semestre;
    }

    public Etudiant getEtudiant() {
        return etudiant;
    }

    public Cours getCours() {
        return cours;
    }

    public String getSemestre() {
        return semestre;
    }
}