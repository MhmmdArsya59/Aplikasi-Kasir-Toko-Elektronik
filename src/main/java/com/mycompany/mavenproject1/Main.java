package com.mycompany.mavenproject1;


import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Transaksi transaksi = new Transaksi();
        
        // Inisialisasi Array Data Produk (Database Sederhana)
        Produk[] daftarProduk = {
            new Produk("Laptop Asus", 7500000),
            new Produk("Mouse Logitech", 150000),
            new Produk("Keyboard Mech", 450000),
            new Produk("Monitor LG", 1800000)
        };

        boolean isRunning = true;

        System.out.println("Selamat Datang di TechStore System");

        // Looping (Do-While) agar menu muncul terus sampai user keluar
        do {
            System.out.println("\n--- MENU UTAMA ---");
            System.out.println("1. Lihat Daftar Produk");
            System.out.println("2. Beli Produk");
            System.out.println("3. Cetak Struk & Keluar");
            System.out.print("Pilih menu (1-3): ");

            try {
                // Exception Handling (Mencegah error jika input bukan angka)
                int pilihan = scanner.nextInt();

                // Kondisional (Switch-Case)
                switch (pilihan) {
                    case 1:
                        System.out.println("\n--- DAFTAR PRODUK ---");
                        // Looping (For-each)
                        int index = 0;
                        for (Produk p : daftarProduk) {
                            System.out.print((index++) + ". ");
                            p.infoProduk();
                        }
                        break;

                    case 2:
                        System.out.print("Masukkan nomor index produk yang ingin dibeli: ");
                        int idxBeli = scanner.nextInt();
                        
                        // Kondisional (If-Else) validasi index array
                        if (idxBeli >= 0 && idxBeli < daftarProduk.length) {
                            transaksi.tambahItem(daftarProduk[idxBeli]);
                        } else {
                            System.out.println("❌ Produk tidak ditemukan!");
                        }
                        break;

                    case 3:
                        transaksi.cetakStruk();
                        isRunning = false; // Menghentikan loop
                        break;

                    default:
                        System.out.println("❌ Pilihan tidak valid.");
                }

            } catch (InputMismatchException e) {
                System.out.println("❌ Error: Harap masukkan angka saja!");
                scanner.nextLine(); // Membersihkan buffer scanner
            }

        } while (isRunning);

        System.out.println("Terima kasih telah berbelanja!");
        scanner.close();
    }
}