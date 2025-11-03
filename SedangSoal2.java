import java.util.Scanner;

public class SedangSoal2 {

    public static double hitungVolume (double jariJari, double tinggi) {
        double volume = Math.PI * jariJari * jariJari * tinggi;
        return volume;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("===============================");
        System.out.println("  Menghitung Volume Tabung   ");
        System.out.println("===============================");

        System.out.print("Masukkan Jari-jari Tabung (cm): ");
        double jariJari = input.nextDouble();

        System.out.println("-------------------------------");

        System.out.print("Masukkan Tinggi Tabung (cm): ");
        double tinggi = input.nextDouble();

        System.out.println("===============================");

        double volume = hitungVolume(jariJari, tinggi);

        System.out.println("Volume Tabung adalah: " + volume + " cm³");

        System.out.println("===============================");

        input.close();
    }
}