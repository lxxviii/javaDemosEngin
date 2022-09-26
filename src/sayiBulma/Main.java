package sayiBulma;

public class Main {

	public static void main(String[] args) {
		// TODO Sayı Bulma

		int[] sayilar = { 1, 2, 5, 7, 9, 0 };
		int aranacak = 10;
		boolean bulunduMu = false;

		for (int sayi : sayilar) {
			if (aranacak == sayi) {
				bulunduMu = true;
				break;
			}
		}
		if (bulunduMu) {
			System.out.println("Aranan Sayı Bulundu " + aranacak + ".");
		} else {
			System.out.println("Aranan Sayı Bulunamadı.");
		}
	}
}
