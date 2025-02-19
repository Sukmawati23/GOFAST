package proyeksdnls3;
public class Main {
    public static void main(String[] args) {
        //Menetapkan jumlah node dalam graph
        int jumlahSimpul = 28;

        //Membuat objek graph baru dengan jumlah simpul yang ditentukan
        Graph graphh = new Graph(jumlahSimpul);

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

        //Menetapkan simpul asal dan tujuan 
        int sumber = 0;
        int tujuan = 11;

        //Hitung Jalur Terpendek dari sumber - tujuan 
        HasilJaDek hasil = graphh.getjalurTerpendek(sumber, tujuan);
        double jarak = 14;
        double tarifPerKm = 5000;
        double minimumBiaya = 15000;

        //Hitung biaya pengiriman berdasarkan jarak dan tarif
        double biayaPengiriman = Math.max(jarak * tarifPerKm, minimumBiaya);

        //Tampilkan hasil Jalur terpendek dan biaya pengiriman 
        System.out.println("Jalur terpendek dari simpul " + daerah[sumber].toUpperCase() + " ke " + daerah[tujuan].toUpperCase() + " : " + hasil.getJalur());
        System.out.println("Biaya jalur terpendek\t: " + biayaPengiriman);
    }
}
