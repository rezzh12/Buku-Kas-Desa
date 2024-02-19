package GUI;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.sql.Connection;
import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
/**
 *
 * @author bayujp
 */
public class ubahKeluar extends javax.swing.JFrame {
String pinjam;
String balik;
    /**
     * Creates new form inputpinjam
     */
    public ubahKeluar(){
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

        jPanel2 = new javax.swing.JPanel();
        tfId = new javax.swing.JTextField();
        tfPJ = new javax.swing.JTextField();
        tfJumlah = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        dcTanggal = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        tfKeterangan = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(102, 255, 102));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tfId.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tfIdMouseClicked(evt);
            }
        });
        tfId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfIdKeyReleased(evt);
            }
        });
        jPanel2.add(tfId, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 440, 30));

        tfPJ.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfPJKeyReleased(evt);
            }
        });
        jPanel2.add(tfPJ, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, 440, 30));

        tfJumlah.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tfJumlahMouseClicked(evt);
            }
        });
        tfJumlah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfJumlahActionPerformed(evt);
            }
        });
        tfJumlah.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfJumlahKeyReleased(evt);
            }
        });
        jPanel2.add(tfJumlah, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, 440, 30));

        jButton1.setBackground(new java.awt.Color(51, 102, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-making_notes.png"))); // NOI18N
        jButton1.setText("Ubah");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 420, 110, 30));

        jButton2.setBackground(new java.awt.Color(255, 51, 51));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-delete_trash.png"))); // NOI18N
        jButton2.setText("Hapus");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 420, -1, 30));

        jLabel2.setFont(new java.awt.Font("Garamond", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setText("Tanggal");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, -1, -1));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/back.png"))); // NOI18N
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 450, -1, -1));

        jPanel1.setBackground(new java.awt.Color(0, 153, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(new java.awt.Color(51, 51, 51));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Ubah/Hapus Kas Keluar");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, -1, -1));

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 660, 70));

        jLabel4.setFont(new java.awt.Font("Garamond", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Id Saldo Masuk");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        jLabel5.setFont(new java.awt.Font("Garamond", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Penanggung Jawab");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        jLabel6.setFont(new java.awt.Font("Garamond", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Jumlah");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        jLabel7.setFont(new java.awt.Font("Garamond", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Keterangan");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, -1, -1));
        jPanel2.add(dcTanggal, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 370, 440, 30));

        tfKeterangan.setColumns(20);
        tfKeterangan.setRows(5);
        jScrollPane1.setViewportView(tfKeterangan);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, 440, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 656, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 542, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tfIdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfIdMouseClicked
tfId.setText("");
        // TODO add your handling code here:
    }//GEN-LAST:event_tfIdMouseClicked

    private void tfJumlahMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfJumlahMouseClicked
tfJumlah.setText("");
        // TODO add your handling code here:
    }//GEN-LAST:event_tfJumlahMouseClicked

    private void tfPJKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfPJKeyReleased

        // TODO add your handling code here:
    }//GEN-LAST:event_tfPJKeyReleased

    private void tfIdKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfIdKeyReleased
try{
  String query = "select * from kas_keluar where id_keluar = '"+tfId.getText()+"'";
 java.sql.Connection kon = (Connection) koneksi.koneksi();
 java.sql.Statement stm = kon.createStatement();
 java.sql.ResultSet data = stm.executeQuery(query);
 
 if(data.next()){
     tfPJ.setText(data.getString("Penanggung_jawab"));
     tfKeterangan.setText(data.getString("Keterangan"));
      tfJumlah.setText(data.getString("Jumlah"));
 }
 else{
  tfPJ.setText("Id Masuk");  
 }
}
catch(Exception b){
 JOptionPane.showMessageDialog(null, b.getMessage());
}
        // TODO add your handling code here:
    }//GEN-LAST:event_tfIdKeyReleased

    private void tfJumlahKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfJumlahKeyReleased

  // TODO add your handling code here:
    }//GEN-LAST:event_tfJumlahKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
String Tampilan ="yyyy-MM-dd";
        SimpleDateFormat fm = new SimpleDateFormat(Tampilan);
        String tanggal = String.valueOf(fm.format(dcTanggal.getDate()));
        if(tfId.equals("")||tfPJ.equals("")||tfJumlah.equals("")||tfKeterangan.equals("")||dcTanggal.equals("")){
             JOptionPane.showMessageDialog(this,"Isi Semua Form Yang Tersedia ","Pesan Error",JOptionPane.ERROR_MESSAGE);
        }
        else{
             try {
            String query ="UPDATE kas_keluar SET id_keluar = '"+tfId.getText()
                    +"',penanggung_jawab = '"+tfPJ.getText()
                    +"', keterangan = '"+tfKeterangan.getText()
                    +"',jumlah = '"+tfJumlah.getText()
                    +"',tanggal = '"+tanggal
                    +"' WHERE id_keluar = '"+tfId.getText()+"'";
            java.sql.Connection kon=(Connection)koneksi.koneksi();
            java.sql.PreparedStatement pdt=kon.prepareStatement(query);
            pdt.execute();
            JOptionPane.showMessageDialog(null, "data berhasil di edit");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Perubahan Data Gagal"+e.getMessage());
        }
dispose();
new saldoKeluar().setVisible(true);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tfJumlahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfJumlahActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfJumlahActionPerformed

    private void tglPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tglPropertyChange

        // TODO add your handling code here:
    }//GEN-LAST:event_tglPropertyChange

    private void tglbalikPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tglbalikPropertyChange

        // TODO add your handling code here:
    }//GEN-LAST:event_tglbalikPropertyChange

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
dispose();
new saldoKeluar().setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        if(tfId.getText().trim().equals("")){
             JOptionPane.showMessageDialog(this,"Isi Id dengan benar ","Pesan Error",JOptionPane.ERROR_MESSAGE);
        }
        else{
      try {
            String sql ="delete from kas_keluar where id_keluar='"+tfId.getText()+"'";
            java.sql.Connection conn=(Connection)koneksi.koneksi();
            java.sql.PreparedStatement pst=conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(this, "berhasil di hapus");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        }
this.dispose();
new saldoKeluar().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser dcTanggal;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField tfId;
    private javax.swing.JTextField tfJumlah;
    private javax.swing.JTextArea tfKeterangan;
    private javax.swing.JTextField tfPJ;
    // End of variables declaration//GEN-END:variables
}
