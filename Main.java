import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
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
                    System.out.println("Ajouter (pas encore implémenté)");
                    break;
                case 2:
                    import java.util.ArrayList;
// dans main()
ArrayList<Etudiant> liste = new ArrayList<>();
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
}
