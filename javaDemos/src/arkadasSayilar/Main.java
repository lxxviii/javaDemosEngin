package arkadasSayilar;

public class Main {

	public static void main(String[] args) {
		// TODO Arkadas Sayilar

		int sayi1 = 220;
		int sayi2 = 284;
		int toplam1 = 0;
		int toplam2 = 0;

		for (int i = 1; i < sayi1; i++) {
			if (sayi1 % i == 0)
				toplam1 += i;
		}
		for (int i = 1; i < sayi2; i++) {
			if (sayi2 % i == 0)
			toplam2 += i;
		}

		if (sayi1 == toplam2 && sayi2 == toplam1) {
			System.out.println("Seçilen iki sayı arkadaş sayılardır.");
		} else {
			System.out.println("Seçtiğiniz iki sayı arkadaş sayı değildir.");
		}

//		System.out.println(sayi1);
//		System.out.println(sayi2);
//		System.out.println(toplam1);
//		System.out.println(toplam2);
	}
}
