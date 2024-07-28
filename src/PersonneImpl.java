class PersonneImpl implements IPersonne {
    private String nom;
    private String id;

    public PersonneImpl(String nom, String id) {
        this.nom = nom;
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public String getID() {
        return id;
    }
}