package proyeksdnls3;
import java.util.*;
public class Graph {
    //Deklarasi atribut dengan tipe data yang bersifat private
    private int jumlahNode;
    private List<Edge>[] daftarTetangga;
    
    //Constructor untuk inisialisasi graf dengan jumlah node yang ditentukan 
    public Graph(int jumlahNode) {
        this.jumlahNode = jumlahNode;
        daftarTetangga = new ArrayList[jumlahNode];
        for (int i = 0; i < jumlahNode; i++) {
            daftarTetangga[i] = new ArrayList<>();
        }
    }
    
    //Method untuk menambahkan tepi baru ke graf
    public void addEdge(int asal, int tujuan, double bobot) {
        Edge edge = new Edge(asal, tujuan, bobot);
        daftarTetangga[asal].add(edge);
    }

    //Method menggunakan algoritma kruskal untuk menemukan jalur terpendek antara dua node
    HasilJaDek getjalurTerpendek(int sumber, int tujuan) {
        //Langkah 1 : Kumpulkan semua sisi dari graf 
        List<Edge> semuaSisi = new ArrayList<>();
        for (int i = 0; i < daftarTetangga.length; i++) {
            for (int j = 0; j < daftarTetangga[i].size(); j++) {
                semuaSisi.add(daftarTetangga[i].get(j));
            }
        }

        // Langkah 2: Urutkan sisi berdasarkan bobot dalam urutan menaik
        for (int i = 0; i < semuaSisi.size(); i++) {
            for (int j = i + 1; j < semuaSisi.size(); j++) {
                if (semuaSisi.get(i).bobot > semuaSisi.get(j).bobot) {
                    Edge temp = semuaSisi.get(i);
                    semuaSisi.set(i, semuaSisi.get(j));
                    semuaSisi.set(j, temp);
                }
            }
        }

        //Langkah 3: Siapkan array induk dan tingkat untuk mendeteksi siklus
        int[] induk = new int[jumlahNode]; 
        int[] tingkat = new int[jumlahNode]; 
        for (int i = 0; i < jumlahNode; i++) {
            induk[i] = i; 
            tingkat[i] = 0; 
        }

        //Langkah 4: Iterasi untuk membentuk jalur terpendek dengan menambahkan sisi satu per satu
        List<Edge> jalurTerpendek = new ArrayList<>();
        double totalBiayaJarak = 0;

        for (int i = 0; i < semuaSisi.size(); i++) {
            Edge sisi = semuaSisi.get(i);

            // Cari induk untuk kedua simpul
            int indukAsal = temukanInduk(sisi.asal, induk);
            int indukTujuan = temukanInduk(sisi.tujuan, induk);

            // Jika induk kedua simpul berbeda, tambahkan sisi ke jalur terpendek
            if (indukAsal != indukTujuan) {
                jalurTerpendek.add(sisi);
                totalBiayaJarak += sisi.bobot; 
                gabungkanInduk(indukAsal, indukTujuan, induk, tingkat);

                // Jika semua node sudah terhubung, hentikan pencarian
                if (temukanInduk(sumber, induk) == temukanInduk(tujuan, induk)) {
                    break;
                }
            }
        }
        
        // Tampilkan hasil MST
        System.out.println("Edge yang termasuk dalam MST");
        for (int i = 0; i < jalurTerpendek.size(); i++) { 
            Edge edge = jalurTerpendek.get(i);
            System.out.printf("(%d - %d) \t: %.2f%n", edge.asal, edge.tujuan, edge.bobot);
        }
        System.out.printf("Total Bobot MST\t: %.2f%n", totalBiayaJarak);

        // Langkah 5: Buat jalur dari node asal ke tujuan
        List<Integer> jalurNode = new ArrayList<>();
        for (int i = 0; i < jalurTerpendek.size(); i++) {
            Edge sisi = jalurTerpendek.get(i);
            if (!jalurNode.contains(sisi.asal)) {
                jalurNode.add(sisi.asal);
            }
            if (!jalurNode.contains(sisi.tujuan)) {
                jalurNode.add(sisi.tujuan);
            }
        }

        // Langkah 6: Kembalikan hasil jalur terpendek
        return new HasilJaDek(jalurNode, totalBiayaJarak);
    }

    // Metode untuk menemukan induk dari simpul
    private int temukanInduk(int simpul, int[] induk) {
        if (induk[simpul] != simpul) {
            induk[simpul] = temukanInduk(induk[simpul], induk);
        }
        return induk[simpul];
    }

    // Metode untuk menggabungkan dua pohon berdasarkan tingkat
    private void gabungkanInduk(int induk1, int induk2, int[] induk, int[] tingkat) {
        if (tingkat[induk1] > tingkat[induk2]) {
            induk[induk2] = induk1; 
        } else if (tingkat[induk1] < tingkat[induk2]) {
            induk[induk1] = induk2; 
        } else {
            induk[induk2] = induk1; 
            tingkat[induk1]++;
        }
    }
}
