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
public class Instruction {
    
    private String type;
    private String unit;
    private String operand;
    private String rs;
    private String rt;
    private String rd;
    private int imm;
    private int issue;
    private int read_operand;
    private int execution_complete;
    private int write_result;

    public Instruction(String operand, String rs, String rt, String rd, int imm, String unit) {
        this.operand = operand;
        this.rs = rs;
        this.rt = rt;
        this.rd = rd;
        this.imm = imm;
        this.issue = -1;
        this.unit = unit;
        
        if ("LW".equals(operand) || "SW".equals(operand) || "ADDI".equals(operand)) {
            this.type = "I";
        } else {
            this.type = "R";
        }
    }

    public String getUnit() {
        return unit;
    }

    public String getType() {
        return type;
    }

    public int getIssue() {
        return issue;
    }

    public void setIssue(int issue) {
        this.issue = issue;
    }

    public void setRead_operand(int read_operand) {
        this.read_operand = read_operand;
    }

    public void setExecution_complete(int execution_complete) {
        this.execution_complete = execution_complete;
    }

    public void setWrite_result(int write_result) {
        this.write_result = write_result;
    }

    public int getRead_operand() {
        return read_operand;
    }

    public int getExecution_complete() {
        return execution_complete;
    }

    public int getWrite_result() {
        return write_result;
    }
    
    public String getOperand() {
        return operand;
    }

    public String getRs() {
        return rs;
    }

    public String getRt() {
        return rt;
    }

    public String getRd() {
        return rd;
    }

    public int getImm() {
        return imm;
    }
    
    
}
