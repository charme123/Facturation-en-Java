package crm;

import crm.Facture;

/**
 *
 * @author CHARME
 */
public class LigneFacture {
   Facture facture;
   int quantite;
   String produit,description,categorie;
   int prix,total,taxe;

    public LigneFacture(Facture facture, int quantite, String produit, String description, String categorie, int prix, int taxe) {
        this.facture = facture;
        this.quantite = quantite;
        this.produit = produit;
        this.description = description;
        this.categorie = categorie;
        this.prix = prix;
        this.taxe = taxe;
    }

    public Facture getFacture() {
        return facture;
    }

    public int getQuantite() {
        return quantite;
    }

    public String getProduit() {
        return produit;
    }

    public String getDescription() {
        return description;
    }

    public String getCategorie() {
        return categorie;
    }

    public int getPrix() {
        return prix;
    }

    

    public int getTaxe() {
        return taxe;
    }

    public void setFacture(Facture facture) {
        this.facture = facture;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public void setProduit(String produit) {
        this.produit = produit;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }
    public void setPrix(int prix) {
        this.prix = prix;
    }
    public void setTaxe(int taxe) {
        this.taxe = taxe;
    }
    public void setTotal(int total) {
        this.total=total;
    }
    public int getTotal() {
        return prix*quantite;
    }
}
