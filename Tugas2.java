import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] menu = { "Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappucino",
                "Chocolate Ice" };
        int[] harga = { 15000, 13000, 10000, 12000, 8000, 18000, 20000 };

        System.out.println("=== DAFTAR MENU ===");
        for (int i = 0; i < menu.length; i++) {
            System.out.println((i + 1) + ". " + menu[i] + " - Rp" + harga[i]);
        }

        System.out.print("\nCari menu: ");
        String cari = sc.nextLine();
        int idx = cariMenu(menu, cari);
        if (idx != -1) {
            System.out.println("Ditemukan: " + menu[idx] + " - Rp" + harga[idx]);
        } else {
            System.out.println("Menu \"" + cari + "\" tidak tersedia.");
        }

        System.out.print("\nJumlah item: ");
        int n = Integer.parseInt(sc.nextLine());

        String[] pesanan = new String[n];
        int total = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Menu ke-" + (i + 1) + ": ");
            String pilih = sc.nextLine();
            idx = cariMenu(menu, pilih);
            if (idx == -1) {
                System.out.println("\"" + pilih + "\" tidak tersedia. Pilih lagi.");
                i--;
            } else {
                pesanan[i] = menu[idx];
                total += harga[idx];
            }
        }

        System.out.println("\n=== DAFTAR PESANAN ===");
        for (int i = 0; i < n; i++) {
            idx = cariMenu(menu, pesanan[i]);
            System.out.println((i + 1) + ". " + pesanan[i] + " - Rp" + harga[idx]);
        }
        System.out.println("-----------------------");
        System.out.println("Total: Rp" + total);

        sc.close();
    }

    static int cariMenu(String[] menu, String nama) {
        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equalsIgnoreCase(nama))
                return i;
        }
        return -1;
    }
}