/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.uvg_estructuras_algoritmos.radio_de_carro;

import java.awt.Color;
import java.awt.Toolkit;

/**
 *
 * @author sevic69
 */
public class InterfazDeUsuario extends javax.swing.JFrame 
{
    protected RadioI implementacionRadio;
    
    /**
     * Creates new form InterfazDeUsuario
     */
    public InterfazDeUsuario() 
    {
        initComponents();
        // cambiar esta linea de codigo con la nueva clase para probar
        implementacionRadio = new ImplementacionRadio();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl_ControlesPrincipales = new javax.swing.JPanel();
        scrPn_PantallaRadio = new javax.swing.JScrollPane();
        tA_PantallaRadio = new javax.swing.JTextArea();
        btn_FrecAdelante = new javax.swing.JButton();
        btn_FrecAtras = new javax.swing.JButton();
        tglBtn_PrenderApagar = new javax.swing.JToggleButton();
        btn_AmFm = new javax.swing.JButton();
        PanelIndicadorDeEstado = new javax.swing.JPanel();
        pnl_BotonesMemoria = new javax.swing.JPanel();
        btn_Memoria0 = new javax.swing.JButton();
        btn_Memoria1 = new javax.swing.JButton();
        btn_Memoria2 = new javax.swing.JButton();
        btn_Memoria3 = new javax.swing.JButton();
        btn_Memoria4 = new javax.swing.JButton();
        btn_Memoria5 = new javax.swing.JButton();
        btn_Memoria6 = new javax.swing.JButton();
        btn_Memoria7 = new javax.swing.JButton();
        btn_Memoria8 = new javax.swing.JButton();
        btn_Memoria9 = new javax.swing.JButton();
        btn_Memoria10 = new javax.swing.JButton();
        btn_Memoria11 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("frame_InterfazDeUsuario"); // NOI18N
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnl_ControlesPrincipales.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        scrPn_PantallaRadio.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scrPn_PantallaRadio.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        tA_PantallaRadio.setEditable(false);
        tA_PantallaRadio.setColumns(20);
        tA_PantallaRadio.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        tA_PantallaRadio.setRows(5);
        tA_PantallaRadio.setToolTipText("");
        scrPn_PantallaRadio.setViewportView(tA_PantallaRadio);

        pnl_ControlesPrincipales.add(scrPn_PantallaRadio, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 760, 120));

