package sesliHarfler;

public class Main {

	public static void main(String[] args) {
		// TODO Kalın Sesli Harfler ve İnce Sesli Harfler

		char harf = 'K';

		switch (harf) {

		case 'A':
		case 'I':
		case 'O':
		case 'U':
			System.out.println("Kalın Sesli Harftir");
			break;

		case 'E':
		case 'İ':
		case 'Ö':
		case 'Ü':
			System.out.println("İnce Sesli Harftir");
			break;

		default:
			System.out.println("Hatalı Veri");
		}
	}
}
