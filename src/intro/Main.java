package intro;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// integer
		int vade = 12;

		double dolarBugun = 0;
		double dolarDun = 0;

		boolean dolarDustuMu = false;

		String okYonu = "";

		if (dolarBugun < dolarDun) {
			okYonu = "down.svg";
			System.out.println(okYonu);
		} else if (dolarBugun > dolarDun) {
			okYonu = "up.svg";
			System.out.println(okYonu);
		} else {
			okYonu = "equal.svg";
			System.out.println(okYonu);
		}

		// array

		String[] krediler = { "Hızlı Kredi", "Maaşını Halkbank'tan alanlar", "Mutlu Emekli" };

		for (int i = 0; i < krediler.length; i++) {
			System.out.println(krediler[i]);
		}
	}

}
