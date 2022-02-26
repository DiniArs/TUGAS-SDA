//Nomor 5
      //Tentukan hasil yang didapatkan ketika dilakukan perintah berikut ini:
      //remove(0), remove(3), remove(2)

import java.util.ArrayList;

public class nomor5 {
    public static void main(String[] args) {

        //String[] nama = {"A", "N", "D", "I"}

        ArrayList <String> nama = new ArrayList <String>();
            nama.add("A");
            nama.add("N");
            nama.add("D");
            nama.add("I");
        
        System.out.println("ArrayList sebelum diremove:");
            for(String var: nama)
            {  System.out.println(var);
            }
            nama.remove(0);
            //nama.remove(3);
            //nama.remove(2);

        System.out.println("ArrayList setelah diremove:");
           for(String var2: nama)
           {  System.out.println(var2);
           }

    }
}