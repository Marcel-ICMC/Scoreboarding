/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scoreboarding.interfac;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import javax.swing.table.DefaultTableModel;
import scoreboarding.FunctionalUnit;
import scoreboarding.Instruction;
import scoreboarding.RRS;

/**
 *
 * @author ICMC
 */

public class interfaci extends javax.swing.JFrame {

    /**
     * Creates new form interfaci
     */
    public interfaci() {
        initComponents();
        initFus();
        for (int i=0; i<nRRS; i++) {
            jComboBox2.addItem("" + (i+1));
            jComboBox3.addItem("" + (i+1));
            jComboBox4.addItem("" + (i+1));
        }
        jComboBox4.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jComboBox4 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        textField1 = new java.awt.TextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Instruções", "i", "j", "k", "Issue", "Read Operand", "Execution Complete", "Write Result"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "LW", "SW", "ADD", "ADDI", "SUB", "MULT", "DIV" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });

        jComboBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox4ActionPerformed(evt);
            }
        });

        jLabel1.setText("rs");

        jLabel2.setText("rt");

        jLabel3.setText("rd");

        jLabel4.setText("Instruction");

        jLabel5.setText("imm");

        textField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                textField1FocusLost(evt);
            }
        });
        textField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField1ActionPerformed(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Instruction", "rs", "rt", "rd / imm"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable2);

        jButton1.setText("Add Instruction");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Proximo Ciclo");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Busy", "Op", "Fi", "Fj", "Fj", "Qj", "Qk", "Rj", "Rk"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTable3);

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "R1", "R2", "R3", "R4", "R5", "R6", "R7", "R8", "R9", "R10"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane4.setViewportView(jTable4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(textField1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(448, 448, 448)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 777, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 731, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 153, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(783, 783, 783))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(67, 67, 67)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(textField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(2, 2, 2)
                        .addComponent(jButton1)
                        .addGap(28, 28, 28)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(30, 30, 30))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private String operand = "LW";
    private int rs = 1;
    private int rt = 1;
    private int rd = 1;
    private int imm = 0;
    private Queue<Instruction> instructions = new LinkedList<Instruction>();
    private int count_instruction = 0;
    private int clock = 0;
    private int counter = 0;
    private int nLoadStore = 2;
    private int nArithmetic = 2;
    private FunctionalUnit[] fus = new FunctionalUnit[nLoadStore + nArithmetic];
    private int nRRS = 10;
    private RRS[] rrs = new RRS[nRRS];
    
    private void initFus(){
        int i=0;
        for (i=0; i<nLoadStore; i++) {
            fus[i] = new FunctionalUnit("Load/Store");
            insertLinha(jTable3, new Object[]{"Load/Store " + (i+1), null, "", null,null,null, "","",null,null});
        }
        for (; i<nArithmetic + nLoadStore; i++) {
            fus[i] = new FunctionalUnit("Arithmatic");
            insertLinha(jTable3, new Object[]{"Arithmatic " + (i+1 - nLoadStore), null, "", null,null,null, "","", null,null});
        }
        for (int j=0; j<nRRS; j++) {
            rrs[j] = new RRS("R" + (j+1));
            System.out.println(rrs[j].getName());
        }
        //fus[0] = new FunctionalUnit("Load/Store");
        //fus[1] = new FunctionalUnit("Load/Store");
        //fus[2] = new FunctionalUnit("Arithmatic");
        //fus[3] = new FunctionalUnit("Arithmatic");
    }
    
    private void computeScoreboarding(){
        Instruction instruction = instructions.peek();
        if (instruction == null) return;
        instructions.remove();
        
        
        // Issue (Insercao)
        if (instruction.getUnit().equals("Load/Store")) {
            for (int i=0; i<nLoadStore; i++) {
                if (!fus[i].isBusy() && rrs[fus[i].getFi()].getFus() == null) {

                    instruction.setIssue(clock);
                    fus[i].setBusy(true);
                    fus[i].setInstruction(instruction);
                    fus[i].setFi(instruction.getRs());
                    fus[i].setFj(instruction.getRt());
                    fus[i].setFk(instruction.getImm());
                    
                    //conferindo dependencia do fj
                    if(rrs[fus[i].getFj()].getFus() != null){
                        fus[i].setQj(rrs[fus[i].getFj()].getFus().getName());
                        fus[i].setRj(false);
                    } else {
                        fus[i].setQj(null);
                        fus[i].setRj(true);
                    }
                    
                    
                    //!fus[i].getInstruction().getType().equals("I") && 
                    
                    //conferindo dependencia do fk
                    if(rrs[fus[i].getFk()].getFus() !=  null){ //tem algo, entao entre
                        if (!fus[i].getInstruction().getType().equals("I")) {   // verifica se nao for imm
                            fus[i].setQk(rrs[fus[i].getFk()].getFus().getName());   
                            fus[i].setRk(false);
                        } else {    // caso seja imm, sera sempre true
                            fus[i].setQk(null);
                            fus[i].setRk(true);
                        }
                    }else{
                        fus[i].setQk(null);
                        fus[i].setRk(true);
                    }
                    
                    //conferindo se pode escrever no Fi
                    if (fus[i].getInstruction().getOperand().equals("LW")) {
                        if(rrs[fus[i].getFi()].getFus() == null){
                            rrs[fus[i].getFi()].setFus(fus[i]);
                        }
                    }
                    
                    insertLinha(jTable1, new Object[]{fus[i].getInstruction().getOperand(), fus[i].getInstruction().getRd(), fus[i].getInstruction().getRs(), fus[i].getInstruction().getImm(), 
                    fus[i].getInstruction().getIssue(), fus[i].getInstruction().getRead_operand(), fus[i].getInstruction().getExecution_complete(), fus[i].getInstruction().getWrite_result()});
                    break;
                }
            }
            
        } else {
            for (int i=nLoadStore; i<nArithmetic + nLoadStore; i++) {
                if (!fus[i].isBusy()) {

                    instruction.setIssue(clock);
                    fus[i].setBusy(true);
                    fus[i].setInstruction(instruction);
                    fus[i].setFi(instruction.getRs());
                    fus[i].setFj(instruction.getRt());
                    if (fus[i].getInstruction().getType().equals("R")) {
                        fus[i].setFk(instruction.getRd());
                    } else {
                        fus[i].setFk(instruction.getImm());
                    }
                    
                    //conferindo dependencia do fj
                    if(rrs[fus[i].getFj()].getFus() != null){
                        fus[i].setQj(rrs[fus[i].getFj()].getFus().getName());
                        fus[i].setRj(false);
                    }else{
                       fus[i].setQj(null);
                       fus[i].setRj(true);
                    }
                    
                    //conferindo dependencia do fk
                    if(!fus[i].getInstruction().getType().equals("I") && rrs[fus[i].getFk()].getFus() != null){
                        fus[i].setQk(rrs[fus[i].getFk()].getFus().getName());
                        fus[i].setRk(false);
                    }else{
                        fus[i].setQk(null);
                        fus[i].setRk(true);
                    }
                    
                    //conferindo se pode escrever no Fi
                    if(rrs[fus[i].getFi()].getFus() == null){
                        rrs[fus[i].getFi()].setFus(fus[i]);
                    }
                    
                    if (fus[i].getInstruction().getType().equals("R")) {
                        insertLinha(jTable1, new Object[]{fus[i].getInstruction().getOperand(), fus[i].getInstruction().getRd(), fus[i].getInstruction().getRs(), fus[i].getInstruction().getRt(), 
                        fus[i].getInstruction().getIssue(), fus[i].getInstruction().getRead_operand(), fus[i].getInstruction().getExecution_complete(), fus[i].getInstruction().getWrite_result()});
                        break;
                    } else  {
                        insertLinha(jTable1, new Object[]{fus[i].getInstruction().getOperand(), fus[i].getInstruction().getRd(), fus[i].getInstruction().getRs(), fus[i].getInstruction().getImm(), 
                        fus[i].getInstruction().getIssue(), fus[i].getInstruction().getRead_operand(), fus[i].getInstruction().getExecution_complete(), fus[i].getInstruction().getWrite_result()});
                        break;
                    }
                }
            }
        }
        
        clock += 1;
        
        for (int i=0; i < nLoadStore + nArithmetic; i++) {
            if (fus[i].getInstruction() != null) {

                System.out.print(i+ ": " + fus[i].isRj());
                System.out.print(i+ ": " + fus[i].isRk());
                if (fus[i].isRj() && fus[i].isRk()) {
                    jTable1.setValueAt(clock, i, 5);
                    fus[i].getInstruction().setRead_operand(clock);
                    fus[i].setRj(false);
                    fus[i].setRk(false);
                    System.out.print(clock);
                }
/*
                //conferindo dependencia do fj
                if(rrs[fus[i].getFj()].getFus() != null){
                fus[i].setQj(rrs[fus[i].getFj()].getFus().getName());
                fus[i].setRj(false);
                }else{
                fus[i].setQj(null);
                fus[i].setRj(true);
                }
                
                if(!fus[i].getInstruction().getType().equals("I") && rrs[fus[i].getFk()].getFus() != null){
                fus[i].setQk(rrs[fus[i].getFk()].getFus().getName());
                fus[i].setRk(false);
                } else {
                fus[i].setQk(null);
                fus[i].setRk(true);
                }*/ 
//            
            /*                    if (fus[i].getInstruction() == null) continue;
            //conferindo dependencia do fj
            if(rrs[fus[i].getFj()].getFus() != null){
            fus[i].setQj(rrs[fus[i].getFj()].getFus().getName());
            fus[i].setRj(false);
            }else{
            fus[i].setQj(null);
            fus[i].setRj(true);
            }
            
            //conferindo dependencia do fk
            if(!fus[i].getInstruction().getType().equals("I") && rrs[fus[i].getFk()].getFus() != null){
            fus[i].setQk(rrs[fus[i].getFk()].getFus().getName());
            fus[i].setRk(false);
            }else{
            fus[i].setQk(null);
            fus[i].setRk(true);
            }
            
            //conferindo se pode escrever no Fi
            if(rrs[fus[i].getFi()].getFus() == null){
            rrs[fus[i].getFi()].setFus(fus[i]);
            }
            
            if (fus[i].getInstruction().getRead_operand() == -1 && (fus[i].isRj() && fus[i].isRk())) {
            fus[i].setRj(false);
            fus[i].setRk(false);
            fus[i].getInstruction().setRead_operand(clock + 1);
            fus[i].getInstruction().setExecution_complete(clock + 2);
            }*/
           
            
            // Write Result
            /*if (fus[i].getInstruction().getWrite_result() == -1) {
            int j=0;
            for (j=0; j<i; j++) {
            if ((fus[i].getFi() == fus[j].getFj() || fus[i].getFi() == fus[j].getFk()) && !fus[j].isRj() ) {
            break;
            }
            System.out.println("a");
            }
            if (j==i) {
            fus[i].getInstruction().setWrite_result(clock + 1);
            }
            }*/
            }
        }
    }
    
    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        operand = (String) jComboBox1.getSelectedItem();
        System.out.println(operand);
        if (!"LW".equals(operand) && !"SW".equals(operand) && !"ADDI".equals(operand)) {
            jComboBox4.setEnabled(true);
            textField1.setEnabled(false);
        } else {
            jComboBox4.setEnabled(false);
            textField1.setEnabled(true);
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void textField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField1ActionPerformed
        // TODO add your handling code here:
        if ("LW".equals(operand) || "SW".equals(operand) || "ADDI".equals(operand)) {
            imm = (int) Integer.parseInt(textField1.getText());
        } else {
            textField1.setEnabled(false);
        }
    }//GEN-LAST:event_textField1ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
        rs = Integer.parseInt((String) jComboBox2.getSelectedItem());
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        // TODO add your handling code here:
        rt = Integer.parseInt((String) jComboBox3.getSelectedItem());
    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void jComboBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox4ActionPerformed
        // TODO add your handling code here:
        if (!"LW".equals(operand) && !"SW".equals(operand) && !"ADDI".equals(operand)) {
            rd = Integer.parseInt((String) jComboBox4.getSelectedItem());
        } else {
            jComboBox4.setEnabled(false);
        }
    }//GEN-LAST:event_jComboBox4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if ("LW".equals(operand) || "SW".equals(operand) || "ADDI".equals(operand)) {
            insertLinha(jTable2, new Object[]{operand, rs, rt, imm});
            if("ADDI".equals(operand)){
                instructions.add(new Instruction(operand, rs, rt, rd, imm, "Arithmetic"));
            }else{
                instructions.add(new Instruction(operand, rs, rt, rd, imm, "Load/Store"));
            }
        } else {
            insertLinha(jTable2, new Object[]{operand, rs, rt, rd});
            instructions.add(new Instruction(operand, rs, rt, rd, imm, "Arithmetic"));
        }
        jTable2.scrollRectToVisible(jTable2.getCellRect(jTable2.getRowCount()-1, 0, true));
    }//GEN-LAST:event_jButton1ActionPerformed

    private void textField1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textField1FocusLost
        // TODO add your handling code here:
        if ("LW".equals(operand) || "SW".equals(operand) || "ADDI".equals(operand)) {
            imm = (int) Integer.parseInt(textField1.getText());
        } else {
            textField1.setEnabled(false);
        }
    }//GEN-LAST:event_textField1FocusLost

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        computeScoreboarding();
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(interfaci.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(interfaci.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(interfaci.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(interfaci.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               interfaci inter = new interfaci();
               inter.setVisible(true);
            }
        });
      
    }
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private java.awt.TextField textField1;
    // End of variables declaration//GEN-END:variables
    DefaultTableModel model;
       
    private void insertLinha(javax.swing.JTable table, Object[] object){
       model = (DefaultTableModel) table.getModel();
       model.insertRow(model.getRowCount(), object);
    }
    
    private void userInput() {
        
    }
    
    public void runInterface(){
        interfaci inter = new interfaci();
        inter.setVisible(true);
    }

    private void print() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
