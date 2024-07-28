class Note {
    private Cours cours;
    private String note;

    public Note(Cours cours, String note) {
        this.cours = cours;
        this.note = note;
    }

    public Cours getCours() {
        return cours;
    }

    public String getNote() {
        return note;
    }
}