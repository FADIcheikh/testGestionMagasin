/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests;

import entites.Magasin;
import entites.Produit;
import entites.ProduitFruit;
import entites.ProduitLegume;
import exception.Mag_exp;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Meriem Elabed
 */
public class Prosit05 {
    public static void main(String[] args) {
        Produit pf1=new ProduitFruit(1245,"Fraise",12, "Mars");
        //pf1.getSaison();//appel interdit car pf1 est de type Produit
        
        ProduitFruit pf2=new ProduitFruit(1245,"Pastèque",50, "Juin");
        pf2.getSaison();//appel interdit car pf2 est de type ProduitFruit
           
        Produit pl1=new ProduitLegume(8251, "Artichaut", 14, "Janvier");
        
        Magasin magasin=new Magasin(1,"Carrefour","Cité elghazela");
        try {
            magasin.ajouterProduit(pf1);
        } catch (Mag_exp ex) {
            Logger.getLogger(Prosit05.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            magasin.ajouterProduit(pf2);
        } catch (Mag_exp ex) {
            Logger.getLogger(Prosit05.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            magasin.ajouterProduit(pl1);
        } catch (Mag_exp ex) {
            Logger.getLogger(Prosit05.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println("Nombre des produits fruits : "+magasin.calculStockFruits());
    }
    
}
