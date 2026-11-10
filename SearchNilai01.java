import java.util.Scanner;

public class SearchNilai01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah nilai: ");
        int n = scanner.nextInt();
        while (n <= 0) {
            System.out.print("Jumlah harus > 0. Masukkan lagi: ");
            n = scanner.nextInt();
        }
        int[] nilai = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan nilai ke-" + (i + 1) + ": ");
            nilai[i] = scanner.nextInt();
        }
        System.out.print("Masukkan nilai yang dicari: ");
        int cari = scanner.nextInt();
        boolean ditemukan = false;
        for (int i = 0; i < n; i++) {
            if (nilai[i] == cari) {
                System.out.println("Nilai " + cari + " ditemukan pada indeks ke-" + i);
                ditemukan = true;
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("Nilai " + cari + " tidak ditemukan. Rentang nilai: "+ nilai[0] + " hingga " + nilai[n - 1]);
        }
        scanner.close();
    }
}