import java.util.Scanner;

public class ArrayNilai01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nilaiAkhir = new int[10];
        String status = "Lulus";
        for (int i = 0; i < nilaiAkhir.length; i++) {
            System.out.print("Masukan nilai mahasiswa ke-" + (i + 1) + ":");
            nilaiAkhir[i] = sc.nextInt();
        }
        int G = 0;
        int L = 0;
        for (int i = 0; i < nilaiAkhir.length; i++) {
            if (nilaiAkhir[i] >= 70) {
                G++;
                System.out.println("Mahasiswa ke-" + (i + 1) + ": " + nilaiAkhir[i] + " (" + status + ")");
            } else {
                L++;
            }
        }
        System.out.println("Jumlah mahasiswa yang lulus: " + G);
        System.out.println("Jumlah mahasiswa yang tidak lulus: " + L);
        sc.close();
    }
}