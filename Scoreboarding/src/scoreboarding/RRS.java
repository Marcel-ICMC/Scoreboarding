/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scoreboarding;

/**
 *
 * @author ICMC
 */
public class RRS {
    
    private FunctionalUnit fus;
    private String name;

    public RRS(String name) {
        this.name = name;
        this.fus = null;
    }

    public FunctionalUnit getFus() {
        return fus;
    }

    public void setFus(FunctionalUnit fus) {
        this.fus = fus;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
    
}
