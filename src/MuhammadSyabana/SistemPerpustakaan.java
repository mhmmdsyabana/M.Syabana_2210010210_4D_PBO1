package MuhammadSyabana;

import java.util.Scanner;

public class SistemPerpustakaan {
    public static void main(String[] args) {
        try {
            //IO sederhana
            Scanner scanner = new Scanner(System.in);

            // Array Buku
            BukuDetail[] buku = new BukuDetail[2];

            // Perulangan untuk input data buku
            for (int i = 0; i < buku.length; i++) {
                System.out.print("Masukkan Judul Buku " + (i + 1) + ": ");
                String judul = scanner.nextLine();
                System.out.print("Masukkan Kode Buku " + (i + 1) + ": ");
                String kodeBuku = scanner.nextLine();

                buku[i] = new BukuDetail(judul, kodeBuku);
            }

            // Perulangan untuk menampilkan data buku
            for (BukuDetail b : buku) {
                System.out.println("===============");
                System.out.println("Data Buku");
                System.out.println(b.displayInfo());
            }
        } catch (NumberFormatException e) {
            System.out.println("Kesalahan Format Nomor: " + e.getMessage());
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Kesalahan Format Kode Buku: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Kesalahan Umum: " + e.getMessage());
        }
    }
}

