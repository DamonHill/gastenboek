/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.vdab.gastenboek;
import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author arne.simons
 */
public class GastenboekEntry implements Serializable {
    public static final long serialVersionUID = 1L;
    private Date datum = new Date();
    private String schrijver;
    private String boodschap;

    public GastenboekEntry(String schrijver, String boodschap) {
        this.schrijver = schrijver;
        this.boodschap = boodschap;
    }

    public Date getDatum() {
        return datum;
    }

    public void setDatum(Date datum) {
        this.datum = datum;
    }

    public String getSchrijver() {
        return schrijver;
    }

    public void setSchrijver(String schrijver) {
        this.schrijver = schrijver;
    }

    public String getBoodschap() {
        return boodschap;
    }

    public void setBoodschap(String boodschap) {
        this.boodschap = boodschap;
    }
       
}
