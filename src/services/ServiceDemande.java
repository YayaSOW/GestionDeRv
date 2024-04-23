package services;

import java.util.Scanner;

import entities.DemandeRV;
import enums.EtatDemande;
import enums.TypeSpecialite;

public class ServiceDemande {
    private static final int nbreDmd = 5;
    private DemandeRV tabDmd[] = new DemandeRV[nbreDmd];
    private int n;
    public void enregistrerDmd(DemandeRV dmd) {
        if (n < nbreDmd) {
            tabDmd[n++] = dmd;
        }
    }

    public void listerRv(EtatDemande etat){
        for (int i = 0; i < n; i++) {
            if (tabDmd[i].getEtat()==etat) {
                System.out.println(tabDmd[i]);
            }
        }
    }

    public void listerSp(TypeSpecialite etat){
        for (int i = 0; i < n; i++) {
            if (tabDmd[i].getSpecialite()==etat) {
                System.out.println(tabDmd[i]);
            }
        }
    }

}
