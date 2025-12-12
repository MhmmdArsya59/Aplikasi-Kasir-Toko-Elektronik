package com.mycompany.mavenproject1;


// Class blueprint untuk objek Produk
public class Produk {
    // Variabel Instance (Private untuk enkapsulasi)
    private String nama;
    private double harga;
    
    // Constructor: Inisialisasi objek
    public Produk(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }

    // Method dengan return value (Getter)
    public String getNama() {
        return nama;
    }

    public double getHarga() {
        return harga;
    }

    // Method untuk menampilkan format info produk
    public void infoProduk() {
        // Manipulasi String sederhana
        System.out.printf("- %-15s : Rp %,.2f%n", nama, harga);
    }
}