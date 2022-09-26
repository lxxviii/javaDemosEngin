package reCapDemo1;

public class Main {
	public static void main(String[] args) {

		// TODO HelloWorld Java
		System.out.println("Merhaba JAVA!");

		// TODO Variables
		int sayi = 20;
		if (sayi < 24) {
			System.out.println("Sayı 20'den küçüktür.");
		} else if (sayi == 20) {
			System.out.println("Sayı 20'ye eşittir.");
		} else {
			System.out.println("Sayı 20'den küçük değildir.");
		}

		// TODO dataTypes
		double sayiDouble = 12.5;
		sayiDouble = -129;
		char karakter = 'A';
		boolean dogruMu = false;

		// TODO Conditions
		int sayiVariables = 12;
		String mesaj = "Öğrenci Sayısı : ";
		System.out.println(mesaj + sayiVariables);
		System.out.println(mesaj + sayiVariables);
		System.out.println(mesaj + sayiVariables);
		System.out.println(mesaj + sayiVariables);
		System.out.println(mesaj + sayiVariables);

		// TODO ReCap DEMO
		int sayi1 = 200;
		int sayi2 = 25;
		int sayi3 = 2;
		int enBuyuk = sayi1;
		if (enBuyuk < sayi2) {
			enBuyuk = sayi2;
		}
		if (enBuyuk < sayi3) {
			enBuyuk = sayi3;
		}
		System.out.println("En Büyük " + enBuyuk);

		// TODO SWITCH BLOCKS
		char grade = 'C';
		switch (grade) {
		case 'A':
			System.out.println("Mükemmel : Geçtiniz..");
			break;
		case 'B':
			// System.out.println("Çok Güzel : Geçtiniz..");
			// break;
		case 'C':
			System.out.println("İyi : Geçtiniz..");
			break;
		case 'D':
			System.out.println("Fena Değil : Geçtiniz..");
			break;
		case 'E':
			System.out.println("Maalesef Kaldınız");
			break;
		default:
			System.out.println("Geçersiz Not Girdiniz");
		}
		;

		// TODO LOOP DEMO
		// FOR LOOP
		for (int i = 2; i < 10; i++) {
			System.out.println(i);
		}
		System.out.println("Döngü Bitti");

		// WHILE LOOP
		int i = 1;
		while (i < 10) {
			System.out.println(i);
			i++;
		}
		System.out.println("While Döngüsü Bitti");

		// DO WHILE
		int j = 1;
		do {
			System.out.println("Loglandı");
			if (j < 10)
				System.out.println(j);
			j++;
		} while (j < 10);
		System.out.println("Do - While Döngüsü Bitti");

		// TODO ARRAYS
		String[] ogrenciler = new String[4];
		ogrenciler[0] = "Engin";
		ogrenciler[1] = "Derin";
		ogrenciler[2] = "Salih";
		ogrenciler[3] = "Ahmet";
		System.out.println("....................");
		for (int k = 0; k < ogrenciler.length; k++) {
			System.out.println(ogrenciler[k]);
		}
		System.out.println("....................");
		for (String ogrenci : ogrenciler) {
			System.out.println(ogrenci);
		}
	}
}
