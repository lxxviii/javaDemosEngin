package mukemmelSayi;

public class Main {

	public static void main(String[] args) {
		// TODO Mükemmel Sayı, YOĞURTLU

		int mukemmelSayi = 28;
		int bolumToplami = 0;

		for (int i = 1; i < mukemmelSayi; i++) {
			if (mukemmelSayi % i == 0) {
				bolumToplami += i;
			}
		}
		if (mukemmelSayi == bolumToplami) {
			System.out.println("Girniğiniz Sayı Mükemmel Sayıdır");
		} else {
			System.out.println("Girniğiniz Sayı Mükemmel Sayı Değildir");
		}
	}
}
