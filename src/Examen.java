class Examen {
    private Cours cours;
    private String date;

    public Examen(Cours cours, String date) {
        this.cours = cours;
        this.date = date;
    }

    public Cours getCours() {
        return cours;
    }

    public String getDate() {
        return date;
    }
}