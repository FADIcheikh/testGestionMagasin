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
public class Prosit03 {
    public static void main(String[] args) throws Mag_exp {
         Produit p1=new Produit();
        p1.setId(1021);
        p1.setLibelle("Lait");
        p1.setDateExpiration(LocalDate.of(2016, 1, 30));
        
        
        Produit p2=new Produit(2510,"Yaout","Delice");
       
        Produit p3 = null;
        try {
            p3 = new Produit(3250,"Tomate","Sicam",1.200f);
        } catch (Prix_exp ex) {
            Logger.getLogger(Prosit03.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        Produit p4 = null;
        try {
            p4 = new Produit(7100,"Spaghetti","Randa",0.900f);
        } catch (Prix_exp ex) {
            Logger.getLogger(Prosit03.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        Produit p5 = null;
        try {
            p5 = new Produit(3250,"Crayon","Maped",1.200f);
        } catch (Prix_exp ex) {
            Logger.getLogger(Prosit03.class.getName()).log(Level.SEVERE, null, ex);
        }
        
         System.out.println("p1 equals p2: "+p1.equals(p2));
         System.out.println(Produit.comparer2(p1, p2));

        
        Magasin magasin1=new Magasin(1,"Carrefour","Cité elghazela");
        try {
            magasin1.ajouterProduit(p1);
        } catch (Mag_exp ex) {
            Logger.getLogger(Prosit03.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            magasin1.ajouterProduit(p1);
        } catch (Mag_exp ex) {
            Logger.getLogger(Prosit03.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            magasin1.ajouterProduit(p3);
        } catch (Mag_exp ex) {
            Logger.getLogger(Prosit03.class.getName()).log(Level.SEVERE, null, ex);
        }
                
        Magasin magasin2=new Magasin(2,"Monoprix","Marsa");
        magasin2.ajouterProduit(p4);
        magasin2.ajouterProduit(p5);
        System.out.println(magasin2);
        
        System.out.println("Après suppression de p5 du magasin2 \n");
        magasin2.supprimerProduit(p5);
        System.out.println(magasin2);
        
        System.out.println("Magasin ayant le plus de produit: "+Magasin.comparerMagasin(magasin1, magasin2));
        
       
        
    }
    
}
