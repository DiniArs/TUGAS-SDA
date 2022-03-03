
import java.util.LinkedList;
import java.util.Stack;

public class Tugas2 {
    public static void main (String[] args) {
        System.out.println(" TUGAS 2 LINKED LIST ");
        System.out.println(" NAMA : DINI ARISANDI ");
        System.out.println(" NIM : 2111521012\n");
        
        
        //create LinkedList
        System.out.println(" LinkedList ");
        LinkedList <String> saya = new LinkedList<>();
        saya.add("D");
        saya.add("I");
        saya.add("N");
        saya.add("I");
        saya.add(" ");
        saya.add("A");
        saya.add("R");
        saya.add("I");
        saya.add("S");
        saya.add("A");
        saya.add("N");
        saya.add("D");
        saya.add("I");
        System.out.println(" Nama Saya : " +saya);
        System.out.println(" ...............................\n");
        
        //add LinkedList
        System.out.println(" 1. Add karakter lain yang Anda inginkan ");
        saya.addFirst("N");
        saya.addFirst("A");
        saya.add(" ");
        saya.addLast("E");
        System.out.println(" Nama Saya : "+saya);
        System.out.println("\n");
        
        //set LinkedList
        System.out.println(" 2. Sisipkan karakter lain yang Anda inginkan");
        saya.set(6, "-");
        saya.set(15, "-");
        System.out.println(" Nama Saya : " +saya);
        System.out.println("\n");
        
        //delete LinkedList
        System.out.println(" 3. Hapus beberapa karakter yang ingin Anda hapus");
        saya.removeFirst();
        saya.removeFirst();
        saya.removeLast();
        saya.remove(4);
        saya.remove(12);
        
        System.out.println(" Nama Saya : " +saya);
        System.out.println(" \n ");
        
        //fungsi Pop dan Push
        System.out.println(" 4. Buat fungsi Pop dan Push pada projek Anda ");
    
        System.out.println(" PUSH  ");
        //Push
        saya.push("halo");
        saya.push("dini");
        saya.push("selamat");
        saya.push("belajar");
        System.out.println(" Data pada Stack :" +saya);
        System.out.println(" \n");
        //Pop
        System.out.println(" POP");
        saya.pop();
        System.out.println(" Data dihapus dari Stack : "+saya);
        saya.pop();
        System.out.println(" Data dihapus dari Stack : "+saya);
        saya.pop();
        System.out.println(" Data dihapus dari Stack : "+saya);
        
        
        
        
        
        
    }
}