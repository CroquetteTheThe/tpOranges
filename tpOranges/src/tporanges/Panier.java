/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tporanges;

import java.util.ArrayList;
import java.util.List;
import java.lang.Exception;
import java.util.Iterator;

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
    
    
    @Override
    public String toString() {
        return "size_max = " + this.size_max + ": " + this.panier.toString(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean equals (Object obj){
        if (obj!= null && (obj.getClass().equals(this.getClass()))){
            if (obj instanceof Panier){
                Panier pers = (Panier)obj;
                return (this.panier.equals(pers.panier) &&
                    this.size_max == pers.size_max);
            }
        }
        return false;
    }
    
    
    
    public void addOrange(Orange o) throws Exception {
        if (panier.size() == size_max) throw new Exception("Panier is full");
        panier.add(o);
    }
    
    public void removeLast() {
        this.panier.remove(this.panier.size()-1);
    }
    
    public boolean isEmpty() {
        return this.panier.isEmpty();
    }
    
    public boolean isFull() {
        return this.panier.size() == this.size_max;
    }
    
    public int getPrice() {
        int result = 0;
        for (Orange o : this.panier) {
            result += o.getPrix();
        }
        return result;
    }
    
    public void boycottOrigin(String origin) {
        Iterator<Orange> it = this.panier.iterator();
        while (it.hasNext()) {
            Orange o = it.next();
            if (o.getOrigin().equals(origin)) {
                it.remove();
            }
        }
    }
    
    
}
