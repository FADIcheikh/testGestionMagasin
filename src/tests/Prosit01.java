/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests;

import java.time.LocalDate;
import entites.Magasin;
import entites.Produit;
import exception.Prix_exp;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Meriem Elabed
 */
public class Prosit01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Produit p1=new Produit();
        p1.setId(1021);
        p1.setLibelle("Lait");
        p1.setDateExpiration(LocalDate.of(2016, 1, 30));
        System.out.println(p1.toString());
        
        Produit p2=new Produit(2510,"Yaout","Delice");
        System.out.println(p2);
        
        Produit p3 = null;
        try {
            p3 = new Produit(3250,"Tomate","Sicam",1.200f);
        } catch (Prix_exp ex) {
            Logger.getLogger(Prosit01.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(p3);

        
       
    }
    
}
