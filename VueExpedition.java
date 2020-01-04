/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beuzelin;

public class VueExpedition extends javax.swing.JDialog {

    public VueExpedition(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        affichagesocietetransport = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        affichagetempsexpedition = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        affichagedestination = new javax.swing.JTextArea();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        infoexpedition = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        info = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        affichageinfocereale = new javax.swing.JTextArea();
        expeditionannuler = new javax.swing.JButton();
        expeditionvalider = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridLayout(4, 2));

        jPanel1.setLayout(new java.awt.BorderLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Société de transport :");
        jPanel1.add(jLabel1, java.awt.BorderLayout.NORTH);

        affichagesocietetransport.setColumns(20);
        affichagesocietetransport.setRows(5);
        jScrollPane1.setViewportView(affichagesocietetransport);

        jPanel1.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1);

        jPanel2.setLayout(new java.awt.BorderLayout());

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Temps d'expédition prévu :");
        jPanel2.add(jLabel2, java.awt.BorderLayout.NORTH);

        affichagetempsexpedition.setColumns(20);
        affichagetempsexpedition.setRows(5);
        jScrollPane2.setViewportView(affichagetempsexpedition);

        jPanel2.add(jScrollPane2, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel2);

        jPanel3.setLayout(new java.awt.BorderLayout());

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Destination :");
        jPanel3.add(jLabel3, java.awt.BorderLayout.NORTH);

        affichagedestination.setColumns(20);
        affichagedestination.setRows(5);
        jScrollPane4.setViewportView(affichagedestination);

        jPanel3.add(jScrollPane4, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel3);

        jPanel4.setLayout(new java.awt.BorderLayout());

        infoexpedition.setColumns(20);
        infoexpedition.setRows(5);
        jScrollPane3.setViewportView(infoexpedition);

        jPanel4.add(jScrollPane3, java.awt.BorderLayout.CENTER);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Récapitulatif :");
        jPanel4.add(jLabel4, java.awt.BorderLayout.NORTH);

        getContentPane().add(jPanel4);

        jPanel5.setLayout(new java.awt.BorderLayout());

        info.setText("Infos du lot de céréale");
        info.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                infoActionPerformed(evt);
            }
        });
        jPanel5.add(info, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel5);

        jPanel6.setLayout(new java.awt.BorderLayout());

        affichageinfocereale.setColumns(20);
        affichageinfocereale.setRows(5);
        jScrollPane5.setViewportView(affichageinfocereale);

        jPanel6.add(jScrollPane5, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel6);

        expeditionannuler.setText("Annuler");
        expeditionannuler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                expeditionannulerActionPerformed(evt);
            }
        });
        getContentPane().add(expeditionannuler);

        expeditionvalider.setText("Valider");
        expeditionvalider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                expeditionvaliderActionPerformed(evt);
            }
        });
        getContentPane().add(expeditionvalider);

        pack();
    }// </editor-fold>                        

    private void infoActionPerformed(java.awt.event.ActionEvent evt) {                                     
        this.setVisible(false);
        VueInfo i = new VueInfo(this,true);
        i.setVisible(true);
        this.setVisible(true);
    }                                    

    private void expeditionannulerActionPerformed(java.awt.event.ActionEvent evt) {                                                  
        this.dispose();
    }                                                 

    private void expeditionvaliderActionPerformed(java.awt.event.ActionEvent evt) {                                                  
        // TODO add your handling code here:
    }                                                 

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
            java.util.logging.Logger.getLogger(VueExpedition.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VueExpedition.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VueExpedition.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VueExpedition.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                VueExpedition dialog = new VueExpedition(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JTextArea affichagedestination;
    private javax.swing.JTextArea affichageinfocereale;
    private javax.swing.JTextArea affichagesocietetransport;
    private javax.swing.JTextArea affichagetempsexpedition;
    private javax.swing.JButton expeditionannuler;
    private javax.swing.JButton expeditionvalider;
    private javax.swing.JButton info;
    private javax.swing.JTextArea infoexpedition;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    // End of variables declaration                   
}
