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
    private boolean visited;

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public RRS(String name) {
        this.name = name;
        this.fus = null;
        this.visited = false;
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
