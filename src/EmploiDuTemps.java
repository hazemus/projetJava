class EmploiDuTemps {
    private Cours cours;
    private String jour;
    private String heure;

    public EmploiDuTemps(Cours cours, String jour, String heure) {
        this.cours = cours;
        this.jour = jour;
        this.heure = heure;
    }

    public Cours getCours() {
        return cours;
    }

    public String getJour() {
        return jour;
    }

    public String getHeure() {
        return heure;
    }
}