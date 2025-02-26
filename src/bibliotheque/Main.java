package bibliotheque;

import java.util.Scanner;

class ZooApp {
    private static Zoo zoo = new Zoo();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean ouvert = true;
        while (ouvert) {
            afficherMenu();
            int choix = scanner.nextInt();
            scanner.nextLine();

            switch (choix) {
                case 1:
                    ajouterAnimal();
                    break;
                case 2:
                    supprimerAnimal();
                    break;
                case 3:
                    ajouterSoigneur();
                    break;
                case 4:
                    ajouterEnclos();
                    break;
                case 5:
                    vendreBillet();
                    break;
                case 6:
                    diagnostiquerAnimal();
                    break;
                case 7:
                    nettoyerEnclos();
                    break;
                case 8:
                    interagirAvecAnimal();
                    break;
                case 9:
                    afficherStatistiques();
                    break;
                case 10:
                    ouvert = false;
                    System.out.println("Merci d'avoir utilisé le système de gestion du zoo !");
                    break;
                default:
                    System.out.println("Choix invalide. Veuillez réessayer.");
            }
        }
        scanner.close();
    }

    private static void afficherMenu() {
        System.out.println("\n=== Menu Principal ===");
        System.out.println("1. Ajouter un animal");
        System.out.println("2. Supprimer un animal");
        System.out.println("3. Ajouter un soigneur");
        System.out.println("4. Ajouter un enclos");
        System.out.println("5. Vendre un billet");
        System.out.println("6. Diagnostiquer un animal");
        System.out.println("7. Nettoyer un enclos");
        System.out.println("8. Interagir avec un animal");
        System.out.println("9. Afficher les statistiques du zoo");
        System.out.println("10. Quitter");
        System.out.print("Votre choix : ");
    }

    private static void ajouterAnimal() {
        System.out.print("Nom de l'animal : ");
        String nom = scanner.nextLine();
        System.out.print("Âge de l'animal : ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Type de l'animal (Lion/Oiseau/Serpent) : ");
        String type = scanner.nextLine();

        Animal animal;
        switch (type.toLowerCase()) {
            case "lion":
                animal = new Lion(nom, age);
                break;
            case "oiseau":
                animal = new Oiseau(nom, age);
                break;
            case "serpent":
                animal = new Serpent(nom, age);
                break;
            default:
                System.out.println("Type d'animal non reconnu.");
                return;
        }

        System.out.print("ID de l'enclos : ");
        int idEnclos = scanner.nextInt();
        scanner.nextLine(); // Pour consommer la nouvelle ligne

        Enclos enclos = trouverEnclosParId(idEnclos);
        if (enclos != null) {
            enclos.ajouterAnimal(animal);
            System.out.println(nom + " a été ajouté à l'enclos " + idEnclos);
        } else {
            System.out.println("Enclos non trouvé.");
        }
    }

    public static void supprimerAnimal() {
        System.out.print("Nom de l'animal : ");
        String nom = scanner.nextLine();
        scanner.nextLine();
// faire ceci
    }

    private static void ajouterSoigneur() {
        System.out.print("Nom du soigneur : ");
        String nom = scanner.nextLine();
        System.out.print("Spécialité du soigneur (Lion/Oiseau/Serpent) : ");
        String specialite = scanner.nextLine();

        Soigneur soigneur = new Soigneur(nom, specialite);
        zoo.ajouterSoigneur(soigneur);
        System.out.println(nom + " a été ajouté comme soigneur.");
    }

    private static void ajouterEnclos() {
        System.out.print("ID de l'enclos : ");
        int id = scanner.nextInt();
        System.out.print("Capacité maximale de l'enclos : ");
        int capaciteMax = scanner.nextInt();
        scanner.nextLine(); // Pour consommer la nouvelle ligne

        Enclos enclos = new Enclos(id, capaciteMax);
        zoo.ajouterEnclos(enclos);
        System.out.println("Enclos " + id + " a été ajouté.");
    }

    private static void vendreBillet() {
        System.out.print("Nom du visiteur : ");
        String nom = scanner.nextLine();
        System.out.print("Âge du visiteur : ");
        int age = scanner.nextInt();
        scanner.nextLine();

        Visiteur visiteur = new Visiteur(nom, age);
        zoo.vendreBillet(visiteur);
        System.out.println("Billet vendu à " + nom);
    }

    private static void diagnostiquerAnimal() {
        System.out.print("Nom de l'animal à diagnostiquer : ");
        String nomAnimal = scanner.nextLine();
        Animal animal = trouverAnimalParNom(nomAnimal);

        if (animal != null) {
            System.out.print("Nom du soigneur : ");
            String nomSoigneur = scanner.nextLine();
            Soigneur soigneur = trouverSoigneurParNom(nomSoigneur);

            if (soigneur != null) {
                soigneur.diagnostiquer(animal);
            } else {
                System.out.println("Soigneur non trouvé.");
            }
        } else {
            System.out.println("Animal non trouvé.");
        }
    }

    private static void nettoyerEnclos() {
        System.out.print("ID de l'enclos à nettoyer : ");
        int idEnclos = scanner.nextInt();
        scanner.nextLine();

        Enclos enclos = trouverEnclosParId(idEnclos);
        if (enclos != null) {
            System.out.print("Nom du soigneur : ");
            String nomSoigneur = scanner.nextLine();
            Soigneur soigneur = trouverSoigneurParNom(nomSoigneur);

            if (soigneur != null) {
                soigneur.nettoyerEnclos(enclos);
            } else {
                System.out.println("Soigneur non trouvé.");
            }
        } else {
            System.out.println("Enclos non trouvé.");
        }
    }

    private static void interagirAvecAnimal() {
        System.out.print("Nom du visiteur : ");
        String nomVisiteur = scanner.nextLine();
        Visiteur visiteur = trouverVisiteurParNom(nomVisiteur);

        if (visiteur != null) {
            System.out.print("Nom de l'animal : ");
            String nomAnimal = scanner.nextLine();
            Animal animal = trouverAnimalParNom(nomAnimal);

            if (animal != null) {
                visiteur.interagir(animal);
            } else {
                System.out.println("Animal non trouvé.");
            }
        } else {
            System.out.println("Visiteur non trouvé.");
        }
    }

    private static void afficherStatistiques() {
        System.out.println("\n=== Statistiques du Zoo ===");
        System.out.println("Nombre d'enclos : " + zoo.getListeEnclos().size());
        System.out.println("Nombre de soigneurs : " + zoo.getListeSoigneurs().size());
        System.out.println("Nombre de visiteurs : " + zoo.getListeVisiteurs().size());
        System.out.println("Total des ventes de billets : " + zoo.getCaisses() + " €");
    }

    private static Enclos trouverEnclosParId(int id) {
        for (Enclos enclos : zoo.getListeEnclos()) {
            if (enclos.getId() == id) {
                return enclos;
            }
        }
        return null;
    }

    private static Animal trouverAnimalParNom(String nom) {
        for (Enclos enclos : zoo.getListeEnclos()) {
            for (Animal animal : enclos.getListeAnimaux()) {
                if (animal.getNom().equalsIgnoreCase(nom)) {
                    return animal;
                }
            }
        }
        return null;
    }

    private static Soigneur trouverSoigneurParNom(String nom) {
        for (Soigneur soigneur : zoo.getListeSoigneurs()) {
            if (soigneur.getNom().equalsIgnoreCase(nom)) {
                return soigneur;
            }
        }
        return null;
    }

    private static Visiteur trouverVisiteurParNom(String nom) {
        for (Visiteur visiteur : zoo.getListeVisiteurs()) {
            if (visiteur.getNom().equalsIgnoreCase(nom)) {
                return visiteur;
            }
        }
        return null;
    }
}