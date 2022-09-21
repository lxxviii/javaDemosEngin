package methods;

public class Main {

	public static void main(String[] args) {
		// TODO Sayı Bulma -- Methods

		sayiBulmaca();
		sayiBulmaca();
		sayiBulmaca();
		sayiBulmaca();
		sayiBulmaca();
		sayiBulmaca();
		sayiBulmaca();	
	}

	
	//TODO
	public static void sayiBulmaca() {
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
			mesajVer("Aranan Sayı Bulundu " + aranacak + ".");
		} else {
			mesajVer("Aranan Sayı Bulunamadı.");
		}

	}
	
	//TODO
	public static void mesajVer(String mesaj) {
		System.out.println(mesaj);
	}
}
