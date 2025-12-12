# TechStore - Aplikasi Kasir Sederhana 🛒

Project ini adalah implementasi dasar sistem kasir menggunakan bahasa pemrograman Java. Project ini dibuat untuk memenuhi tugas pemrograman berorientasi objek (OOP).

## 📋 Fitur Utama
1.  **Daftar Produk**: Menampilkan list produk menggunakan Array.
2.  **Keranjang Belanja**: Menambah item ke dalam transaksi.
3.  **Perhitungan Otomatis**: Menghitung subtotal, PPN (11%), dan Total Bayar.
4.  **Validasi Input**: Menggunakan Exception Handling agar program tidak crash saat salah input.

## 🛠️ Konsep OOP yang Diterapkan
* **Class & Object**: `Produk`, `Transaksi`, dan `Main`.
* **Encapsulation**: Menggunakan access modifier `private`.
* **Constructor**: Inisialisasi objek produk.
* **Array**: Menyimpan daftar produk dan keranjang belanja.
* **Looping & Conditional**: Navigasi menu dan logika pemilihan barang.
* **Exception Handling**: `try-catch` untuk input user.

## 📷 Desain Class (Sederhana)
* **Produk**: `String nama`, `double harga` (Model Data).
* **Transaksi**: `Produk[] keranjang`, `tambahItem()`, `cetakStruk()` (Logika Bisnis).
* **Main**: `public static void main`, `Scanner` (User Interface).

## 🚀 Cara Menjalankan Program
1.  Pastikan Java Development Kit (JDK) sudah terinstall.
2.  Clone repository ini atau download ZIP.
3.  Buka terminal/CMD di folder `src/main/java`.
4.  Compile kode:
    ```bash
    javac com/techstore/*.java
    ```
5.  Jalankan program:
    ```bash
    java com.techstore.Main
    ```

## 🎥 Video Penjelasan & Demo
[Sertakan Link YouTube Anda Di Sini]
