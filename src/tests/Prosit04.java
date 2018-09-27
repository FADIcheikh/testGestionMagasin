/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests;

import entites.Caissier;
import entites.Magasin;
import entites.Vendeur;

/**
 *
 * @author Meriem Elabed
 */
public class Prosit04 {
    public static void main(String[] args) {
        Caissier caissier=new Caissier(1,"Anis", "Elghazela",32, 22);
        Vendeur vendeur=new Vendeur(1,"Marwa", "Elghazela",32, 22);
        
        Magasin magasin=new Magasin(1,"Carrefour","Cité elghazela");
        
        magasin.ajouterEmploye(caissier);
        magasin.ajouterEmploye(vendeur);
        System.out.println(magasin);
        
    }
    
}
