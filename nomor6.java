//Nomor 6
    //Tentukan hasil yang didapatkan ketika dilakukan perintah berikut ini:
    //add(0,e), add(2,f), add(3,g), add(6,h), add(-3,j)

import java.util.ArrayList;
public class nomor6 {
    public static void main(String[] args) {
        
        //String[] nama = {"A", "N", "D", "I"};
    ArrayList<String> nama = new ArrayList<String>();
        nama.add("A");
        nama.add("N");
        nama.add("D");
        nama.add("I");

    nama.add(0,"e");
    System.out.println("Index 0 setelah ditambahkan elemen e" + nama);

    nama.add(2,"f");
    System.out.println("Index 2 setelah ditambahkan elemen f " + nama);

    nama.add(3,"g");
    System.out.println("Index 3 setelah ditambahkan elemen g " + nama);

    nama.add(4,"h");
    System.out.println("Index 4 setelah ditambahkan elemen h  " + nama);

    nama.add(6,"h");
    System.out.println("Index 6 setelah ditambahkan elemen h  " + nama);

    nama.add(-3,"j");
    System.out.println("Index -3 setelah ditambahkan elemen j " + nama);
    }
}