        btn_FrecAdelante.setEnabled(false);
        btn_FrecAdelante.setLabel(">>");
        btn_FrecAdelante.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_FrecAdelanteMouseClicked(evt);
            }
        });
        pnl_ControlesPrincipales.add(btn_FrecAdelante, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 100, 80, 80));

        btn_FrecAtras.setEnabled(false);
        btn_FrecAtras.setLabel("<<");
        btn_FrecAtras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_FrecAtrasMouseClicked(evt);
            }
        });
        pnl_ControlesPrincipales.add(btn_FrecAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 80, 80));

        tglBtn_PrenderApagar.setText("ON");
        tglBtn_PrenderApagar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tglBtn_PrenderApagarMouseClicked(evt);
            }
        });
        pnl_ControlesPrincipales.add(tglBtn_PrenderApagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 80));

        btn_AmFm.setText("FM");
        btn_AmFm.setEnabled(false);
        btn_AmFm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_AmFmMouseClicked(evt);
            }
        });
        pnl_ControlesPrincipales.add(btn_AmFm, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 0, 80, 80));

        PanelIndicadorDeEstado.setBackground(new java.awt.Color(255, 0, 0));
        pnl_ControlesPrincipales.add(PanelIndicadorDeEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, -1, -1));

        getContentPane().add(pnl_ControlesPrincipales, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 960, 180));

        pnl_BotonesMemoria.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_Memoria0.setText("1");
        btn_Memoria0.setEnabled(false);
        btn_Memoria0.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_Memoria0MouseClicked(evt);
            }
        });
        pnl_BotonesMemoria.add(btn_Memoria0, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 80));

        btn_Memoria1.setEnabled(false);
        btn_Memoria1.setLabel("2");
        btn_Memoria1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_Memoria1MouseClicked(evt);
            }
        });
        pnl_BotonesMemoria.add(btn_Memoria1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 80, 80));

        btn_Memoria2.setEnabled(false);
        btn_Memoria2.setLabel("3");
        btn_Memoria2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_Memoria2MouseClicked(evt);
            }
        });
        pnl_BotonesMemoria.add(btn_Memoria2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, 80, 80));

        btn_Memoria3.setEnabled(false);
        btn_Memoria3.setLabel("4");
        btn_Memoria3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_Memoria3MouseClicked(evt);
            }
        });
        pnl_BotonesMemoria.add(btn_Memoria3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, 80, 80));

        btn_Memoria4.setEnabled(false);
        btn_Memoria4.setLabel("5");
        btn_Memoria4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_Memoria4MouseClicked(evt);
            }
        });
        pnl_BotonesMemoria.add(btn_Memoria4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, 80, 80));

        btn_Memoria5.setEnabled(false);
        btn_Memoria5.setLabel("6");
        btn_Memoria5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_Memoria5MouseClicked(evt);
            }
        });
        pnl_BotonesMemoria.add(btn_Memoria5, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 0, 80, 80));

        btn_Memoria6.setEnabled(false);
        btn_Memoria6.setLabel("7");
        btn_Memoria6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_Memoria6MouseClicked(evt);
            }
        });
        pnl_BotonesMemoria.add(btn_Memoria6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 80, 80));

        btn_Memoria7.setEnabled(false);
        btn_Memoria7.setLabel("8");
        btn_Memoria7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_Memoria7MouseClicked(evt);
            }
        });
        pnl_BotonesMemoria.add(btn_Memoria7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 80, 80));

        btn_Memoria8.setEnabled(false);
        btn_Memoria8.setLabel("9");
        btn_Memoria8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_Memoria8MouseClicked(evt);
            }
        });
        pnl_BotonesMemoria.add(btn_Memoria8, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 80, 80));

        btn_Memoria9.setEnabled(false);
        btn_Memoria9.setLabel("10");
        btn_Memoria9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_Memoria9MouseClicked(evt);
            }
        });
        pnl_BotonesMemoria.add(btn_Memoria9, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 70, 80, 80));

        btn_Memoria10.setEnabled(false);
        btn_Memoria10.setLabel("11");
        btn_Memoria10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_Memoria10MouseClicked(evt);
            }
        });
        pnl_BotonesMemoria.add(btn_Memoria10, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 70, 80, 80));

        btn_Memoria11.setEnabled(false);
        btn_Memoria11.setLabel("12");
        btn_Memoria11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_Memoria11MouseClicked(evt);
            }
        });
        pnl_BotonesMemoria.add(btn_Memoria11, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 70, 80, 80));

        getContentPane().add(pnl_BotonesMemoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(266, 200, 480, 150));

        pack();
    }// </editor-fold>//GEN-END:initComponents
/**
 * Metodo que se ejecuta cuando se hace click en el boton de Prender. Cambia el estado del Radio de encencido a apagado y viceversa.
 * Habilita o deshabilita los botones, y musetra en pantalla la frecuencia acual
 * @param evt 
 */
    private void tglBtn_PrenderApagarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tglBtn_PrenderApagarMouseClicked
       if(implementacionRadio.estaPrendido())
        {
            implementacionRadio.apagar();
            SetButtonState(false);
            tA_PantallaRadio.setText("APAGADO");
            tglBtn_PrenderApagar.setText("ON");
            PanelIndicadorDeEstado.setBackground(Color.red);
         }
       else{
           implementacionRadio.prender();
           SetButtonState(true);
           tA_PantallaRadio.setText("ENCENDIDO");
           tglBtn_PrenderApagar.setText("OFF");
           PanelIndicadorDeEstado.setBackground(Color.green);
       }
    }//GEN-LAST:event_tglBtn_PrenderApagarMouseClicked

/**
 * Metodo que se ejecuta cuando se hace click en el boton de adelantar frecuencia. Actualiza la nueva estacion en pantalla
 * @param evt 
 */
    private void btn_FrecAdelanteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_FrecAdelanteMouseClicked
        String nuevaEstacion = implementacionRadio.frecAdelante();
        tA_PantallaRadio.setText(nuevaEstacion);
    }//GEN-LAST:event_btn_FrecAdelanteMouseClicked

    
