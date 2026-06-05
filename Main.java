import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choix;
        do {
            ArrayList<Etudiant> liste = new ArrayList<>();
            System.out.println("\n===== MENU =====");
            System.out.println("1. Ajouter");
            System.out.println("2. Afficher");
            System.out.println("3. Rechercher");
            System.out.println("4. Supprimer");
            System.out.println("0. Quitter");
            System.out.print("Choix : ");
            choix = sc.nextInt();
            switch (choix) {
                case 1:
                    System.out.println("Ajouter (pas encore implémenté)");
                    break;
                case 2:
                    System.out.println("Afficher (pas encore implémenté)");
                    break;
                case 3:
                        System.out.print("Entrer ID à rechercher : ");
                    int idRecherche = sc.nextInt();
                    boolean trouve = false;
                    for (Etudiant et : liste) {
                        if (et.id == idRecherche) {
                            System.out.println("Étudiant trouvé :");
                            et.afficher();
                            trouve = true;
                            break;
                        }
                    }
                    if (!trouve) {
                        System.out.println("Étudiant non trouvé.");
                    }
                    break;

                    // Supprimer un étudiant par I

                case 4:
                      System.out.println("Rechercher (pas encore implémenté)");
                    break;

            }
        } while (choix != 0);
        sc.close();
    }

static class Etudiant {
    int id;
    String nom;
    int age;
    public Etudiant(int id, String nom, int age) {
        this.id = id;
        this.nom = nom;
        this.age = age;
    }
    public void afficher() {
        System.out.println("ID: " + id + ", Nom: " + nom + ", Age: " + age);
    }
}

}
