import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Etudiant> liste = new ArrayList<>();
        int choix;
        do {
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
                    System.out.println("Ajouter (pas encore implemente)");
                    break;
                case 2:
                    System.out.println("Afficher (pas encore implemente)");
                    break;
                case 3:
                    System.out.println("Rechercher (pas encore implemente)");
                    break;
                case 4:
                    System.out.println("Supprimer (pas encore implemente)");
                    break;
                case 5:
                    System.out.print("ID a modifier : ");
                    int idModif = sc.nextInt();
                    sc.nextLine();
                    boolean modifie = false;
                    for (Etudiant et : liste) {
                        if (et.id == idModif) {
                            System.out.print("Nouveau nom : ");
                            String nouveauNom = sc.nextLine();
                            System.out.print("Nouvel age : ");
                            int nouvelAge = sc.nextInt();
                            et.nom = nouveauNom;
                            et.age = nouvelAge;
                            System.out.println("Etudiant modifie !");
                            modifie = true;
                            break;
                        }
                    }
                    if (!modifie) {
                        System.out.println("Etudiant non trouve !");
                    }
                    break;
            }
        } while (choix != 0);
        sc.close();
    }
}

class Etudiant {
    int id;
    String nom;
    int age;

    public Etudiant(int id, String nom, int age) {
        this.id = id;
        this.nom = nom;
        this.age = age;
    }
}
