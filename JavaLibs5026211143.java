import java.util.Scanner;

public class JavaLibs5026211143 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String nama, tempat, hari, kendaraan, cuaca, barangDibeli, suasanaHati;
        int jumlahBarang;
        double harga, tip;

        System.out.println("Halo, selamat datang! Aku mau tanya-tanya nih mengenai " +
                "kegiatan belanja kamu dalam beberapa hari terakhir ini.");

        System.out.println("Kalau boleh tau siapa nih namamu?");
        nama = input.nextLine();

        System.out.println("Dalam beberapa hari terakhir kamu ada pergi belanja ke mana?");
        tempat = input.nextLine();

        System.out.println("Wah, kamu pergi belanja hari apa?");
        hari = input.nextLine();

        System.out.println("Pergi ke sana pakai kendaraan apa?");
        kendaraan = input.nextLine();

        System.out.println("Bagaimana cuaca saat itu?");
        cuaca = input.nextLine();

        System.out.println("Kasih tau dong kamu beli apa di sana. Aku kepo nih :(");
        barangDibeli = input.nextLine();

        System.out.println("Berapa banyak yang kamu beli?");
        jumlahBarang = input.nextInt();

        System.out.println("Harga satuannya berapaan tuh? (Hint: tuliskan dalam bentuk dollar)");
        harga = input.nextDouble();

        System.out.println("Berapa tip yang kamu berikan untuk pegawai di sana? " +
                "Hint: tuliskan dalam bentuk dollar");
        tip = input.nextDouble();

        System.out.println("Bagaimana suasana hatimu setelah pergi berbelanja?");
        suasanaHati = input.next();

        System.out.println("Pada hari " + hari + "," + nama + " pergi ke " +
                tempat + " menggunakan " + kendaraan + "." + "\n" + "Di sana " + nama + " membeli "
                + barangDibeli + " sebanyak " + jumlahBarang + "." + "\n" + "Jadi, uang yang " +
                "dikeluarkan oleh " + nama + " adalah $ " + jumlahBarang * harga + ". " + "\n" +
                "Kemudian, karena pelayanan yang diberikan oleh pegawai " + tempat +
                " sangat bagus, maka " + nama + " memberi tip sebanyak $ " + tip + ". " + "\n" +
                "Jumlah tip tersebut " + "hanyalah " + (tip / (jumlahBarang * harga)) * 100.0D +
                "% dari total belanjaan. " + "\n" + "Selama berbelanja, perasaan " + nama +
                " sangat " + suasanaHati + " karena cuaca pada saat " +
                "itu juga sedang " + cuaca + ".");


    }
}
