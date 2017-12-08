/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facture;

/**
 *
 * @author trevol
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Article a1 = new Article("774","IPad", 700.0f);
        Article a2 = new Article ("775", "Disque 2To", 100.0f);
        Article a3 = new Article("776","Jouet", 24.99f);
        Article a4 = new Article ("777", "Baignenoire", 269.99f);
        Catalogue castorama = new Catalogue();
        castorama.addArticle(a1);
        castorama.addArticle(a2);
        castorama.addArticle(a3);
        castorama.addArticle(a4);
        System.out.println(castorama.findByCode("777"));
    }
    
}
