


import java.util.Date;

/**
 *
 * @author CHRISTIAN
 */
public class ParentViewModel {
    private int id_parents;
    private String jTextNompere;
    private String jTextPrenompere;
    private Date dateNaitrepere;
    private String jTextLieuNaitrepere;
    private String jTextProffepere;
    private String jTextNommere;
    private String jTextPrenommere;
    private Date dateNaitremere;
    private String jTextLieuNaitremere;
    private String jTextProffemere;
    private String jTextResidence;
    
    public ParentViewModel(int id_parents, String nom_pere, String prenom_pere, Date date_de_naissance_pere, String lieu_naisse_pere, String profession_pere,String nom_mere, String prenom_mere, Date date_de_naissance_mere, String lieu_naisse_mere, String profession_mere, String residence){
        this.id_parents=id_parents;
        this.jTextPrenompere=prenom_pere;
        this.dateNaitrepere=date_de_naissance_pere;
        this.jTextLieuNaitrepere=lieu_naisse_pere;
        this.jTextProffepere=profession_pere;
        this.jTextPrenommere=prenom_mere;
        this.dateNaitremere=date_de_naissance_mere;
        this.jTextLieuNaitremere=lieu_naisse_mere;
        this.jTextProffemere=profession_mere;
        this.jTextResidence=residence;
    }
    public int getId_parents(){
        return id_parents;
    }
    public String getJTextNompere(){
        return jTextNompere;
    }
    public String getJTextPrenompere(){
        return jTextPrenompere;
    }
    public Date getDateNaitrepere(){
        return dateNaitrepere;
    }
    public String getJTextLieuNaitrepere(){
        return jTextLieuNaitrepere;
    }
    public String getJTextProffepere(){
        return jTextProffepere;
    }
    public String getJTextNommere(){
        return jTextNommere;
    }
    public String getJTextPrenommere(){
        return jTextPrenommere;
    }
    public Date getDateNaitremere(){
        return dateNaitremere;
    }
    public String getJTextLieuNaitremere(){
        return jTextLieuNaitremere;
    }
    public String getJTextProffemere(){
        return jTextProffemere;
    }
    public String getJTextResidence(){
        return jTextResidence;
    }
    
}
