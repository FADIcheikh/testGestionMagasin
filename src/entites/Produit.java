/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entites;

import exception.Prix_exp;
import java.time.LocalDate;

/**
 *
 * @author Meriem Elabed
 */
public class Produit {
    private int id;
    private String libelle;
    private String marque;
    private float prix;
    private int quantite;
    private LocalDate dateExpiration;
    private Magasin magasin;
    public static int nbProduits;
    
    //constructeur par défaut
   public Produit(){
        nbProduits++;
    }
   //constructeur surchargé
    public Produit(int id, String libelle){
        this.id=id;
        this.libelle=libelle;
        nbProduits++;
    }
    //constructeur surchargé
    public Produit(int id, String libelle, String marque){
        this.id=id;
        this.libelle=libelle;
        this.marque=marque;
        nbProduits++;
    }
    
    //constructeur surchargé
     public Produit(int id1, String libelle1, String marque1, float prix)throws Prix_exp{
        this(id1,libelle1, marque1);
        this.prix=prix;
        //appeler prix_exp qui indique le que le prix est negatif 
         if (prix<0)  {
                throw new Prix_exp("le prix est negatif "); 
             }
    }

    public Produit(int id, String libelle, int quantite) {
        this.id = id;
        this.libelle = libelle;
        this.quantite = quantite;
    }

     
    public Produit(int id, String libelle, String marque, int quantite, LocalDate dateExpiration, Magasin magasin) {
        this.id = id;
        this.libelle = libelle;
        this.marque = marque;
        this.quantite = quantite;
        this.dateExpiration = dateExpiration;
        this.magasin = magasin;
    }
     
    
    
     
   
     public int getId(){
         return id;
     }
     public void setId(int id){
         this.id=id;
     }
     
     public float getPrix(){
         return prix;
     }
     public void setPrix(float prix){
         if(prix>0)
            this.prix=prix;
         else
             System.out.println("Prix negatif");
     }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public LocalDate getDateExpiration() {
        return dateExpiration;
    }

    public void setDateExpiration(LocalDate dateExpiration) {
        this.dateExpiration = dateExpiration;
    }

    public Magasin getMagasin() {
        return magasin;
    }

    public void setMagasin(Magasin magasin) {
        this.magasin = magasin;
    }

      
    
    public String toString(){
        return "Produit: id="+this.id+
                " libelle="+libelle+ 
                " marque="+marque+
                " prix="+prix+
                " date expiration="+dateExpiration;
    }
    
    public boolean equals(Object o){
        Produit p1=(Produit)o;
        if(this.id==p1.id &&
                this.prix==p1.prix &&
                    this.libelle.equals(p1.libelle))
            return true;
        return false;
    }
    
   
     public static boolean comparer2(Produit p1, Produit p2){
        
        if(p1.getId()==p2.getId() &&
                p1.getPrix()==p2.getPrix() &&
                    p1.getLibelle().equals(p2.getLibelle()))
            return true;
        return false;
    }
     
     public String determinerTypeProduit(){
        return this.getClass().toString();
    }
  
}
