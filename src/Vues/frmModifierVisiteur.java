/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vues;

import Entity.Exerce;
import Entity.Laboratoire;
import Entity.Secteur;
import Entity.Visiteur;
import Tools.FonctionMetier;
import static Vues.frmVerifMofidVisiteur.nom;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author PC
 */
public class frmModifierVisiteur extends javax.swing.JFrame {

    /**
     * Creates new form frmModifierVisiteur
     */
     FonctionMetier frm,frma;
    public frmModifierVisiteur() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNom = new javax.swing.JTextField();
        txtPrenom = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtMatri = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtAdresse = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtVille = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtCP = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        cboScteur = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        cboLab = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        btnModifier = new javax.swing.JButton();
        btnAnnuler = new javax.swing.JButton();
        cboRegion = new javax.swing.JComboBox<>();
        cboVisiteur = new javax.swing.JComboBox<>();
        dteDATE = new com.toedter.calendar.JDateChooser();
        txtDate = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel1.setText("Modifier un visteur");

        jLabel2.setText("Nom");

        jLabel3.setText("Prenom");

        jLabel4.setText("Matricule");

        txtMatri.setOpaque(false);

        jLabel5.setText("Adresse");

        jLabel6.setText("Ville ");

        jLabel7.setText("Code Postal");

        jLabel8.setText("Secteur");

        jLabel9.setText("Laboratoire");

        jLabel10.setText("Date embauche");

