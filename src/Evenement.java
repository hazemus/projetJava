class Evenement {
    private String nomEvenement;
    private String date;
    private String lieu;

    public Evenement(String nomEvenement, String date, String lieu) {
        this.nomEvenement = nomEvenement;
        this.date = date;
        this.lieu = lieu;
    }

    public String getNomEvenement() {
        return nomEvenement;
    }

    public String getDate() {
        return date;
    }

    public String getLieu() {
        return lieu;
    }
}
