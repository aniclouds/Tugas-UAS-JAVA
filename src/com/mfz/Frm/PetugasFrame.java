/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mfz.Frm;

import com.mfz.Dao.PetugasDao;
import com.mfz.Tabelmodel.TabelModelPetugas;
import com.mfz.entity.Petugas;
import com.mfz.service.PetugasService;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.SwingWorker;

/**
 *
 * @author DICKA
 */
public class PetugasFrame extends javax.swing.JFrame {

    private PetugasService petugasDao=new PetugasDao();
    private TabelModelPetugas tabelModelPetugas=new TabelModelPetugas();
    private Petugas p;
    
    public PetugasFrame() {
        initComponents();
        tabel_petugas.setModel(tabelModelPetugas);
        setLocationRelativeTo(null);
        loadData();
        txt_label.setVisible(false);
        ProgressBar.setVisible(false);
    }

    private void loadData(){
        List<Petugas> petugases=petugasDao.petugase();
        tabelModelPetugas.setData(petugases);
    }
    
    private void resetForm(){
        txt_kodepetugas.setText("");
        txt_password.setText("");
        txt_username.setText("");
    }
    
    class TampilWorker extends SwingWorker{

        @Override
        protected Object doInBackground() throws Exception {
           for(int i=0; i<=100; i++){
               try {
                   Thread.sleep(10);
                   ProgressBar.setValue(i);
                   ProgressBar.setVisible(true);
                   txt_label.setVisible(true);
                   ProgressBar.setIndeterminate(true);
               } catch (Exception e) {
               }
           }
           return null;
         }

        @Override
        protected void done() {
            String kode=txt_kodepetugas.getText();
            String username=txt_username.getText();
            String password=txt_password.getText();
            ProgressBar.setVisible(false);
            txt_label.setVisible(false);
            JOptionPane.showMessageDialog(null, "Success..");
        }
        
    }
    
    private boolean validasiInput(){
        boolean valid=false;
        if(txt_kodepetugas.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "kode petugas tidak boleh kosong!");
        }else if(txt_password.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "password tidak boleh kosong!");
        }else if(txt_username.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "username tidak boleh kosong!");
        }else{
            valid=true;
        }
        return valid;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_kodepetugas = new javax.swing.JTextField();
        txt_username = new javax.swing.JTextField();
        txt_password = new javax.swing.JTextField();
        bt_code = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        btn_simpan = new javax.swing.JButton();
        btn_update = new javax.swing.JButton();
        btn_delete = new javax.swing.JButton();
        btn_ambilData = new javax.swing.JButton();
        txt_label = new javax.swing.JLabel();
        ProgressBar = new javax.swing.JProgressBar();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel_petugas = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Input Petugas");
        jPanel1.add(jLabel1);

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setText("kd_petugas :");

        jLabel3.setText("username :");

        jLabel4.setText("password :");

        bt_code.setText("get_code");
        bt_code.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_codeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_kodepetugas)
                    .addComponent(txt_username)
                    .addComponent(txt_password, javax.swing.GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bt_code)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_kodepetugas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(bt_code)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btn_simpan.setText("Simpan");
        btn_simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_simpanActionPerformed(evt);
            }
        });
        jPanel3.add(btn_simpan);

        btn_update.setText("Update");
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });
        jPanel3.add(btn_update);

        btn_delete.setText("Delete");
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });
        jPanel3.add(btn_delete);

        btn_ambilData.setText("Ambil Data");
        btn_ambilData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ambilDataActionPerformed(evt);
            }
        });
        jPanel3.add(btn_ambilData);

        txt_label.setText("please wait..");

        tabel_petugas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tabel_petugas);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(188, 188, 188)
                .addComponent(txt_label))
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(ProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(txt_label)
                .addGap(6, 6, 6)
                .addComponent(ProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_simpanActionPerformed
        // TODO add your handling code here:
        TampilWorker tampilWorker=new TampilWorker();
        if(validasiInput()==true){
            String kode=txt_kodepetugas.getText();
            String username=txt_username.getText();
            String password=txt_password.getText();
            
           Petugas p=new Petugas();
            p.setPassword(password);
            p.setPetugasKd(kode);
            p.setUsername(username);
            
            petugasDao.insertPetugas(p);
            tabelModelPetugas.insertPetugas(p);
            tampilWorker.execute();
            loadData();
            resetForm();
        }
    }//GEN-LAST:event_btn_simpanActionPerformed

    private void bt_codeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_codeActionPerformed
        // TODO add your handling code here:
        String kodepetugas=petugasDao.setAutoNumber();
        txt_kodepetugas.setText(kodepetugas);
    }//GEN-LAST:event_bt_codeActionPerformed

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed
        // TODO add your handling code here:
        TampilWorker tw=new TampilWorker();
        int index=tabel_petugas.getSelectedRow();
        if(index!=-1){
            Petugas p=tabelModelPetugas.getPetugas(tabel_petugas.convertRowIndexToModel(index));
            if(validasiInput()==true){
                String kode=txt_kodepetugas.getText();
                String username= txt_username.getText();
                String password=txt_password.getText();
                p.setPassword(password);
                p.setPetugasKd(kode);
                 p.setUsername(username);
                 
                 petugasDao.updatePetugas(p);
                 tw.execute();
                 tabelModelPetugas.updatePetugas(index, p);
                 resetForm();
                 loadData();
            }
        }else{
            JOptionPane.showMessageDialog(null, "tekan button AMBIL DATA terlebih dahulu!");
        }
    }//GEN-LAST:event_btn_updateActionPerformed

    private void btn_ambilDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ambilDataActionPerformed
        // TODO add your handling code here:
        int index=tabel_petugas.getSelectedRow();
        if(index!=-1){
            Petugas p=tabelModelPetugas.getPetugas(tabel_petugas.convertRowIndexToModel(index));
            txt_kodepetugas.setText(p.getPetugasKd());
            txt_password.setText(p.getPassword());
            txt_username.setText(p.getUsername());
        }else{
            JOptionPane.showMessageDialog(null, "seleksi salah satu baris!");
        }
    }//GEN-LAST:event_btn_ambilDataActionPerformed

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
        // TODO add your handling code here:
        TampilWorker tampilWorker=new TampilWorker();
        int index=tabel_petugas.getSelectedRow();
        if(index!=-1){
            Petugas p=tabelModelPetugas.getPetugas(tabel_petugas.convertRowIndexToModel(index));
            if(JOptionPane.showConfirmDialog(null, "apakah anda ingin menghapus data ini?", "konfirmasi", 
                    JOptionPane.OK_CANCEL_OPTION)==JOptionPane.OK_OPTION){
                petugasDao.deletePetugas(p);
                tabelModelPetugas.deletePetugas(index);
                loadData();
                tampilWorker.execute();
            }
        }else{
            JOptionPane.showMessageDialog(null, "seleksi salah satu baris!");
        }
    }//GEN-LAST:event_btn_deleteActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar ProgressBar;
    private javax.swing.JButton bt_code;
    private javax.swing.JButton btn_ambilData;
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_simpan;
    private javax.swing.JButton btn_update;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabel_petugas;
    private javax.swing.JTextField txt_kodepetugas;
    private javax.swing.JLabel txt_label;
    private javax.swing.JTextField txt_password;
    private javax.swing.JTextField txt_username;
    // End of variables declaration//GEN-END:variables
}
