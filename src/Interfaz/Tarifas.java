/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import parqueadero_proyecto.Tarifa;

/**
 *
 * @author Usuario
 */
public class Tarifas extends javax.swing.JFrame {

    /**
     * Creates new form Tarifas
     */
    public Tarifas() {
        initComponents();
        setLocationRelativeTo(null);
       // List <Tarifa> tarifasAuto = new ArrayList<>();
      
        
        //Iterator<Tarifa> it = tarifas.iterator();
        
        String t="****Tarifas Auto**** \n";
        for(int i=0; i<Principal.tarifasAuto.size();i++){
            t=t+Principal.tarifasAuto.get(i)+"\n";
            
        }
        t=t+"****Tarifas Moto****\n";
        for(int i=0; i<Principal.tarifasMoto.size();i++){
            t=t+Principal.tarifasMoto.get(i)+"\n";
            
        }
        Tarifas.setText(t);
        
      
        
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
        Tarifas = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        Tarifas.setColumns(20);
        Tarifas.setRows(5);
        jScrollPane1.setViewportView(Tarifas);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Tarifas;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
