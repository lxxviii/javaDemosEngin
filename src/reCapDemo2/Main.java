package reCapDemo2;

public class Main {
    public static void main(String[] args) {
        //TODO reCapDemo2
        double[] myList = {10.2, 10.3, 14.3, 50.6};
        double total = 0;
        double max = 0;

        for (double number : myList) {
            if (max < number) {
                max = number;
            };
            total += number;
            System.out.println(number);
        }
        System.out.println();
        System.out.println("Toplam Rakam : " + total);

        System.out.println();
        System.out.println("En Büyük Sayı : " + max);


        //TODO MultiDimensionalArray
        String[][] sehirler = new String[3][3];

        sehirler[0][0] = "İstanbul";
        sehirler[0][1] = "Bursa";
        sehirler[0][2] = "Bilecik";
        sehirler[1][0] = "Ankara";
        sehirler[1][1] = "Konya";
        sehirler[1][2] = "Kayseri";
        sehirler[2][0] = "Diyarbakır";
        sehirler[2][1] = "Şanlıurfa";
        sehirler[2][2] = "Gaziantep";

        for (int i = 0; i <= 2; i++) {
            System.out.println("----------------");
            for (int j = 0; j <= 2; j++) {
                System.out.println(sehirler[i][j]);
            }
        }
    }
}