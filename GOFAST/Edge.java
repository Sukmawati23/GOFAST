package proyeksdnls3;
public class Edge {
    //Deklarasi atribut dengan tipe data
    int asal;
    int tujuan;
    double bobot;
    
    //Constructor untuk inisialisasi objek
    public Edge(int asal, int tujuan, double bobot){
        this.asal = asal;
        this.tujuan = tujuan;
        this.bobot = bobot;
    }
}