package proyeksdnls3;
import java.util.*;
public class HasilJaDek {
    //Deklarasi atribut dengan tipe data yang bersifat private
    private List<Integer> jalur;
    private double biaya;
    
    //Constructor default untuk membuat objek tanpa parameter
    public HasilJaDek(){
        
    }
    
     //Constructor untuk inisialisasi objek
    public HasilJaDek(List<Integer> jalur, double biaya){
        this.jalur = jalur;
        this.biaya = biaya;
    }
    
    //Method untuk mengembalikan daftar jalur yang tersimpan dalam objek
    public List<Integer> getJalur() {
        return jalur;
    }
    
    //Method untuk mengembalikan total biaya yang tersimpan dalam objek
    public double getBiaya() {
        return biaya;
    }
}
