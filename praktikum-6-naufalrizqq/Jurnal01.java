/*Algoritma
1.Memasukkan inputan nama1,nama2,dan waktu
2.Membuat 2 buah method yaitu method nama1 & method nama2
3.Memasukkan kondisi jika waktu lebih dari jam 6 dan kurang dari jam 11 maka "Selamat Pagi"
4.Memasukkan kondisi jika waktu lebih dari jam 12 dan kurang dari jam 14 maka "Selamat Siang"
5.Memasukkan kondisi jika waktu lebih dari jam 15 dan kurang dari jam 17 maka "Selamat Sore"
6.Memasukkan kondisi jika waktu lebih dari jam 18 dan kurang dari jam 5 maka "Selamat Malam"
7.Memanggil method nama1 & method nama2 pada tiap tiap kondisi
8.Mengeluarkan output dari method 1 & method 2 beserta dengan output yang sesuai dengan kondisi

*/
import java.util.Scanner;

public class Jurnal01{
    public static void main(String[]args) {
        Scanner s = new Scanner(System.in);
        String nama1= s.nextLine();
        String nama2= s.nextLine();
        int waktu = s.nextInt();

        if(waktu >=6  && waktu <= 11){
            memanggil(nama1);
            System.out.println(" Selamat pagi.");
            memanggil2(nama2);
            System.out.print(" Selamat pagi.");
        }else if(waktu >=12 && waktu <=14){
            memanggil(nama1);
            System.out.println(" Selamat siang.");
            memanggil2(nama2);
            System.out.print(" Selamat siang.");
        }else if(waktu >=15 && waktu <=17){
            memanggil(nama1);
            System.out.println(" Selamat sore.");
            memanggil2(nama2);
            System.out.print(" Selamat sore.");
        }else if (waktu >=18 && waktu <=5){
            memanggil(nama1);
            System.out.println(" Selamat malam.");
            memanggil(nama2);
            System.out.print(" Selamat malam.");

        }
        }
        
    private static void memanggil(String nama1){
        System.out.print("Halo, "+nama1+".");      
        
}
    private static void memanggil2(String nama2){
        System.out.print("Halo, "+nama2+".");
        
    }
}

            

        

    
