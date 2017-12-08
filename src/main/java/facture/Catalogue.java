package facture;

import java.util.HashMap;

public class Catalogue {

    HashMap<String, Article> catalogue = new HashMap<>();
    //String cod = "999";

    public void addArticle(Article article) {
        catalogue.put(article.getCode(), article);
    }

    public Article findByCode(String code) {
        System.out.println("Parcours du catalogue");
        catalogue.keySet().stream().filter((_item) -> (catalogue.containsKey(code))); 
        //System.out.println(key +" -> "+ catalogue.get(key));
        return catalogue.get(code);
    }
    /*
        public Article findByCode(String code) {
        System.out.println("Parcours du catalogue");
        for (String key : catalogue.keySet()) {
            if (catalogue.containsKey(code)) {
                //System.out.println(key +" -> "+ catalogue.get(key));
            }

        }
        return catalogue.get(code);
    }*/

}


