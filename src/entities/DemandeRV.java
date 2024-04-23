package entities;

import enums.EtatDemande;
import enums.TypeSpecialite;

public class DemandeRV {
    private int id;
    private String date;
    private String motif;
    private String heure;
    private EtatDemande etat;
    private TypeSpecialite specialite;
    private static int nbDmd;

    private Patient pt;

    public DemandeRV(String date, String motif, String heure, EtatDemande etat, TypeSpecialite specialite) {
        this.id=++nbDmd;
        this.date = date;
        this.motif = motif;
        this.heure = heure;
        this.etat = etat;
        this.specialite = specialite;
    }

    public DemandeRV() {
        id=++nbDmd;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getMotif() {
        return motif;
    }

    public void setMotif(String motif) {
        this.motif = motif;
    }

    public String getHeure() {
        return heure;
    }

    public void setHeure(String heure) {
        this.heure = heure;
    }

    public EtatDemande getEtat() {
        return etat;
    }

    public void setEtat(EtatDemande etat) {
        this.etat = etat;
    }

    public TypeSpecialite getSpecialite() {
        return specialite;
    }

    public void setSpecialite(TypeSpecialite specialite) {
        this.specialite = specialite;
    }

    public Patient getPt() {
        return pt;
    }

    public void setPt(Patient pt) {
        this.pt = pt;
    }
    @Override
    public String toString() {
        return "DemandeRV [id=" + id + ", date=" + date + ", motif=" + motif + ", heure=" + heure + ", etat=" + etat
                + ", specialite=" + specialite + ", pt=" + pt.getNomComplet() + "]";
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        result = prime * result + ((date == null) ? 0 : date.hashCode());
        result = prime * result + ((motif == null) ? 0 : motif.hashCode());
        result = prime * result + ((heure == null) ? 0 : heure.hashCode());
        result = prime * result + ((etat == null) ? 0 : etat.hashCode());
        result = prime * result + ((specialite == null) ? 0 : specialite.hashCode());
        result = prime * result + ((pt == null) ? 0 : pt.hashCode());
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
        DemandeRV other = (DemandeRV) obj;
        if (id != other.id)
            return false;
        if (date == null) {
            if (other.date != null)
                return false;
        } else if (!date.equals(other.date))
            return false;
        if (motif == null) {
            if (other.motif != null)
                return false;
        } else if (!motif.equals(other.motif))
            return false;
        if (heure == null) {
            if (other.heure != null)
                return false;
        } else if (!heure.equals(other.heure))
            return false;
        if (etat != other.etat)
            return false;
        if (specialite != other.specialite)
            return false;
        if (pt == null) {
            if (other.pt != null)
                return false;
        } else if (!pt.equals(other.pt))
            return false;
        return true;
    }
    public int getTelephone() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getTelephone'");
    }
    
}