/**
 * Metodo que se ejecuta cuando se hace click en el boton de cambiar estacion. Cambia el texto del boton al nuevo estado del radio
 * y muestra en pantalla la frecuencia respectiva al estado del radio. 
 * @param evt 
 */
    private void btn_AmFmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_AmFmMouseClicked
        if(implementacionRadio.estaPrendido())
        {
            String estadoFrecuencia = implementacionRadio.cambioFrecuencia();
            btn_AmFm.setText(estadoFrecuencia);
            String estacion = implementacionRadio.mostrarEstacion();
            tA_PantallaRadio.setText(estacion);
        }
    }//GEN-LAST:event_btn_AmFmMouseClicked

/**
 * Metodo que se ejecuta cuando se hace click en el boton de retroceder la frecuencia, este muestra la nueva frecuencia que se esta 
 * sintonizando en pantalla 
 * @param evt 
 */
    private void btn_FrecAtrasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_FrecAtrasMouseClicked
        String nuevaEstacion = implementacionRadio.frecAtras();
        tA_PantallaRadio.setText(nuevaEstacion);
    }//GEN-LAST:event_btn_FrecAtrasMouseClicked

    private void btn_Memoria0MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_Memoria0MouseClicked

        int m = evt.getButton();
        if(m == 1)
        {
            String estacion = implementacionRadio.obtenerEstacion(0);
            tA_PantallaRadio.setText(estacion);
        }
        else if(m == 3)
        {
            implementacionRadio.guardarEstacionActual(0);
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_btn_Memoria0MouseClicked

    private void btn_Memoria1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_Memoria1MouseClicked
        
        int m = evt.getButton();
        if(m == 1){
        String estacion = implementacionRadio.obtenerEstacion(1);
         tA_PantallaRadio.setText(estacion);
        }
        else if(m == 3){
        implementacionRadio.guardarEstacionActual(1);
        Toolkit.getDefaultToolkit().beep();
  
        }
    }//GEN-LAST:event_btn_Memoria1MouseClicked

    private void btn_Memoria2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_Memoria2MouseClicked
        
        int m = evt.getButton();
        if(m == 1){
        String estacion = implementacionRadio.obtenerEstacion(2);
         tA_PantallaRadio.setText(estacion);
        }
        else if(m == 3){
        implementacionRadio.guardarEstacionActual(2);
        Toolkit.getDefaultToolkit().beep();
  
        }
    }//GEN-LAST:event_btn_Memoria2MouseClicked

    private void btn_Memoria3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_Memoria3MouseClicked
        int m = evt.getButton();
        if(m == 1){
        String estacion = implementacionRadio.obtenerEstacion(3);
         tA_PantallaRadio.setText(estacion);
        }
        else if(m == 3){
        implementacionRadio.guardarEstacionActual(3);
        Toolkit.getDefaultToolkit().beep();
  
        }
    }//GEN-LAST:event_btn_Memoria3MouseClicked

    private void btn_Memoria4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_Memoria4MouseClicked
        int m = evt.getButton();
        if(m == 1){
        String estacion = implementacionRadio.obtenerEstacion(4);
         tA_PantallaRadio.setText(estacion);
        }
        else if(m == 3){
        implementacionRadio.guardarEstacionActual(4);
        Toolkit.getDefaultToolkit().beep();
  
        }
    }//GEN-LAST:event_btn_Memoria4MouseClicked

    private void btn_Memoria5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_Memoria5MouseClicked
        int m = evt.getButton();
        if(m == 1){
        String estacion = implementacionRadio.obtenerEstacion(5);
         tA_PantallaRadio.setText(estacion);
        }
        else if(m == 3){
        implementacionRadio.guardarEstacionActual(5);
        Toolkit.getDefaultToolkit().beep();
  
        }
    }//GEN-LAST:event_btn_Memoria5MouseClicked

    private void btn_Memoria6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_Memoria6MouseClicked
        int m = evt.getButton();
        if(m == 1){
        String estacion = implementacionRadio.obtenerEstacion(6);
         tA_PantallaRadio.setText(estacion);
        }
        else if(m == 3){
        implementacionRadio.guardarEstacionActual(6);
        Toolkit.getDefaultToolkit().beep();
  
        }
    }//GEN-LAST:event_btn_Memoria6MouseClicked

    private void btn_Memoria7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_Memoria7MouseClicked
        int m = evt.getButton();
        if(m == 1){
        String estacion = implementacionRadio.obtenerEstacion(7);
         tA_PantallaRadio.setText(estacion);
        }
        else if(m == 3){
        implementacionRadio.guardarEstacionActual(7);
        Toolkit.getDefaultToolkit().beep();
  
        }
    }//GEN-LAST:event_btn_Memoria7MouseClicked

    private void btn_Memoria8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_Memoria8MouseClicked
        
        int m = evt.getButton();
        if(m == 1){
        String estacion = implementacionRadio.obtenerEstacion(8);
         tA_PantallaRadio.setText(estacion);
        }
        else if(m == 3){
        implementacionRadio.guardarEstacionActual(8);
        Toolkit.getDefaultToolkit().beep();
  
        }
    }//GEN-LAST:event_btn_Memoria8MouseClicked

    private void btn_Memoria9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_Memoria9MouseClicked
       int m = evt.getButton();
        if(m == 1){
        String estacion = implementacionRadio.obtenerEstacion(9);
         tA_PantallaRadio.setText(estacion);
        }
        else if(m == 3){
        implementacionRadio.guardarEstacionActual(9);
        Toolkit.getDefaultToolkit().beep();
  
        }
    }//GEN-LAST:event_btn_Memoria9MouseClicked

    private void btn_Memoria10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_Memoria10MouseClicked
       
        int m = evt.getButton();
        if(m == 1){
        String estacion = implementacionRadio.obtenerEstacion(10);
         tA_PantallaRadio.setText(estacion);
        }
        else if(m == 3){
        implementacionRadio.guardarEstacionActual(10);
        Toolkit.getDefaultToolkit().beep();
  
        }
    }//GEN-LAST:event_btn_Memoria10MouseClicked

    private void btn_Memoria11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_Memoria11MouseClicked
        
        int m = evt.getButton();
        if(m == 1){
        String estacion = implementacionRadio.obtenerEstacion(11);
         tA_PantallaRadio.setText(estacion);
        }
        else if(m == 3){
        implementacionRadio.guardarEstacionActual(11);
        Toolkit.getDefaultToolkit().beep();
  
        }
    }//GEN-LAST:event_btn_Memoria11MouseClicked
    
    
    
    
    
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
            java.util.logging.Logger.getLogger(InterfazDeUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazDeUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazDeUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazDeUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazDeUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelIndicadorDeEstado;
    private javax.swing.JButton btn_AmFm;
    private javax.swing.JButton btn_FrecAdelante;
    private javax.swing.JButton btn_FrecAtras;
    private javax.swing.JButton btn_Memoria0;
    private javax.swing.JButton btn_Memoria1;
    private javax.swing.JButton btn_Memoria10;
    private javax.swing.JButton btn_Memoria11;
    private javax.swing.JButton btn_Memoria2;
    private javax.swing.JButton btn_Memoria3;
    private javax.swing.JButton btn_Memoria4;
    private javax.swing.JButton btn_Memoria5;
    private javax.swing.JButton btn_Memoria6;
    private javax.swing.JButton btn_Memoria7;
    private javax.swing.JButton btn_Memoria8;
    private javax.swing.JButton btn_Memoria9;
    private javax.swing.JPanel pnl_BotonesMemoria;
    private javax.swing.JPanel pnl_ControlesPrincipales;
    private javax.swing.JScrollPane scrPn_PantallaRadio;
    private javax.swing.JTextArea tA_PantallaRadio;
    private javax.swing.JToggleButton tglBtn_PrenderApagar;
    // End of variables declaration//GEN-END:variables

    
/**
 * Metodo que cambia el estado de todos los botones de la interfaz del radio. Exceptuando el de Prendido.
 * @param state 
 */
    private void SetButtonState(boolean state)
    {
        btn_AmFm.setEnabled(state);
        btn_FrecAdelante.setEnabled(state);
        btn_FrecAtras.setEnabled(state);
        btn_Memoria0.setEnabled(state);
        btn_Memoria1.setEnabled(state);
        btn_Memoria2.setEnabled(state);
        btn_Memoria3.setEnabled(state);
        btn_Memoria4.setEnabled(state);
        btn_Memoria5.setEnabled(state);
        btn_Memoria6.setEnabled(state);
        btn_Memoria7.setEnabled(state);
        btn_Memoria8.setEnabled(state);
        btn_Memoria9.setEnabled(state);
        btn_Memoria10.setEnabled(state);
        btn_Memoria11.setEnabled(state);
    }
}

