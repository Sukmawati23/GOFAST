package proyeksdnls3;
import java.util.ArrayList;
import java.util.List;
public class GOSEND extends javax.swing.JFrame {

    //Menetapkan jumlah node dalam graph
    int jumlahSimpul = 28;

    //Membuat objek graph baru dengan jumlah simpul yang ditentukan
    Graph graphh = new Graph(jumlahSimpul);

    public GOSEND() {
        initComponents();//Inisialisasi komponen GUI
        setTitle("Pengiriman Barang dengan Rute Terpendek");//Title
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        panelAsTu = new javax.swing.JPanel();
        asal = new javax.swing.JLabel();
        tujuan = new javax.swing.JLabel();
        pilihanAsal = new javax.swing.JComboBox<>();
        pilihanTujuan = new javax.swing.JComboBox<>();
        tombolCheck = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jarak = new javax.swing.JLabel();
        biaya = new javax.swing.JLabel();
        rute = new javax.swing.JLabel();
        isiJarak = new javax.swing.JTextField();
        isiBiaya = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        isiRute = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(247, 247, 247));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("GOSEND");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(241, 241, 241)
                .addComponent(jLabel1)
                .addContainerGap(253, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                .addGap(27, 27, 27))
        );

        panelAsTu.setBackground(new java.awt.Color(51, 51, 51));
        panelAsTu.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Asal & Tujuan", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        asal.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        asal.setForeground(new java.awt.Color(255, 255, 255));
        asal.setText("Asal");

        tujuan.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tujuan.setForeground(new java.awt.Color(255, 255, 255));
        tujuan.setText("Tujuan");

        pilihanAsal.setFont(new java.awt.Font("Yu Gothic Medium", 1, 12)); // NOI18N
        pilihanAsal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Pilih Asal --", "Paingan", "Paingan 2", "Krodan", "Ringroad", "Laksa Adisucipto", "Urip Sumoharjo", "Tentara Pelajar", "Tentara Rakyat Mataram", "Pembela Tanah Air", "Hos Cokroaminoto", "Yogyakarta", "R.E Martadinata" }));
        pilihanAsal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pilihanAsalActionPerformed(evt);
            }
        });

        pilihanTujuan.setFont(new java.awt.Font("Yu Gothic Medium", 1, 12)); // NOI18N
        pilihanTujuan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Pilih Tujuan -- ", "Paingan", "Paingan 2", "Krodan", "Ringroad", "Laksa Adisucipto", "Urip Sumoharjo", "Tentara Pelajar", "Tentara Rakyat Mataram", "Pembela Tanah Air", "Hos Cokroaminoto", "Yogyakarta", "R.E Martadinata" }));

        tombolCheck.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        tombolCheck.setText("CHECK");
        tombolCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolCheckActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelAsTuLayout = new javax.swing.GroupLayout(panelAsTu);
        panelAsTu.setLayout(panelAsTuLayout);
        panelAsTuLayout.setHorizontalGroup(
            panelAsTuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAsTuLayout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addGroup(panelAsTuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tujuan, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(asal, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelAsTuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tombolCheck)
                    .addComponent(pilihanAsal, 0, 226, Short.MAX_VALUE)
                    .addComponent(pilihanTujuan, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelAsTuLayout.setVerticalGroup(
            panelAsTuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAsTuLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(panelAsTuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pilihanAsal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(asal))
                .addGap(24, 24, 24)
                .addGroup(panelAsTuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tujuan)
                    .addComponent(pilihanTujuan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addComponent(tombolCheck)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Informasi Pengiriman dengan Rute Terpendek", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        jarak.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jarak.setForeground(new java.awt.Color(255, 255, 255));
        jarak.setText("Jarak");

        biaya.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        biaya.setForeground(new java.awt.Color(255, 255, 255));
        biaya.setText("Biaya");

        rute.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        rute.setForeground(new java.awt.Color(255, 255, 255));
        rute.setText("Rute");

        isiRute.setColumns(20);
        isiRute.setRows(5);
        jScrollPane1.setViewportView(isiRute);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jarak, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(biaya, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rute, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 356, Short.MAX_VALUE)
                    .addComponent(isiBiaya)
                    .addComponent(isiJarak))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jarak)
                    .addComponent(isiJarak, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(biaya)
                    .addComponent(isiBiaya, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rute)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(58, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(panelAsTu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(panelAsTu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tombolCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolCheckActionPerformed
        //Atribut untuk menyimpan index kota asal dan tujuan
        int asalIndex = 0;
        int tujuanIndex = 0;

        //Memeriksa apakah pilihan asal dan tujuan telah dipilih 
        if (pilihanAsal.getSelectedItem() == null || pilihanTujuan.getSelectedItem() == null) {
            tombolCheck.setEnabled(false);

            //Menampilkan dan mengaktifkan komponen jarak, biaya, rute
            jarak.isVisible();
            biaya.isEnabled();
            rute.isEnabled();
        } else {
            //Mengambil model comboBox untuk pilihan asal dan tujuan 
            javax.swing.ComboBoxModel<String> modelAsal = pilihanAsal.getModel();
            javax.swing.ComboBoxModel<String> modelTujuan = pilihanTujuan.getModel();

            //Mengambil item terpilih dari combo box
            String asal = modelAsal.getSelectedItem().toString().toLowerCase();
            String tujuan = modelTujuan.getSelectedItem().toString().toLowerCase();
            System.out.println("Asal\t: " + asal);
            System.out.println("Tujuan\t: " + tujuan);
            System.out.println();

            //Array untuk menyimpan nama daerah yang berhubungan dengan setiap simpul
            String[] daerah = {"Paingan", "Paingan 2", "Krodan", "Ringroad", "Laksda Adisucipto", "Urip Sumoharjo",
                "Tentara Pelajar", "Tentara Rakyat Mataram", "Pembela Tanah Air", "Hos Cokroaminoto",
                "Yogyakarta", "R.E Martadinata"};

            // Tambahkan edge dari mana ke mana
            graphh.addEdge(0, 1, 0.14); // Paingan - Paingan 2
            graphh.addEdge(0, 3, 10.4); //Paingan - Ringroad
            graphh.addEdge(0, 4, 6.3); //Paingan - Laksa Adisucipto
            graphh.addEdge(1, 2, 0.6); // Paingan 2 -  Krodan
            graphh.addEdge(1, 3, 2.4); //Paingan 2 - Ringroad
            graphh.addEdge(1, 8, 12.8); //Paingan - Pembela Tanah Air 
            graphh.addEdge(2, 3, 6.4); // Krodan -  Ringroad
            graphh.addEdge(2, 6, 11.8); //Krodan - Tentara 
            graphh.addEdge(2, 8, 12.1);//Krodan - Pembela Tanah Air 
            graphh.addEdge(2, 10, 3.9); //Krodan - Yogyakarta
            graphh.addEdge(3, 4, 5.3); // Ringroad -  Laksa Adisucipto
            graphh.addEdge(3, 6, 7.9); //Ringroad - Tentara Pelajar 
            graphh.addEdge(4, 5, 2.8); // Laksa Adisucipto -  Urip Sumoharjo
            graphh.addEdge(5, 6, 3.3); // Urip Sumoharjo -  Tentara Pelajar
            graphh.addEdge(6, 7, 0.85); // Tentara Pelajar -  Tentara Rakyat Mataram
            graphh.addEdge(7, 8, 1.1); // Tentara Rakyat Mataram -  Pembela Tanah Air
            graphh.addEdge(7, 10, 3.1); //Tentara Rakyat Mataram - Yogyakarta
            graphh.addEdge(7, 11, 2.6); //Tentara Rakyat Mataram - R.E Martadinata
            graphh.addEdge(8, 9, 0.4); // Pembela Tanah Air -  Hos Cokroaminoto
            graphh.addEdge(8, 10, 2.5); //Pembela Tanah Air - Yogyakarta
            graphh.addEdge(9, 10, 2.5); // Hos Cokroaminoto -  Yogyakarta
            graphh.addEdge(9, 11, 1.1); //Hos Cokroaminoto - R.E Martadinata
            graphh.addEdge(10, 11, 1.8); // Yogyakarta -  R.E Martadinata
            graphh.addEdge(0, 2, 0.6); // Paingan -  Krodan (alternatif)
            graphh.addEdge(3, 5, 3.5); // Ringroad -  Urip Sumoharjo (alternatif)
            graphh.addEdge(6, 9, 2.0); // Tentara Pelajar -  Hos Cokroaminoto (alternatif)
            graphh.addEdge(2, 11, 14); // Krodan ke R.E Martadinata (alternatif)

            //Menentukan index kota asal dan tujuan berdasarkan nama
            for (int i = 0; i < daerah.length; i++) {
                if (asal.equalsIgnoreCase(daerah[i])) {
                    asalIndex = i;
                }
                if (tujuan.equalsIgnoreCase(daerah[i])) {
                    tujuanIndex = i;
                }
            }

            //Hitung Jalur terpendek dari asal ke tujuan 
            HasilJaDek hasil = graphh.getjalurTerpendek(asalIndex, tujuanIndex);

            //Tampil Hasil jarak
            isiJarak.setText(String.valueOf(hasil.getBiaya()) + " km");

            //Mendapatkan isi List<Integer> dalam bentuk array
            List<Integer> ruteIndex = hasil.getJalur();
            Integer[] data = ruteIndex.toArray(new Integer[ruteIndex.size()]);
            List<String> ruteKota = new ArrayList<>();

            //Mengonversi indeks jalur menjadi nama kota
            for (int i = 0; i < data.length; i++) {
                System.out.println("Data\t: " + data[i]);
                for (int j = 0; j < daerah.length; j++) {
                    if (data[i] == j) {
                        ruteKota.add(String.valueOf(daerah[j]));
                    }
                }
            }

            //Format rute agar ditampilkan dalam bentuk paragraf
            String ruteParagraf = "";
            for (int i = 0; i < ruteKota.size(); i++) {
                ruteParagraf += ruteKota.get(i);
                if (i != ruteKota.size() - 1) {
                    ruteParagraf += " - ";
                }
            }

            //Tampil rute dengan format
            isiRute.setText(ruteParagraf);

            //Hitung biaya pengiriman sesuai jaraknya 
            double jarak = 14;
            double tarifPerKm = 5000;
            double minimumBiaya = 15000;

            // Hitung biaya pengiriman
            double biayaPengiriman = Math.max(jarak * tarifPerKm, minimumBiaya);
            System.out.println("Biaya\t: " + biayaPengiriman);
            isiBiaya.setText(String.valueOf("Rp " + biayaPengiriman));
        }
    }//GEN-LAST:event_tombolCheckActionPerformed

    private void pilihanAsalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pilihanAsalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pilihanAsalActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GOSEND().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel asal;
    private javax.swing.JLabel biaya;
    private javax.swing.JTextField isiBiaya;
    private javax.swing.JTextField isiJarak;
    private javax.swing.JTextArea isiRute;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jarak;
    private javax.swing.JPanel panelAsTu;
    private javax.swing.JComboBox<String> pilihanAsal;
    private javax.swing.JComboBox<String> pilihanTujuan;
    private javax.swing.JLabel rute;
    private javax.swing.JButton tombolCheck;
    private javax.swing.JLabel tujuan;
    // End of variables declaration//GEN-END:variables
}
