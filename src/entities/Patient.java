package entities;

import java.util.Arrays;

public class Patient {
    private int id;
    private String nomComplet;
    private String tel;
    private String numero;
    private static int nbPt;

    private static final int taille=5;
    private DemandeRV tabDmd[]=new DemandeRV[taille];
    private int n;

    private static int patientCounter ;

    public static String generatePatientID() {
        patientCounter++;
        String patientID = "PAT" + String.format("%04d", patientCounter);
        return patientID;
    }
    
    public Patient(String nomComplet, String tel) {
        this.id=++nbPt;
        this.nomComplet = nomComplet;
        this.tel = tel;
        this.numero = generatePatientID();
    }
    public Patient() {
        id=++nbPt;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNomComplet() {
        return nomComplet;
    }
    public void setNomComplet(String nomComplet) {
        this.nomComplet = nomComplet;
    }
    public String getTel() {
        return tel;
    }
    public void setTel(String tel) {
        this.tel = tel;
    }
    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
    public static int getTaille() {
        return taille;
    }
    public DemandeRV[] getTabDmd() {
        return tabDmd;
    }

    public void addPatient(DemandeRV dmd) {
        if(n<taille){
            tabDmd[n++]=dmd;
        }
    }
    @Override
    public String toString() {
        return "Patient [id=" + id + ", nomComplet=" + nomComplet + ", tel=" + tel + ", numero=" + numero + "]";
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        result = prime * result + ((nomComplet == null) ? 0 : nomComplet.hashCode());
        result = prime * result + ((tel == null) ? 0 : tel.hashCode());
        result = prime * result + ((numero == null) ? 0 : numero.hashCode());
        result = prime * result + Arrays.hashCode(tabDmd);
        result = prime * result + n;
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Patient other = (Patient) obj;
        if (id != other.id)
            return false;
        if (nomComplet == null) {
            if (other.nomComplet != null)
                return false;
        } else if (!nomComplet.equals(other.nomComplet))
            return false;
        if (tel == null) {
            if (other.tel != null)
                return false;
        } else if (!tel.equals(other.tel))
            return false;
        if (numero == null) {
            if (other.numero != null)
                return false;
        } else if (!numero.equals(other.numero))
            return false;
        if (!Arrays.equals(tabDmd, other.tabDmd))
            return false;
        if (n != other.n)
            return false;
        return true;
    }
    
}
