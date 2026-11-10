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
        for (int i = 0; i < nilaiAkhir.length; i++) {
            if (nilaiAkhir[i] >= 70) {
            System.out.println("Mahasiswa ke-" + (i + 1) + ": " + nilaiAkhir[i] + " (" + status + ")");
            }
        }
        sc.close();
    }
}