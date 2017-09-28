/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tporanges;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dl112695
 */
public class Model implements Observable {
    private List<Observer> listObserver = new ArrayList<>();  
    
    
    @Override
    public void addObserver(Observer obs) {
        listObserver.add(obs);
    }

    @Override
  public void removeObserver() {
    listObserver = new ArrayList<Observer>();
  }  

    @Override
    public void notifyObserver(String str) {
        if(str.matches("^0[0-9]+")) {
            str = str.substring(1, str.length());
        }

        for(Observer obs : listObserver) {
            obs.update(str);
        }
    }
    
}
