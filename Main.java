
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        ArrayList<Etudiant> liste = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
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
               System.out.print("ID : ");
int id = sc.nextInt();
sc.nextLine();
System.out.print("Nom : ");
String nom = sc.nextLine();
System.out.print("Age : ");
int age = sc.nextInt();
Etudiant e = new Etudiant(id, nom, age);
liste.add(e);
System.out.println("Client ajouté !");
                    break;
                case 2:
                    System.out.println("Afficher (pas encore implémenté)");
                    break;
                case 3:
                    System.out.println("Rechercher (pas encore implémenté)");
                    break;
                case 4:
                    System.out.println("Supprimer (pas encore implémenté)");
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
