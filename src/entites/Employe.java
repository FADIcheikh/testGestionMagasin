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
public abstract class Employe {
    protected int id;
    protected String nom; 
    protected String adresse;
    protected int nbrHeure;

    public Employe() {
    }

    
    
    public Employe(int id, String nom, String adresse,int nbrHeure) {
        System.out.println("C'est un employe");
        this.id = id;
        this.nom = nom;
        this.adresse=adresse;
        this.nbrHeure = nbrHeure;
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public int getNbrHeure() {
        return nbrHeure;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setNbrHeure(int nbrHeure) {
        this.nbrHeure = nbrHeure;
    }

    
    public String toString() {
        return "id=" + id + ", nom=" + nom + ", nbrHeure=" + nbrHeure ;
    }

   
    public boolean equals(Object obj) {
       Employe e = (Employe) obj;
        if (this.id != e.id) {
            return false;
        }
        return true;
    }
    
    public abstract float calculerSalaire();
    
}
