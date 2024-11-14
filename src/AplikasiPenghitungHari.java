import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author Acer
 */
public class AplikasiPenghitungHari extends javax.swing.JFrame {

    /**
     * Creates new form AplikasiPenghitungHari
     */
    public AplikasiPenghitungHari() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ComboBoxBulanAwal = new javax.swing.JComboBox<>();
        SpinnerTahunAwal = new javax.swing.JSpinner();
        ButtonHitung = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        LabelHasil = new javax.swing.JLabel();
        LabelSelisihHari = new javax.swing.JLabel();
        ComboBoxBulanAkhir = new javax.swing.JComboBox<>();
        SpinnerTahunAkhir = new javax.swing.JSpinner();
        ButtonHitungSelisih = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("Pilih Bulan:");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Pilih Tahun:");

        ComboBoxBulanAwal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Bulan Awal", "Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli", "Agustus", "September", "Oktober", "November", "Desember", "" }));
        ComboBoxBulanAwal.setName(""); // NOI18N

        SpinnerTahunAwal.setModel(new javax.swing.SpinnerNumberModel(2024, 1900, 2200, 1));

        ButtonHitung.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ButtonHitung.setText("Hitung Hari");
        ButtonHitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonHitungActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("Hasil Jumlah Hari:");

        ComboBoxBulanAkhir.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Bulan Akhir", "Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli", "Agustus", "September", "Oktober", "November", "Desember", "" }));

        SpinnerTahunAkhir.setModel(new javax.swing.SpinnerNumberModel(2024, 1899, 2200, 1));

        ButtonHitungSelisih.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ButtonHitungSelisih.setText("Selisih Hari");
        ButtonHitungSelisih.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonHitungSelisihActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ButtonHitung, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LabelHasil, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(87, 87, 87)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ButtonHitungSelisih, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LabelSelisihHari, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(SpinnerTahunAkhir, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(SpinnerTahunAwal, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(85, 85, 85)
                                    .addComponent(ComboBoxBulanAkhir, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(ComboBoxBulanAwal, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(201, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(ComboBoxBulanAwal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(82, 82, 82)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(SpinnerTahunAwal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboBoxBulanAkhir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(LabelHasil, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SpinnerTahunAkhir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ButtonHitung)
                            .addComponent(ButtonHitungSelisih))
                        .addGap(32, 32, 32)
                        .addComponent(LabelSelisihHari, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(210, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonHitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonHitungActionPerformed
        // Ambil nilai bulan dan tahun dari JComboBox dan JSpinner
    int bulan = ComboBoxBulanAwal.getSelectedIndex() + 1; // Januari dimulai dari 0
    int tahun = (int) SpinnerTahunAwal.getValue();
    
        // Membuat objek LocalDate pada tanggal 1 di bulan dan tahun tersebut
    LocalDate date = LocalDate.of(tahun, bulan, 1);
    int daysInMonth = date.lengthOfMonth(); // Menghitung jumlah hari
    
    // Tampilkan hasil di label
    LabelHasil.setText("Jumlah hari: " + daysInMonth);
    
        boolean isLeapYear = date.isLeapYear();
String leapYearInfo = isLeapYear ? " (Tahun Kabisat)" : "";
LabelHasil.setText("Jumlah hari: " + daysInMonth + leapYearInfo);

    }//GEN-LAST:event_ButtonHitungActionPerformed

    private void ButtonHitungSelisihActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonHitungSelisihActionPerformed
        // Ambil nilai bulan dan tahun dari JComboBox dan JSpinner untuk tanggal awal
    int bulanAwal = ComboBoxBulanAwal.getSelectedIndex() + 1;
    int tahunAwal = (int) SpinnerTahunAwal.getValue();
    
    // Ambil nilai bulan dan tahun dari JComboBox dan JSpinner untuk tanggal akhir
    int bulanAkhir = ComboBoxBulanAkhir.getSelectedIndex() + 1;
    int tahunAkhir = (int) SpinnerTahunAkhir.getValue();
    
    // Buat objek LocalDate untuk tanggal awal dan akhir
    LocalDate tanggalAwal = LocalDate.of(tahunAwal, bulanAwal, 1);
    LocalDate tanggalAkhir = LocalDate.of(tahunAkhir, bulanAkhir, 1);

    // Hitung selisih hari antara tanggal awal dan tanggal akhir
    long selisihHari = ChronoUnit.DAYS.between(tanggalAwal, tanggalAkhir);

    // Tampilkan hasil selisih hari di label
    LabelSelisihHari.setText("Selisih hari: " + selisihHari + " hari");
    }//GEN-LAST:event_ButtonHitungSelisihActionPerformed

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
            java.util.logging.Logger.getLogger(AplikasiPenghitungHari.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AplikasiPenghitungHari.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AplikasiPenghitungHari.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AplikasiPenghitungHari.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AplikasiPenghitungHari().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonHitung;
    private javax.swing.JButton ButtonHitungSelisih;
    private javax.swing.JComboBox<String> ComboBoxBulanAkhir;
    private javax.swing.JComboBox<String> ComboBoxBulanAwal;
    private javax.swing.JLabel LabelHasil;
    private javax.swing.JLabel LabelSelisihHari;
    private javax.swing.JSpinner SpinnerTahunAkhir;
    private javax.swing.JSpinner SpinnerTahunAwal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}