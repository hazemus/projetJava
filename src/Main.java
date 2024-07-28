import java.util.*;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static List<Professeur> professeurs = new ArrayList<>();
    private static List<Etudiant> etudiants = new ArrayList<>();
    private static List<Cours> coursList = new ArrayList<>();
    private static List<Departement> departements = new ArrayList<>();
    private static List<Evenement> evenements = new ArrayList<>();
    private static List<Club> clubs = new ArrayList<>();

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n===== Menu Principal =====");
            System.out.println("1. Gestion des étudiants");
            System.out.println("2. Gestion des professeurs");
            System.out.println("3. Gestion des cours");
            System.out.println("4. Gestion des départements");
            System.out.println("5. Gestion des événements");
            System.out.println("6. Gestion des clubs");
            System.out.println("0. Quitter");
            System.out.print("Choisissez une option: ");
            int choix = scanner.nextInt();
            scanner.nextLine();

            switch (choix) {
                case 1:
                    gestionEtudiants();
                    break;
                case 2:
                    gestionProfesseurs();
                    break;
                case 3:
                    gestionCours();
                    break;
                case 4:
                    gestionDepartements();
                    break;
                case 5:
                    gestionEvenements();
                    break;
                case 6:
                    gestionClubs();
                    break;
                case 0:
                    System.out.println("Au revoir !");
                    return;
                default:
                    System.out.println("Option invalide. Veuillez réessayer.");
            }
        }
    }

    private static void gestionEtudiants() {
        System.out.println("\n--- Gestion des Étudiants ---");
        System.out.println("1. Ajouter un étudiant");
        System.out.println("2. Inscrire un étudiant à un cours");
        System.out.println("3. Attribuer une note à un étudiant");
        System.out.println("4. Afficher les informations d'un étudiant");
        System.out.print("Choisissez une option: ");
        int choix = scanner.nextInt();
        scanner.nextLine();

        switch (choix) {
            case 1:
                ajouterEtudiant();
                break;
            case 2:
                inscrireEtudiant();
                break;
            case 3:
                attribuerNote();
                break;
            case 4:
                afficherInfosEtudiant();
                break;
            default:
                System.out.println("Option invalide.");
        }
    }

    private static void gestionProfesseurs() {
        System.out.println("\n--- Gestion des Professeurs ---");
        System.out.println("1. Ajouter un professeur");
        System.out.println("2. Afficher les informations d'un professeur");
        System.out.print("Choisissez une option: ");
        int choix = scanner.nextInt();
        scanner.nextLine();

        switch (choix) {
            case 1:
                ajouterProfesseur();
                break;
            case 2:
                afficherInfosProfesseur();
                break;
            default:
                System.out.println("Option invalide.");
        }
    }

    private static void gestionCours() {
        System.out.println("\n--- Gestion des Cours ---");
        System.out.println("1. Ajouter un cours");
        System.out.println("2. Afficher les informations d'un cours");
        System.out.print("Choisissez une option: ");
        int choix = scanner.nextInt();
        scanner.nextLine();

        switch (choix) {
            case 1:
                ajouterCours();
                break;
            case 2:
                afficherInfosCours();
                break;
            default:
                System.out.println("Option invalide.");
        }
    }

    private static void gestionDepartements() {
        System.out.println("\n--- Gestion des Départements ---");
        System.out.println("1. Ajouter un département");
        System.out.println("2. Ajouter un cours à un département");
        System.out.print("Choisissez une option: ");
        int choix = scanner.nextInt();
        scanner.nextLine();

        switch (choix) {
            case 1:
                ajouterDepartement();
                break;
            case 2:
                ajouterCoursDepartement();
                break;
            default:
                System.out.println("Option invalide.");
        }
    }

    private static void gestionEvenements() {
        System.out.println("\n--- Gestion des Événements ---");
        System.out.println("1. Ajouter un événement");
        System.out.println("2. Afficher les informations d'un événement");
        System.out.print("Choisissez une option: ");
        int choix = scanner.nextInt();
        scanner.nextLine();

        switch (choix) {
            case 1:
                ajouterEvenement();
                break;
            case 2:
                afficherInfosEvenement();
                break;
            default:
                System.out.println("Option invalide.");
        }
    }

    private static void gestionClubs() {
        System.out.println("\n--- Gestion des Clubs ---");
        System.out.println("1. Ajouter un club");
        System.out.println("2. Ajouter un membre à un club");
        System.out.println("3. Afficher les informations d'un club");
        System.out.print("Choisissez une option: ");
        int choix = scanner.nextInt();
        scanner.nextLine();

        switch (choix) {
            case 1:
                ajouterClub();
                break;
            case 2:
                ajouterMembreClub();
                break;
            case 3:
                afficherInfosClub();
                break;
            default:
                System.out.println("Option invalide.");
        }
    }

    private static void ajouterEtudiant() {
        System.out.print("Nom de l'étudiant: ");
        String nom = scanner.nextLine();
        System.out.print("ID de l'étudiant: ");
        String id = scanner.nextLine();
        etudiants.add(new Etudiant(nom, id));
        System.out.println("Étudiant ajouté avec succès.");
    }

    private static void inscrireEtudiant() {
        System.out.print("ID de l'étudiant: ");
        String id = scanner.nextLine();
        Etudiant etudiant = trouverEtudiantParID(id);
        if (etudiant != null) {
            System.out.print("Nom du cours: ");
            String nomCours = scanner.nextLine();
            Cours cours = trouverCoursParNom(nomCours);
            if (cours != null) {
                etudiant.inscrire(cours);
                System.out.println("Étudiant inscrit au cours.");
            } else {
                System.out.println("Cours non trouvé.");
            }
        } else {
            System.out.println("Étudiant non trouvé.");
        }
    }

    private static void attribuerNote() {
        System.out.print("ID de l'étudiant: ");
        String id = scanner.nextLine();
        Etudiant etudiant = trouverEtudiantParID(id);
        if (etudiant != null) {
            System.out.print("Nom du cours: ");
            String nomCours = scanner.nextLine();
            Cours cours = trouverCoursParNom(nomCours);
            if (cours != null) {
                System.out.print("Note: ");
                String note = scanner.nextLine();
                etudiant.attribuerNote(cours, note);
                System.out.println("Note attribuée.");
            } else {
                System.out.println("Cours non trouvé.");
            }
        } else {
            System.out.println("Étudiant non trouvé.");
        }
    }

    private static void afficherInfosEtudiant() {
        System.out.print("ID de l'étudiant: ");
        String id = scanner.nextLine();
        Etudiant etudiant = trouverEtudiantParID(id);
        if (etudiant != null) {
            System.out.println("Nom: " + etudiant.getNom());
            System.out.println("Cours inscrits:");
            for (Cours cours : etudiant.getCoursInscrits()) {
                System.out.println("- " + cours.getNomCours());
            }
            System.out.println("Notes:");
            for (Cours cours : etudiant.getCoursInscrits()) {
                System.out.println(cours.getNomCours() + ": " + etudiant.getNote(cours));
            }
        } else {
            System.out.println("Étudiant non trouvé.");
        }
    }

    private static void ajouterProfesseur() {
        System.out.print("Nom du professeur: ");
        String nom = scanner.nextLine();
        System.out.print("ID du professeur: ");
        String id = scanner.nextLine();
        System.out.print("Salaire du professeur: ");
        double salaire = scanner.nextDouble();
        scanner.nextLine();
        professeurs.add(new Professeur(nom, id, salaire));
        System.out.println("Professeur ajouté avec succès.");
    }

    private static void afficherInfosProfesseur() {
        System.out.print("ID du professeur: ");
        String id = scanner.nextLine();
        Professeur professeur = trouverProfesseurParID(id);
        if (professeur != null) {
            System.out.println("Nom: " + professeur.getNom());
            System.out.println("Salaire: " + professeur.getSalaire());
        } else {
            System.out.println("Professeur non trouvé.");
        }
    }

    private static void ajouterCours() {
        System.out.print("Nom du cours: ");
        String nom = scanner.nextLine();
        System.out.print("Code du cours: ");
        String code = scanner.nextLine();
        System.out.print("ID du professeur: ");
        String idProfesseur = scanner.nextLine();
        Professeur professeur = trouverProfesseurParID(idProfesseur);
        if (professeur != null) {
            coursList.add(new Cours(nom, code, professeur));
            System.out.println("Cours ajouté avec succès.");
        } else {
            System.out.println("Professeur non trouvé.");
        }
    }

    private static void afficherInfosCours() {
        System.out.print("Nom du cours: ");
        String nom = scanner.nextLine();
        Cours cours = trouverCoursParNom(nom);
        if (cours != null) {
            System.out.println("Nom: " + cours.getNomCours());
            System.out.println("Code: " + cours.getCodeCours());
            System.out.println("Professeur: " + cours.getProfesseur().getNom());
        } else {
            System.out.println("Cours non trouvé.");
        }
    }

    private static void ajouterDepartement() {
        System.out.print("Nom du département: ");
        String nom = scanner.nextLine();
        departements.add(new Departement(nom));
        System.out.println("Département ajouté avec succès.");
    }

    private static void ajouterCoursDepartement() {
        System.out.print("Nom du département: ");
        String nom = scanner.nextLine();
        Departement departement = trouverDepartementParNom(nom);
        if (departement != null) {
            System.out.print("Nom du cours: ");
            String nomCours = scanner.nextLine();
            Cours cours = trouverCoursParNom(nomCours);
            if (cours != null) {
                departement.ajouterCours(cours);
                System.out.println("Cours ajouté au département.");
            } else {
                System.out.println("Cours non trouvé.");
            }
        } else {
            System.out.println("Département non trouvé.");
        }
    }

    private static void ajouterEvenement() {
        System.out.print("Nom de l'événement: ");
        String nom = scanner.nextLine();
        System.out.print("Date de l'événement (AAAA-MM-JJ): ");
        String date = scanner.nextLine();
        System.out.print("Lieu de l'événement: ");
        String lieu = scanner.nextLine();
        evenements.add(new Evenement(nom, date, lieu));
        System.out.println("Événement ajouté avec succès.");
    }

    private static void afficherInfosEvenement() {
        System.out.print("Nom de l'événement: ");
        String nom = scanner.nextLine();
        Evenement evenement = trouverEvenementParNom(nom);
        if (evenement != null) {
            System.out.println("Nom: " + evenement.getNomEvenement());
            System.out.println("Date: " + evenement.getDate());
            System.out.println("Lieu: " + evenement.getLieu());
        } else {
            System.out.println("Événement non trouvé.");
        }
    }

    private static void ajouterClub() {
        System.out.print("Nom du club: ");
        String nom = scanner.nextLine();
        clubs.add(new Club(nom));
        System.out.println("Club ajouté avec succès.");
    }

    private static void ajouterMembreClub() {
        System.out.print("Nom du club: ");
        String nom = scanner.nextLine();
        Club club = trouverClubParNom(nom);
        if (club != null) {
            System.out.print("ID de l'étudiant: ");
            String id = scanner.nextLine();
            Etudiant etudiant = trouverEtudiantParID(id);
            if (etudiant != null) {
                club.ajouterMembre(etudiant);
                System.out.println("Étudiant ajouté au club.");
            } else {
                System.out.println("Étudiant non trouvé.");
            }
        } else {
            System.out.println("Club non trouvé.");
        }
    }

    private static void afficherInfosClub() {
        System.out.print("Nom du club: ");
        String nom = scanner.nextLine();
        Club club = trouverClubParNom(nom);
        if (club != null) {
            System.out.println("Nom: " + club.getNom());
            System.out.println("Membres:");
            for (Etudiant membre : club.getMembres()) {
                System.out.println("- " + membre.getNom());
            }
        } else {
            System.out.println("Club non trouvé.");
        }
    }



    private static Etudiant trouverEtudiantParID(String id) {
        for (Etudiant etudiant : etudiants) {
            if (etudiant.getID().equals(id)) {
                return etudiant;
            }
        }
        return null;
    }

    private static Professeur trouverProfesseurParID(String id) {
        for (Professeur professeur : professeurs) {
            if (professeur.getID().equals(id)) {
                return professeur;
            }
        }
        return null;
    }

    private static Cours trouverCoursParNom(String nom) {
        for (Cours cours : coursList) {
            if (cours.getNomCours().equals(nom)) {
                return cours;
            }
        }
        return null;
    }

    private static Departement trouverDepartementParNom(String nom) {
        for (Departement departement : departements) {
            if (departement.getNom().equals(nom)) {
                return departement;
            }
        }
        return null;
    }

    private static Evenement trouverEvenementParNom(String nom) {
        for (Evenement evenement : evenements) {
            if (evenement.getNomEvenement().equals(nom)) {
                return evenement;
            }
        }
        return null;
    }

    private static Club trouverClubParNom(String nom) {
        for (Club club : clubs) {
            if (club.getNom().equals(nom)) {
                return club;
            }
        }
        return null;
    }
}
