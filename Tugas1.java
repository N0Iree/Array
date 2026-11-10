import java.util.Arrays;
import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa: ");
        int n = sc.nextInt();
        while (n <= 0) {
            System.out.print("Jumlah harus > 0. Masukkan lagi: ");
            n = sc.nextInt();
        }
        int[] nilaiMhs = new int[n];
        int total = 0;
        double rata2;
        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukan nilai mahasiswa ke-" + (i + 1) + ":");
            nilaiMhs[i] = sc.nextInt();
            total += nilaiMhs[i];
        }
        rata2 = (double) total / nilaiMhs.length;
        System.out.println("Total nilai: " + total);
        System.out.println("Rata-rata: " + rata2);
        int tertinggi = nilaiMhs[0];
        int terendah = nilaiMhs[0];
        for (int i = 1; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i] > tertinggi)
                tertinggi = nilaiMhs[i];
            if (nilaiMhs[i] < terendah)
                terendah = nilaiMhs[i];
        }
        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);
        System.out.println(Arrays.toString(nilaiMhs));
        for (int nilai : nilaiMhs) {
            if (nilai > 70) {
                System.out.println(nilai + " Lulus");
            } else {
                System.out.println(nilai + " Tidak lulus");
            }
        }
        sc.close();
    }
}