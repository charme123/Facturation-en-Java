
package crm;

/**
 *
 * @author CHARME
 */
public class Produit {
    String libelle,prix,categorie,description;

    public Produit(String libelle, String prix, String categorie, String description) {
        this.libelle = libelle;
        this.prix = prix;
        this.categorie = categorie;
        this.description = description;
    }

    public String getLibelle() {
        return libelle;
    }

    public String getPrix() {
        return prix;
    }

    public String getCategorie() {
        return categorie;
    }

    public String getDescription() {
        return description;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public void setPrix(String prix) {
        this.prix = prix;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
}
