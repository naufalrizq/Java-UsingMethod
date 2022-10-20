/*Algoritma
1.Meminta masukan lirik lagu
2.Membuat method yang dapat merubah huruf vokal sesuai dengan panjang lirik
3.Memanggil method yang bisa merubah huruf vokal sesuai dengan panjang lirik ke dalam main
4.Mengeluarkan output lirik yang sudah dirubah
*/
import java.util.Scanner;

public class Jurnal02 {

	public static void main(final String[] args) {
		Scanner s = new Scanner(System.in);
		String kalimat = s.nextLine();
		System.out.println(mengubah(kalimat));
		s.close();
	}
	private static String mengubah(String kalimat){
		String[]vowels = {"a","e","i","o","u"};
		String merubah = vowels[kalimat.length()%5];
		String perubahan = kalimat.replaceAll("[aAeEiIoOuU]",merubah);
		return perubahan;
	}
}
