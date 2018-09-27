/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entites;


public class Vendeur extends Employe{
    private float tauxVente;

    public Vendeur() {
       super();
    }
    
    public Vendeur(int id, String nom, String adresse,int nbrHeure, float tauxVente) {
        super(id, nom, adresse,nbrHeure);
        System.out.println("C'est un vendeur");
        this.tauxVente = tauxVente;
    }

    public float getTauxVente() {
        return tauxVente;
    }

    public void setTauxVente(float tauxVente) {
        this.tauxVente = tauxVente;
    }

    @Override
    public String toString() {
        return "Vendeur{"+super.toString()+ "tauxVente=" + tauxVente + '}';
    }

   
    public float calculerSalaire() {
      float salaire=450*tauxVente;
      return salaire; 
    }
    
   
    
}
