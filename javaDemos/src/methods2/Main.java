package methods2;

public class Main {

	public static void main(String[] args) {
		// TODO METHODS_2
		String mesaj = "Bugün Hava Çok Güzel";
		System.out.println(mesaj);
		String yenimesaj = stringVer();
		System.out.println(yenimesaj);
		int sayi = topla(5, 7);
		System.out.println(sayi);

		int toplam = topla2(1, 2, 3, 4, 5, 6, 7, 8, 9, 10501, 155403, 515, 5);
		System.out.println(toplam);
	}

	public static void ekle() {
		System.out.println("Eklendi...");
	}

	public static void sil() {
		System.out.println("Silindi...");
	}

	public static void guncelle() {
		System.out.println("Güncellendi...");

	}

	public static int topla(int sayi1, int sayi2) {
		return sayi1 + sayi2;
	}

	public static int topla2(int... sayilar) {
		int toplam = 0;
		for (int sayi : sayilar) {
			toplam += sayi;
		}
		return toplam;
	};

	public static String stringVer() {
		return "Sehir";
	}

}
