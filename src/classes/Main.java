package classes;

public class Main {

	public static void main(String[] args) {
		// TODO Classes
		CustomerManager customerManager;
		CustomerManager customerManager2 = new CustomerManager();

		customerManager = customerManager2;

		customerManager.Add();
		customerManager.Update();
		customerManager.Remove();

		int sayi1 = 10;
		int sayi2 = 20;

		sayi2 = sayi1;
		sayi2 = 30;

		System.out.println(sayi1);

		int[] sayilar1 = new int[] { 1, 2, 3, 4, 5 };
		int[] sayilar2 = new int[] { 6, 7, 8, 9, 10 };

		sayilar2 = sayilar1;

		sayilar1[0] = 10;
		System.out.println(sayilar2[0]);

	}
}