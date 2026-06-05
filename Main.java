import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        ArrayList<Etudiant> Liste = new ArrayList<>();
        
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
                    System.out.println("Afficher (pas encore implémenté)");
                    break;
                    
                case 3:
                    System.out.println("Rechercher (pas encore implémenté)");
                    break;
                    
                case 4:
                    System.out.print("ID à supprimer : ");
                    int idSup = sc.nextInt();
                    boolean supprime = false;

                    for (Etudiant et : Liste) {
                        if (et.id == idSup) {
                            Liste.remove(et);
                            supprime = true;
                            System.out.println("Supprimé !");
                            break;
                        }
                    }

                    if (!supprime) {
                        System.out.println("Non trouvé");
                    }
                    break;
                    
                case 0:
                    System.out.println("Fin du programme.");
                    break;
                    
                default:
                    System.out.println("Choix invalide, réessayez.");
            }
        } while (choix != 0);
        
        sc.close();
    }
} 
class Etudiant {
    int id;
    String nom;

    public Etudiant(int id, String nom) {
        this.id = id;
        this.nom = nom;
    }
}

