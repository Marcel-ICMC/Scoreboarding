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
public class FunctionalUnit {
    private boolean dp;
    private String name;
    private boolean busy;
    private String operand;
    private int Fi;
    private int Fk;
    private String Qj;
    private String Qk;
    private boolean Rj;
    private boolean Rk;
    private int Fj;
    private boolean fatigue;
    //private String type;
    private Instruction instruction;
    
    
    public FunctionalUnit(String name) {
        this.name = name;
        /*        if("Load/Store1".equals(name) || "Load/Store2".equals(name)){
        type = "Load/Store";
        } else{
        type = "Arithmetic";
        }*/
        this.busy = false;
        this.Qj = null;
        this.Qk = null;
        this.Rj = false;
        this.Rk = false;
        this.instruction = null;
        this.Fj = -1;
        this.Fk = -1;
        this.Fi = -1;
        this.dp = false;
        this.fatigue = false;
    }

    public boolean isFatigue() {
        return fatigue;
    }

    public void setFatigue(boolean fatigue) {
        this.fatigue = fatigue;
    }

    public boolean isDp() {
        return dp;
    }

    public void setDp(boolean dp) {
        this.dp = dp;
    }

    
    
    public Instruction getInstruction() {
        return instruction;
    }

    public void setInstruction(Instruction instruction) {
        this.instruction = instruction;
    }

    public String getName() {
        return name;
    }

    public boolean isBusy() {
        return busy;
    }

    public String getOperand() {
        return operand;
    }

    public int getFi() {
        return Fi;
    }

    public int getFj() {
        return Fj;
    }

    public int getFk() {
        return Fk;
    }

    public String getQj() {
        return Qj;
    }

    public String getQk() {
        return Qk;
    }

    public boolean isRj() {
        return Rj;
    }

    public boolean isRk() {
        return Rk;
    }

    public void setBusy(boolean busy) {
        this.busy = busy;
    }

    public void setOperand(String operand) {
        this.operand = operand;
    }

    public void setFi(int Fi) {
        this.Fi = Fi;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFj(int Fj) {
        this.Fj = Fj;
    }


    public void setFk(int Fk) {
        this.Fk = Fk;
    }

    public void setQj(String Qj) {
        this.Qj = Qj;
    }

    public void setQk(String Qk) {
        this.Qk = Qk;
    }

    public void setRj(boolean Rj) {
        this.Rj = Rj;
    }

    public void setRk(boolean Rk) {
        this.Rk = Rk;
    }
    
    
}
