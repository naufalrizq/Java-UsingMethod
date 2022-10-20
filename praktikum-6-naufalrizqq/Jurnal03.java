/*Algoritma
1.Memasukkan radius dan height dari kerucut
2.Membuat method luas permukaan
3.Memasukkan rumus yang akan digunakan untuk menghitung luas permukaan kerucut
4.Memanggil method luas permukaan ke dalam main untuk mengeluarkan output
 */

import java.util.Scanner;
import java.lang.Math;
import java.text.DecimalFormat;
public class Jurnal03 {

	public static void main(final String[] args) {
		Scanner s = new Scanner(System.in);
		int radius = s.nextInt();
		int height = s.nextInt();

		luasPermukaan(radius,height);
		
	}
	private static double luasPermukaan(int r,int h){
		//final double PI=3.14;
		double luper = Math.PI*r*(r+ Math.sqrt(Math.pow(r,2) + Math.pow(h,2)));
		DecimalFormat CommaFormat;
		CommaFormat=new DecimalFormat("###.###");
		System.out.println(CommaFormat.format(luper));
		return luper;
	}
	//private static double r(double d) {
		//return 0;
	//}
}
	

