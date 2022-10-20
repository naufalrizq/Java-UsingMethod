/*Algoritma
1.Meminta masukkan tiga bilangan riil yang menyatakan suhu terendah,suhu rata-rata,dan suhu tertinggi dalam Fahrenheit
2.Mengkonversi bilangan riil yang sudah dimasukkan tadi dengan rumus 
3.Membuat method bernama konversiCelcius yang berisi rumus konversi fahrenheit ke celcius
4.Memanggil method di tiap perhitungan suhu terendah,suhu rata rata,suhu maksimum
5.Mengeluarkan output bilangan riil yang sudah dikonversi menjadi celcius

*/
import java.util.Scanner;

import java.text.DecimalFormat;
public class TP01 {

	public static void main(final String[] args) {
		Scanner s = new Scanner(System.in);
		float temR3,temR2,temR1,min,avg,max;
		
		temR1 = s.nextFloat();
		temR2 = s.nextFloat();
		temR3 = s.nextFloat();

	    min = konversiCelcius(temR1);
	    avg = konversiCelcius(temR2);
	    max = konversiCelcius(temR3);

		DecimalFormat commaFormat;
		commaFormat = new DecimalFormat("##.0");
		System.out.print(commaFormat.format(min)+" ");
		System.out.print(commaFormat.format(avg)+" ");
		System.out.print(commaFormat.format(max)+" ");
}	
	
private static float konversiCelcius (float fahrenheit) {
	return  ((fahrenheit-32)*5)/9;
}
}

