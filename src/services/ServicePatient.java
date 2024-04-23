package services;

import java.util.Scanner;

import entities.DemandeRV;
import entities.Patient;

public class ServicePatient {
    private static final int nbrePt = 5;
    private Patient tabPatient[] = new Patient[nbrePt];
    private int n;
    // private ServiceCommande cmd=new ServiceCommande();

    public void addPatient(Patient pt) {
        if (n<nbrePt) {
            tabPatient[n++] = pt;
        }
    }

    public void listPatient() {
        for (int i = 0; i < n; i++) {
            System.out.println(tabPatient[i]);
        }
    }

    public Patient getPatient(String num) {
        for (int i = 0; i < n; i++) {
            if (tabPatient[i].getTel().compareTo(num) == 0) {
                return tabPatient[i];
            }
        }
        return null;
    }

    public String getTelPatient(Scanner sc) {
        String tel;
        sc.nextLine();
        System.out.println("Entrer le telephone du client");
        tel = sc.nextLine();
        return tel;
    }
}
