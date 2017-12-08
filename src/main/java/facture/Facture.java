package facture;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Date;

public class Facture {
    
    protected int numero;
    protected Date emission;
    protected Client destinataire;
    ArrayList <LigneFacture> lfacture = new ArrayList<>();

    
    public Facture(Client destinataire, Date emission, int numero) {
        this.numero = numero;
        this.emission = emission;
        this.destinataire = destinataire;

    }

    /**
     * Get the value of numero
     *
     * @return the value of numero
     */
    public int getNumero() {
        return numero;
    }

    /**
     * Get the value of emission
     *
     * @return the value of emission
     */
    public Date getEmission() {
        return emission;
    }

    /**
     * Get the value of destinataire
     *
     * @return the value of destinataire
     */
    public Client getDestinataire() {
        return destinataire;
    }

    
    public void ajouteLigne(Article a, int nombre, float remise) {
        LigneFacture newLigne = new LigneFacture(nombre, this, a, remise);
        lfacture.add(newLigne);
   }
    
   public float montantTTC(float tauxTVA) {
        float ttc = 0;
        for (LigneFacture l : lfacture){
            ttc += l.montantLigne() * (1 + tauxTVA);
        }
        return ttc;
   }
   
   public void print(PrintStream out, float tva) {
       for (int i = 0; i < this.lfacture.size(); i++) {
           out.println(lfacture.toString() + tva);
       }
        
   }
   
}
