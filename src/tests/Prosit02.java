/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests;

import entites.Magasin;
import entites.Produit;
import exception.Mag_exp;
import exception.Prix_exp;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Meriem Elabed
 */
public class Prosit02 {
    public static void main(String[] args) {
        Produit p1=new Produit();
        p1.setId(1021);
        p1.setLibelle("Lait");
        p1.setDateExpiration(LocalDate.of(2016, 1, 30));
     
        
        Produit p2=new Produit(2510,"Yaout","Delice");
        
        
        Produit p3 = null;
        try {
            p3 = new Produit(3250,"Tomate","Sicam",1.200f);
        } catch (Prix_exp ex) {
            Logger.getLogger(Prosit02.class.getName()).log(Level.SEVERE, null, ex);
        }

        
        Magasin magasin=new Magasin(1,"Carrefour","Cité elghazela");
        try {
            magasin.ajouterProduit(p1);
        } catch (Mag_exp ex) {
            Logger.getLogger(Prosit02.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            magasin.ajouterProduit(p1);
        } catch (Mag_exp ex) {
            Logger.getLogger(Prosit02.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            magasin.ajouterProduit(p3);
        } catch (Mag_exp ex) {
            Logger.getLogger(Prosit02.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(magasin);
        
        System.out.println("Nombre des produits total: "+Produit.nbProduits);
        
       
    }
    
}
