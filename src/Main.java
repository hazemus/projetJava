public class Main {
    public static void main(String[] args) {
        // Création de professeurs
        Professeur prof1 = new Professeur("Jean Dupont", "P123", 50000);
        Professeur prof2 = new Professeur("Marie Curie", "P456", 60000);

        // Création de cours
        Cours cours1 = new Cours("Mathématiques", "M101", prof1);
        Cours cours2 = new Cours("Physique", "P102", prof2);

        // Création de départements
        Departement departementMaths = new Departement("Mathématiques");
        Departement departementPhysique = new Departement("Physique");
        departementMaths.ajouterCours(cours1);
        departementPhysique.ajouterCours(cours2);

        // Création d'étudiants
        Etudiant etudiant1 = new Etudiant("Alice", "S001");
        Etudiant etudiant2 = new Etudiant("Bob", "S002");

        // Inscription des étudiants aux cours
        etudiant1.inscrire(cours1);
        etudiant2.inscrire(cours1);
        etudiant2.inscrire(cours2);

        // Attribution des notes
        etudiant1.attribuerNote(cours1, "A");
        etudiant2.attribuerNote(cours1, "B");
        etudiant2.attribuerNote(cours2, "A");

        // Affichage des informations des étudiants
        System.out.println("Étudiant: " + etudiant1.getNom() + ", ID: " + etudiant1.getID());
        System.out.println("Cours inscrits:");
        for (Cours cours : etudiant1.getCoursInscrits()) {
            System.out.println("- " + cours.getNomCours());
        }
        System.out.println("Notes:");
        for (Cours cours : etudiant1.getCoursInscrits()) {
            System.out.println(cours.getNomCours() + ": " + etudiant1.getNote(cours));
        }

        System.out.println();

        System.out.println("Étudiant: " + etudiant2.getNom() + ", ID: " + etudiant2.getID());
        System.out.println("Cours inscrits:");
        for (Cours cours : etudiant2.getCoursInscrits()) {
            System.out.println("- " + cours.getNomCours());
        }
        System.out.println("Notes:");
        for (Cours cours : etudiant2.getCoursInscrits()) {
            System.out.println(cours.getNomCours() + ": " + etudiant2.getNote(cours));
        }

        // Affichage des informations des professeurs
        System.out.println();
        System.out.println("Professeur: " + prof1.getNom() + ", ID: " + prof1.getID() + ", Salaire: " + prof1.getSalaire());
        System.out.println("Professeur: " + prof2.getNom() + ", ID: " + prof2.getID() + ", Salaire: " + prof2.getSalaire());

        // Création d'événements et de clubs
        Evenement evenement1 = new Evenement("Conférence sur l'IA", "2024-09-15", "Auditorium");
        Club club1 = new Club("Club de robotique");
        club1.ajouterMembre(etudiant1);
        club1.ajouterMembre(etudiant2);

        // Affichage des informations des événements et des clubs
        System.out.println();
        System.out.println("Événement: " + evenement1.getNomEvenement() + ", Date: " + evenement1.getDate() + ", Lieu: " + evenement1.getLieu());
        System.out.println("Club: " + club1.getNom());
        System.out.println("Membres:");
        for (Etudiant membre : club1.getMembres()) {
            System.out.println("- " + membre.getNom());
        }
    }
}
