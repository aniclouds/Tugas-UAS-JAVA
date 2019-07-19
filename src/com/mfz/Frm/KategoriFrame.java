/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mfz.Frm;

import com.mfz.Dao.KategoriDao;
import com.mfz.Tabelmodel.TabelModelKategori;
import com.mfz.entity.Kategori;
import com.mfz.service.KategoriService;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.SwingWorker;

/**
 *
 * @author DICKA
 */
public class KategoriFrame extends javax.swing.JFrame {

    
    private KategoriService kategoriDao=new KategoriDao();
    private TabelModelKategori tabelModelKategori=new TabelModelKategori();
    private Kategori k;
    
    public KategoriFrame() {
        initComponents();
        setLocationRelativeTo(null);
        tabel_kategori.setModel(tabelModelKategori);
        loadData();
        txt_label.setVisible(false);
        ProgressBar.setVisible(false);
    }
    
    private void loadData(){
        List<Kategori> kategoris=kategoriDao.getkatKategori();
        tabelModelKategori.setData(kategoris);
    }

    class TampilWorker extends SwingWorker{

        @Override
        protected Object doInBackground() throws Exception {
            for(int i=0; i<=100; i++){
                try {
                    Thread.sleep(10);
                    ProgressBar.setVisible(true);
                    txt_label.setVisible(true);
                    ProgressBar.setValue(i);
                    ProgressBar.setIndeterminate(true);
                } catch (Exception e) {
                }
            }
            return null;
        }

        @Override
        protected void done() {
            String kode=txt_kodekategori.getText();
            String kategorii=txt_kategori.getText();
            ProgressBar.setVisible(false);
            txt_label.setVisible(false);
            JOptionPane.showMessageDialog(null, "Success..");
            resetForm();
        }
       
    }
    
    private boolean validasiInput(){
        boolean valid=false;
        if(txt_kategori.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "kode kategori tidak boleh kosong!");
        }else if(txt_kategori.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "kategori tidak boleh kosong!");
        }else{
            valid=true;
        }
        return valid;
    }
    
    private void resetForm(){
        txt_kategori.setText("");
        txt_kodekategori.setText("");
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_kodekategori = new javax.swing.JTextField();
        txt_kategori = new javax.swing.JTextField();
        txt_label = new javax.swing.JLabel();
        ProgressBar = new javax.swing.JProgressBar();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel_kategori = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        btn_simpan = new javax.swing.JButton();
        btn_update = new javax.swing.JButton();
        btn_delete = new javax.swing.JButton();
        btn_ambilData = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Input Kategori Obat");
        jPanel1.add(jLabel1);

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setText("kd_kategori :");

        jLabel3.setText("kategori :");

        txt_label.setText("Please wait..");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txt_label)
                .addGap(118, 118, 118))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_kodekategori)
                            .addComponent(txt_kategori, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(ProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txt_kodekategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_kategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabel_kategori.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tabel_kategori);

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

        btn_delete.setText("Detele");
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_simpanActionPerformed
        // TODO add your handling code here:
        TampilWorker tampilWorker=new TampilWorker();
        if(validasiInput()==true){
            String kode=txt_kodekategori.getText();
            String kateoris=txt_kategori.getText();
            Kategori k=new Kategori();
            k.setKategori(kateoris);
            k.setKategoriKd(kode);
            
            kategoriDao.insertKategori(k);
            tabelModelKategori.insertKategori(k);
            tampilWorker.execute();
            loadData();
            resetForm();
        }
    }//GEN-LAST:event_btn_simpanActionPerformed

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
        // TODO add your handling code here:
        TampilWorker tampilWorker=new TampilWorker();
        int index=tabel_kategori.getSelectedRow();
        if(index!=-1){
           Kategori k=tabelModelKategori.getKategori(tabel_kategori.convertRowIndexToModel(index));
           if(JOptionPane.showConfirmDialog(null, "apakah anda yakin ingin menghapus data ini?", 
                   "konfirmasi", JOptionPane.OK_CANCEL_OPTION)==JOptionPane.OK_OPTION){
               kategoriDao.deleteKategori(k);
               tampilWorker.execute();
               tabelModelKategori.deleteKategori(index);
               loadData();
           }
        }else{
            JOptionPane.showMessageDialog(null, "seleksi salah satu baris!");
        }
    }//GEN-LAST:event_btn_deleteActionPerformed

    private void btn_ambilDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ambilDataActionPerformed
        // TODO add your handling code here:
        int index=tabel_kategori.getSelectedRow();
        if(index!=-1){
            Kategori k=tabelModelKategori.getKategori(tabel_kategori.convertRowIndexToModel(index));
            txt_kategori.setText(k.getKategori());
            txt_kodekategori.setText(k.getKategoriKd());
        }else{
            JOptionPane.showMessageDialog(null, "seleksi salah satu baris!");
        }
    }//GEN-LAST:event_btn_ambilDataActionPerformed

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed
        // TODO add your handling code here:
        TampilWorker tw=new TampilWorker();
        int index=tabel_kategori.getSelectedRow();
        if(index!=-1){
            Kategori k=tabelModelKategori.getKategori(tabel_kategori.convertRowIndexToModel(index));
            if(validasiInput()==true){
                String kode=txt_kodekategori.getText();
                String kategorii=txt_kategori.getText();
                
                k.setKategori(kategorii);
                k.setKategoriKd(kode);
                kategoriDao.updateKategori(k);
                tw.execute();
                tabelModelKategori.updateKategori(index, k);
                resetForm();
                loadData();
                
            }
        }else{
            JOptionPane.showMessageDialog(null, "tekan button AMBIL DATA terlebih dahulu!");
        }
    }//GEN-LAST:event_btn_updateActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar ProgressBar;
    private javax.swing.JButton btn_ambilData;
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_simpan;
    private javax.swing.JButton btn_update;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabel_kategori;
    private javax.swing.JTextField txt_kategori;
    private javax.swing.JTextField txt_kodekategori;
    private javax.swing.JLabel txt_label;
    // End of variables declaration//GEN-END:variables
}
