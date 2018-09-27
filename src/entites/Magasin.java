/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entites;

import exception.Mag_exp;

/**
 *
 * @author Meriem Elabed
 */
public class Magasin {
    private int id;
    private String nom;
    private String adresse;
    private final int CAPACITE=5;
    public Produit[] produits=new Produit[CAPACITE];
   
    private Employe[] employes=new Employe[6];
    int nbEmployes=0;
    
    public Magasin(){
        
    }
    public Magasin(int id, String nom,String adresse){
        
        this.id=id;
        this.nom=nom;
        this.adresse=adresse;
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public Produit[] getProduits() {
        return produits;
    }

    public void setProduits(Produit[] produits) {
        this.produits = produits;
    }
    
    
    public boolean ajouterProduit(Produit p)throws Mag_exp{
        if(!chercherProduit(p)){
        for(int i=0;i<produits.length;i++){
            if(produits[i]==null){
                produits[i]=p;
                return true;
            } 
            //indiquer que le magasin est plein 
            else 
            {
                throw new Mag_exp("le magasin est plein");
            }
        }}
        return false;
    }
    public String determinerTypeProduit(Produit p){
        if(p instanceof ProduitFruit)
            return "Fruit";
        else
            return "Legume";
        
    }
    public boolean ajouterEmploye(Employe e){
        if(nbEmployes<employes.length){
            employes[nbEmployes++]=e;
            return true;
        }
        return false;
    }
    public String toString(){
        String message="MAGASIN \n id: "+id+ "\n"+
                " adresse: "+adresse+"\n"+
                " capacite: "+CAPACITE+"\n"+
                "PRODUITS du magasin: \n";
        for(int i=0;i<produits.length;i++){
            message+=produits[i]+"\n";
        }
        message+="EMPLOYES du magasin \n";
        for(int i=0;i<nbEmployes;i++){
            message+=employes[i]+"\n";
        }
        return message;
    }
   
    public boolean chercherProduit(Produit p){
        for (int i = 0; i < produits.length; i++) {
            if (produits[i]!=null && produits[i].equals(p)) {
                return true;
            }
        }
        return false;
    }
    public boolean supprimerProduit(Produit p) {
        for (int i = 0; i < produits.length; i++) {
            if (produits[i].equals(p)) {
                    produits[i] = null;
                    return true;
                }
        }   
        return false;
    }
    
    public int getNbProduits(){
        int nbProduits=0;
        for (int i = 0; i < produits.length; i++) {
            if (produits[i]!=null) {
                    nbProduits++;
                }
        }
        return nbProduits;
    }
    public static Magasin comparerMagasin(Magasin m1, Magasin m2) {
        if(m1.getNbProduits()>m2.getNbProduits())
            return m1;
        return m2;
    }
    
    public float calculStockFruits() {
        int nbProduitsFruits=0;
        for(int i=0; i<produits.length;i++){
            if(produits[i] instanceof ProduitFruit)
                nbProduitsFruits++;
        }
        return nbProduitsFruits;
        
    }
}
