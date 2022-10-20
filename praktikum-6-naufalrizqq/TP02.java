/*Algoritma
1.Memasukkan baris berisi kalimat
2.Membuat method yang memiliki fungsi untuk menghilangkan huruf vokal
3.Memanggil method yang mempunyai fungsi menghilangkan huruf vokal dari kalimat yang diinput
4.Mengeluarkan output kalimat yang diinput tadi tanpa huruf vokal
*/
import java.util.Scanner;
public class TP02 {

	public static void main(final String[] args) {
		Scanner s = new Scanner(System.in);
		String kalimat = s.nextLine();
		System.out.println(hilangkanVokal(kalimat));
	}
	private static String hilangkanVokal(String h){
		return h.replaceAll("[aAiIuUeEoO]", "");
	}
}
