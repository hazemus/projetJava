class Professeur extends PersonneImpl implements IEmploye {
    private double salaire;

    public Professeur(String nom, String id, double salaire) {
        super(nom, id);
        this.salaire = salaire;
    }

    public double getSalaire() {
        return salaire;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }
}