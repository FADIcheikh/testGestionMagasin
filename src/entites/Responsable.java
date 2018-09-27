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
public class Responsable extends Employe{

    private float prime;
    
    public Responsable() {
    }

    public Responsable(float prime, int id, String nom, String adresse, int nbrHeure) {
        super(id, nom, adresse, nbrHeure);
        this.prime = prime;
    }
    

    @Override
    public float calculerSalaire() {
        float salaire=0;
        if(nbrHeure>160){
            int heuresSupplementaires=nbrHeure-160;
            salaire=(160*10)+(heuresSupplementaires*12)+prime;
        }else{
            salaire=(nbrHeure*10)+prime;
        }
        return salaire;
    }
   

   
    
}
