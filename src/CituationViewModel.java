


import java.util.Date;

/**
 *
 * @author CHRISTIAN
 */
public class CituationViewModel {
    private int RefCopie;
    private Date jTextDate_Create;
    private Date HeurCreatCopie;
    private String jTextCituatCreat;
    private String jTextLieuCreat;
    private String jTextRespo;
    public CituationViewModel(int ref, Date date_create, Date heur_create, String lieu_create, String responsable){
        this.RefCopie=ref;
        this.jTextDate_Create=date_create;
        this.jTextDate_Create=heur_create;
        this.jTextLieuCreat=lieu_create;
        this.jTextRespo=responsable;  
    }
    public int getRefCopie(){
        return RefCopie;
    }
    public Date getJTextDate_Create(){
        return jTextDate_Create; 
    }
    public Date hetHeurCreatCopie(){
        return HeurCreatCopie;
    }
    public String getJTextCituatCreat(){
        return jTextCituatCreat;
    }
    public String getJTextLieuCreat(){
        return jTextLieuCreat;
    }
    public String getJTextRespo(){
        return jTextRespo;
    }
    
}
