package com.mycompany.mavenproject1;


public class Transaksi {
    // Konstanta (Static Final)
    public static final double PAJAK_PPN = 0.11; // 11%
    
    // Array untuk menyimpan keranjang belanja (maksimal 100 item)
    private Produk[] keranjang = new Produk[100];
    private int jumlahItem = 0; // Counter item

    // Method untuk menambah item ke array
    public void tambahItem(Produk p) {
        if (jumlahItem < keranjang.length) {
            keranjang[jumlahItem] = p;
            jumlahItem++;
            System.out.println("✅ " + p.getNama() + " berhasil ditambahkan!");
        } else {
            System.out.println("❌ Keranjang penuh!");
        }
    }

    // Method untuk menghitung total dan mencetak struk
    public void cetakStruk() {
        System.out.println("\n========== STRUK BELANJA ==========");
        double subtotal = 0;
        char mataUang = 'R'; // Tipe data Character

        // Looping (For-loop) untuk mengakses Array
        for (int i = 0; i < jumlahItem; i++) {
            Produk p = keranjang[i];
            System.out.printf("%d. %-15s %c%c %,.2f%n", (i+1), p.getNama(), mataUang, 'p', p.getHarga());
            subtotal += p.getHarga();
        }

        // Perhitungan matematika sederhana
        double totalPajak = subtotal * PAJAK_PPN;
        double totalBayar = subtotal + totalPajak;

        System.out.println("-----------------------------------");
        System.out.printf("Subtotal      : Rp %,.2f%n", subtotal);
        System.out.printf("PPN (11%%)     : Rp %,.2f%n", totalPajak);
        System.out.println("-----------------------------------");
        System.out.printf("TOTAL BAYAR   : Rp %,.2f%n", totalBayar);
        System.out.println("===================================");
    }
}