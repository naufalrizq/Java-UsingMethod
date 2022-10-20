/*Algoritma
1.Memasukkan nama bangun datar dan bilangan bulat yang akan digunakan sebagai sisi,panjang,lebar,alas,tinggi,diameter
2.Membuat method yang masing masing berisi rumus menghitung luas dan keliling masing masing bangun datar
3.Memanggil method pada tiap case bangun datar yang diinput 
4.Menghitung luas dan keliling bangun datar tersebut 
5.Mengeluarakan output luas dan keliling bangun datar sesuai dengan nama bangun datar yang diinput
*/
import java.util.Scanner;
public class TP03 {


    private static void lingkaran(int diameter,int jari2){
       System.out.print(3.14*jari2*jari2+" ");
       System.out.print(2*3.14*jari2);
    }
    private static void persegi(int sisi){
        System.out.print(sisi*sisi+" ");
        System.out.print(4*sisi);
    }
    private static void segitiga(int alas ,int tinggi){
        System.out.print(alas*tinggi/2+" ");
        System.out.print(alas*tinggi);
    }
    private static void persegiPanjang(int panjang,int lebar){
        System.out.print(panjang * lebar + " ");
        System.out.print(2*(panjang + lebar));
    }
    

    public static void main(final String[] args) {
		Scanner s = new Scanner(System.in);
		String bangundatar = s.nextLine();

		switch (bangundatar) {
			case "Persegi":
            int sisi;
            sisi = s.nextInt();
            persegi(sisi);	
				break;
			case "Persegi Panjang":
            int panjang,lebar;
            panjang = s.nextInt();
            lebar = s.nextInt();
			persegiPanjang(panjang,lebar);		
				break;
			case "Segitiga":
            int alas,tinggi;
            alas = s.nextInt();
            tinggi = s.nextInt();
            segitiga(alas,tinggi);
				break;
			case "Lingkaran":
            int diameter,jari2;
            diameter = s.nextInt();
            jari2 = diameter/2;
            lingkaran(diameter,jari2);
				break;
		
			default:
				break;
		}
		
	}
}