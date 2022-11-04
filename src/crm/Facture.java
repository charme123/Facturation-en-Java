package crm;

import java.util.Date;

/**
 *
 * @author CHARME
 */
public class Facture {
    String datefacture;
    String numerofacture,adresselivraison;
    int total,totalpaye,resteapayer,totaltaxe;

    public Facture(String datefacture, String numerofacture, String adresselivraison, int total, int totalpaye, int resteapayer, int totaltaxe) {
        this.datefacture = datefacture;
        this.numerofacture = numerofacture;
        this.adresselivraison = adresselivraison;
        this.total = total;
        this.totalpaye = totalpaye;
        this.resteapayer = resteapayer;
        this.totaltaxe = totaltaxe;
    }

    public String getDatefacture() {
        return datefacture;
    }

    public String getNumerofacture() {
        return numerofacture;
    }

    public String getAdresselivraison() {
        return adresselivraison;
    }

    public int getTotal() {
        return total;
    }

    public int getTotalpaye() {
        return totalpaye;
    }

    public int getResteapayer() {
        return resteapayer;
    }

    public int getTotaltaxe() {
        return totaltaxe;
    }

    public void setDatefacture(String datefacture) {
        this.datefacture = datefacture;
    }

    public void setNumerofacture(String numerofacture) {
        this.numerofacture = numerofacture;
    }

    public void setAdresselivraison(String adresselivraison) {
        this.adresselivraison = adresselivraison;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public void setTotalpaye(int totalpaye) {
        this.totalpaye = totalpaye;
    }

    public void setResteapayer(int resteapayer) {
        this.resteapayer = resteapayer;
    }

    public void setTotaltaxe(int totaltaxe) {
        this.totaltaxe = totaltaxe;
    }
    
}
