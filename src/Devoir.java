class Devoir {
    private String titre;
    private String description;
    private Cours cours;

    public Devoir(String titre, String description, Cours cours) {
        this.titre = titre;
        this.description = description;
        this.cours = cours;
    }

    public String getTitre() {
        return titre;
    }

    public String getDescription() {
        return description;
    }

    public Cours getCours() {
        return cours;
    }
}