        btnModifier.setText("Modifier");
        btnModifier.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnModifierMouseClicked(evt);
            }
        });

        btnAnnuler.setText("Annuler");
        btnAnnuler.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAnnulerMouseClicked(evt);
            }
        });

        cboRegion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Région", "lister", "ajouter", "modifier" }));
        cboRegion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cboRegionMouseClicked(evt);
            }
        });

        cboVisiteur.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Visiteur", "lister", "ajouter", "modifier", " " }));
        cboVisiteur.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cboVisiteurMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(155, 155, 155)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtMatri, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(320, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtNom, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtAdresse, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPrenom, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(93, 93, 93)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtCP, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(cboRegion, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)))
                        .addComponent(cboVisiteur, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(166, 166, 166)
                                .addComponent(btnAnnuler, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnModifier, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtVille))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cboScteur, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(107, 107, 107)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(cboLab, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dteDATE, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cboRegion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cboVisiteur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(txtMatri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPrenom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtAdresse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtVille, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(cboLab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(cboScteur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                        .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dteDATE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnModifier)
                    .addComponent(btnAnnuler))
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAnnulerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAnnulerMouseClicked
        // TODO add your handling code here:
        frmMenu frm = new frmMenu();
        frm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAnnulerMouseClicked

    private void btnModifierMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModifierMouseClicked
        // TODO add your handling code here:
        if(txtNom.getText().compareTo("")==0){
            JOptionPane.showMessageDialog(this,"entrer un nom");
        }
        else{
            if(txtPrenom.getText().compareTo("")==0){
            JOptionPane.showMessageDialog(this,"entrer un prenom");
            }
            else{
                if(txtMatri.getText().compareTo("")==0){
            JOptionPane.showMessageDialog(this,"entrer un matricule");
            }else{
                 if(txtAdresse.getText().compareTo("")==0){
            JOptionPane.showMessageDialog(this,"entrer une adresse");   
                }
                 else{
                     if(txtVille.getText().compareTo("")==0){
                        JOptionPane.showMessageDialog(this,"entrer un nom");
                     }else{
                         if(txtCP.getText().compareTo("")==0){
                        JOptionPane.showMessageDialog(this,"entrer un code postal");
                     }else{
        
        
        String image = "";
        int mat = Integer.parseInt(txtMatri.getText());
        String nom = txtNom.getText();
        String Prenom = txtPrenom.getText();
        String Adresse = txtAdresse.getText();
        String ville = txtVille.getText();
        String cp = txtCP.getText();
        int labocod= frm.getLabCode(cboLab.getSelectedItem().toString());
//        String date= cboDate.getSelectedItem().toString();
        SimpleDateFormat format = new SimpleDateFormat("YYYY-MM-dd");
        
         String date = format.format( dteDATE.getDate());       
        int secCode= frm.getSecCode(cboScteur.getSelectedItem().toString());
        
        frm.ModifierVisiteur(mat, nom, Prenom, Adresse,cp,ville, date, secCode,labocod,image);
        
        
        
        
        
         }
                             
                         
                     }
                 }
            
                    
            }
                     
                    
             
        }
        }
        
    }//GEN-LAST:event_btnModifierMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
//        nom=frmVerifMofidVisiteur(nom);
             
         frm = new  FonctionMetier();
        for(Visiteur v: frm.nomCherche(nom)){
            txtMatri.setText(v.getMatricule());
            txtNom.setText(v.getNom());
            txtPrenom.setText(v.getPrenom());
            txtAdresse.setText(v.getAdresse());
            txtCP.setText(v.getCodP());
            txtVille.setText(v.getVille());
            txtDate.setText(v.getDate());
            cboScteur.addItem(frm.getNomSecCode(Integer.parseInt(v.getSecCode())));
            cboLab.addItem(frm.getNomLabCode(Integer.parseInt(v.getLabCode())));
        }
//        
         frm = new FonctionMetier();
        for(Secteur s : frm.getlesZones()){
            cboScteur.addItem(s.getSc_Libel());
        }
        frm = new FonctionMetier();
        for(Laboratoire l: frm.getLesLaboratoires()){
            cboLab.addItem(l.getNom());
        }
        
//        txtMatri.setText(String.valueOf(frm.GetLastMatricule()));
    }//GEN-LAST:event_formWindowOpened

    private void cboRegionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cboRegionMouseClicked
        // TODO add your handling code here:
        if(cboRegion.getSelectedItem().toString().compareTo("Région") ==0){
            frmRegion frm = new frmRegion();
            frm.setVisible(true);
            this.dispose();
        }
        
            if(cboRegion.getSelectedItem().toString().compareTo("lister") ==0){
                frmRegion frm = new frmRegion();
                frm.setVisible(true);
                 this.dispose();
            }
           
                if(cboRegion.getSelectedItem().toString().compareTo("ajouter") ==0){
                    frmAjoutRegion frm = new frmAjoutRegion();
                    frm.setVisible(true);
                    this.dispose();
                }
                
                    if(cboRegion.getSelectedItem().toString().compareTo("modifier") ==0){
                        frmVerifModifRegion frm = new frmVerifModifRegion();
                        frm.setVisible(true);
                        this.dispose();
                    }
                
            
            
        
         
        
    }//GEN-LAST:event_cboRegionMouseClicked

    private void cboVisiteurMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cboVisiteurMouseClicked
        // TODO add your handling code here:
        if(cboVisiteur.getSelectedItem().toString().compareTo("Visiteur") ==0){
            frmVisiteur frm = new frmVisiteur();
            frm.setVisible(true);
            this.dispose();
        }
        
            if(cboVisiteur.getSelectedItem().toString().compareTo("lister") ==0){
                frmVisiteur frm = new frmVisiteur();
                frm.setVisible(true);
                 this.dispose();
            }
           
                if(cboVisiteur.getSelectedItem().toString().compareTo("ajouter") ==0){
                    frmAjoutVisteur frm = new frmAjoutVisteur();
                    frm.setVisible(true);
                    this.dispose();
                }
                
                    if(cboVisiteur.getSelectedItem().toString().compareTo("modifier") ==0){
                        frmVerifMofidVisiteur frm = new frmVerifMofidVisiteur(nom);
                        frm.setVisible(true);
                        this.dispose();
                    }
                
        
    }//GEN-LAST:event_cboVisiteurMouseClicked

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
            java.util.logging.Logger.getLogger(frmModifierVisiteur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmModifierVisiteur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmModifierVisiteur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmModifierVisiteur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmModifierVisiteur().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnnuler;
    private javax.swing.JButton btnModifier;
    private javax.swing.JComboBox<String> cboLab;
    private javax.swing.JComboBox<String> cboRegion;
    private javax.swing.JComboBox<String> cboScteur;
    private javax.swing.JComboBox<String> cboVisiteur;
    private com.toedter.calendar.JDateChooser dteDATE;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtAdresse;
    private javax.swing.JTextField txtCP;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtMatri;
    private javax.swing.JTextField txtNom;
    private javax.swing.JTextField txtPrenom;
    private javax.swing.JTextField txtVille;
    // End of variables declaration//GEN-END:variables
}
