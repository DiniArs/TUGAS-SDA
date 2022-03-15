import java.util.LinkedList;
import java.util.Queue;

public class Tugas_queue {
    public static void main(String[] args) {
        
        // menginisialisasi interface queque menggunakan objek LinkedList
        Queue<String> q = new LinkedList<>(); 
        
        //menambahkan data baru ke list queue
        q.add("Dila");
        q.add("Fani");
        q.add("Dono");
        q.add("Abrar");
        q.add("Sandi");
        
        System.out.println(" Daftar Antrian : "+q);
        System.out.println(" Jumlah Antrian : "+q.size());
        System.out.println( );
      
        
        System.out.println(" Antrian Teratas : "+q.peek());
        System.out.println( );
        System.out.println(" Antrian Sedang Diproses: "+q.poll());
        System.out.println(" Lihat Daftar Antrian : "+q);
        System.out.println(" Jumlah Antrian Sekarang :"+q.size());
        System.out.println(" Antrian Teratas : "+q.peek());
        System.out.println( );
        System.out.println(" Antrian Sedang Diproses: "+q.poll());
        System.out.println(" Lihat Daftar Antrian : "+q);
        System.out.println(" Jumlah Antrian Sekarang :"+q.size());
        System.out.println( );
        System.out.println(" Reset Daftar Antrian : "+q.removeAll(q));
        System.out.println(" Daftar Antrian Terbaru : "+q);
        System.out.println(" Total Antrian : "+q.size());
        
        
        
        }      
    }     