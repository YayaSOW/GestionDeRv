import java.util.Scanner;

import entities.DemandeRV;
import entities.Patient;
import enums.EtatDemande;
import enums.TypeSpecialite;
import services.ServiceDemande;
import services.ServicePatient;

public class App {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        int choix;
        ServicePatient svcPt = new ServicePatient();
        ServiceDemande svcDmd = new ServiceDemande();
        do {
            System.out.println("1-Ajouter un Patient dans le Tableau");
            System.out.println("2-Lister tous les patients du Tableau");
            System.out.println("3-Enregistrer un RV pour un patient");
            System.out.println("4-Lister tous les RV par Etat");
            System.out.println("5- Lister tous les RV par Spécialité");
            System.out.println("6-Traiter RV");
            System.out.println("7-Quitter");
            choix=sc.nextInt();
            switch (choix) {
                case 1->{
                    svcPt.addPatient(saisiPatient());
                }
                case 2->{
                    svcPt.listPatient();
                }
                case 3->{
                    addDmd(svcPt, svcDmd, sc);
                }
                case 4->{
                    svcDmd.listerRv(getEtatDmd());
                }
                case 5->{
                    svcDmd.listerSp(getEtatSpecialite());
                }
                default->{
                }
            }
        } while (choix!=7);
    }
    public static Patient saisiPatient() {
        String nomComplet;
        String tel;
        sc.nextLine();
        System.out.println("Entrer le nom complet du Patient");
        nomComplet = sc.nextLine();
        System.out.println("Entrer le telephone du Patient");
        tel = sc.nextLine();
        return new Patient(nomComplet, tel);
    }

    public static DemandeRV saisiRv() {
        String date;
        String motif;
        String heure;
        EtatDemande etat;
        TypeSpecialite specialite;
        sc.nextLine();
        System.out.println("Entrer la date du RV");
        date = sc.nextLine();
        System.out.println("Entrer le motif du RV");
        motif = sc.nextLine();
        System.out.println("Entrer le l'heure du RV");
        heure = sc.nextLine();
        etat= getEtatDmd();
        specialite= getEtatSpecialite();
        return new DemandeRV(date, motif, heure, etat, specialite);
    }

    public static void addDmd(ServicePatient svcPt,ServiceDemande svcDmd, Scanner sc) {
        Patient pt = svcPt.getPatient(svcPt.getTelPatient(sc));
        if (pt!=null) {
            DemandeRV dmd = saisiRv();
            dmd.setPt(pt);
            pt.addPatient(dmd);
            svcDmd.enregistrerDmd(dmd);
        }else{
            System.out.println("Client introuvable");
        }
    }

    public static EtatDemande getEtatDmd(){
        int n;
        do {
            System.out.println("Entrer l'etat du RV");
            System.out.println("1-Encours");
            System.out.println("2-Valider");
            System.out.println("3-Annuler;");
            n=sc.nextInt();
        } while (n!=1 && n!=2 && n!=3);
        return EtatDemande.values()[n-1];
    }
    public static TypeSpecialite getEtatSpecialite(){
        int n;
        do {
            System.out.println("Entrer la specialite");
            System.out.println("1-Cardiologie");
            System.out.println("2-Ophtalmologie");
            System.out.println("3-Urologie;");
            n=sc.nextInt();
        } while (n!=1 && n!=2 && n!=3);
        return TypeSpecialite.values()[n-1];
    }

}
