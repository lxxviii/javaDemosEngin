package miniProjeAsalSayi;

public class Main {

	public static void main(String[] args) {

		// TODO ASAL SAYI BULMA, YOĞURTLU
		int number = -1;
		int reminder = 0;

		if (number < 1) {
			System.out.println("1 veya 1'den küçük bir rakam girdiniz.");
			return;
		}

		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				reminder++;
			}
		}
		if (reminder == 0) {
			System.out.println("Sayı Asal Sayıdır");
		} else {
			System.out.println("Sayı Asal Değildir");
		}		
	}
}