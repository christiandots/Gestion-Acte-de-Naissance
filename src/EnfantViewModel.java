


import java.util.Date;

/**
 *
 * @author CHRISTIAN
 */
public class EnfantViewModel {
    private int id_enfant;
    private int RefCopie;
    private int id_parents;
    private String jTextNomEnfant;
    private String jTextPrenomEnfant;
    private Date Date_naitreEnfant;
    private String sexe_enf;
    private Date heure_naitreEnfant;
    private String jTextCituatEnfant;
    private String jTextDistrict;
    
    public EnfantViewModel(int id_parent, int ref, int id_parents, String nom_enf, String prenom_enf, Date date_de_naissance_enf, String sexe_enf, Date heure_de_naissance, String cituation_naitreEnfant, String district){
      this.id_enfant=id_parent;
      this.RefCopie=ref;
      this.id_parents=id_parent;
      this.jTextNomEnfant=nom_enf;
      this.jTextPrenomEnfant=prenom_enf;
      this.Date_naitreEnfant=date_de_naissance_enf;
      this.sexe_enf=sexe_enf;
      this.heure_naitreEnfant=heure_de_naissance;
      this.jTextCituatEnfant=cituation_naitreEnfant;
      this.jTextDistrict=district;
    }
    public int getRef() {
    return id_enfant;
    }
    public int getRefCopie(){
        return RefCopie;
    }
    public int getId_parent(){
        return id_parents;
    }
    public String getJTextNomEnfant(){
        return jTextNomEnfant;
    }
    public String getJTextPrenomEnfant(){
        return jTextPrenomEnfant;
    }
    public Date getDate_naitreEnfant(){
        return Date_naitreEnfant;
    }
    public String getSexe_enf(){
        return sexe_enf;
    }
    public Date getHeure_naitreEnfant(){
        return heure_naitreEnfant;
    }
    public String getJTextCituatEnfant(){
       return jTextCituatEnfant;
    
    }
    public String getJTextDistrict(){
        return jTextDistrict;
    }
    
}
