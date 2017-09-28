/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tporanges;

import java.util.ArrayList;
import java.util.List;
import java.lang.Exception;

/**
 *
 * @author dl112695
 */
public class Panier {
    private List<Orange> panier;
    private int size_max;

    public Panier(int size) {
        this.size_max = size;
        this.panier = new ArrayList<>(size);
    }

    public Panier() {
        this(0);
    }
    
    
    
    public void addOrange(Orange o) throws Exception {
        if (panier.size() == size_max) throw new Exception("Panier is full");
        panier.add(o);
    }
    
    public boolean isEmpty() {
        return this.panier.isEmpty();
    }
    
    public boolean isFull() {
        return this.panier.size() == this.size_max;
    }

}
