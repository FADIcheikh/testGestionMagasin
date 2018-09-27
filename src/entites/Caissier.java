/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entites;


public class Caissier extends Employe{

    private int numCaisse;

    
    public Caissier(int id, String nom, String adresse, int nbHeures, int numCaisse){
        super(id,nom, adresse,nbHeures);
        System.out.println("C'est un caissier");
        this.numCaisse=numCaisse;
        
    }

    public int getNumCaisse() {
        return numCaisse;
    }

    public void setNumCaisse(int numCaisse) {
        this.numCaisse = numCaisse;
    }
    
    public String toString(){
        return "Caissier{ "+super.toString()+" num caisse: "+numCaisse+'}';
    }

      
    public boolean equals(Object obj) {
      
       Caissier other = (Caissier) obj;
        if (this.numCaisse != other.numCaisse && super.equals(obj)) {
            return false;
        }
        return true;
    }

    @Override
    public float calculerSalaire() {
        
    float salaire=0;
        if(nbrHeure>180) {
           int heuresSupplementaires=nbrHeure-180;
           salaire=(5*180)+(heuresSupplementaires*5.75f);
           
        }else{
            salaire=nbrHeure*5;
        }
        
        return salaire;   
    }
    
    

    

   

}
