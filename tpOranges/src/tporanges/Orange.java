/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tporanges;

/**
 *
 * @author dl112695
 */
public class Orange {
    private int prix;
    private String origin;

    /**
     *
     * @param prix
     * @param origin
     * @throws java.lang.Exception
     */
    public Orange(int prix, String origin) throws Exception {
        if (prix < 0) throw new Exception("The price is negative");
        this.prix = prix;
        this.origin = origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getOrigin() {
        return origin;
    }

    public int getPrix() {
        return prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }
    
}
