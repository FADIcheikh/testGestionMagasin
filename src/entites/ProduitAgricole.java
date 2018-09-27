/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entites;

/**
 *
 * @author Meriem Elabed
 */
public class ProduitAgricole extends Produit{
    protected String saison;

    public ProduitAgricole() {
    }

    public ProduitAgricole(int id, String libelle, int quantite,String saison ) {
        super(id, libelle, quantite);
        this.saison = saison;
    }

    

    public String getSaison() {
        return saison;
    }

    public void setSaison(String saison) {
        this.saison = saison;
    }
    
  
    
    
}
