# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi pengolahan data buku menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input berupa judul buku dan kode buku, dan memberikan output berupa informasi detail dari kode buku tersebut seperti tahun terbit, genre dan edisi.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `Buku`, `BukuDetail`, dan `SistemPerpustakaan` adalah contoh dari class.

```bash
public class Buku {
    ...
}

public class BukuDetail extends Buku {
    ...
}

public class SistemPerpustakaan {
    ...
}
```

2. **Object** adalah instance dari class. Pada kode ini, `buku[i] = new BukukDetail(judul, kodeBuku);` adalah contoh pembuatan object.

```bash
buku[i] = new BukuDetail(judul, kodeBuku);
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `judul` dan `kodeBuku` adalah contoh atribut.

```bash
String judul;
String kodeBuku;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `Buku` dan `BukuDetail`.

```bash
public Buku(String judul, String kodeBuku) {
    this.judul = judul;
    this.kodeBuku = kodeBuku;
}

public BukuDetail(String judul, String kodeBuku) {
    super(judul, kodeBuku);
}
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setJudul` dan `setKodeBuku` adalah contoh method mutator.

```bash
public void setJudul(String judul) {
    this.judul = judul;
}

public void setKodeBukuString kodeBuku) {
    this.kodeBuku = kodeBuku;
}
```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getJudul`, `getKodeBuku`, `getTahunTerbit`, `getGenre`, dan `getEdisi` adalah contoh method accessor.

```bash
public String getJudul() {
    return judul;
}

public String getKodeBuku() {
    return kodeBuku;
}
```

  7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `judul` dan `kodeBuku` dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

```bash
private String judul;
private String kodeBuku;
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `BukuDetail` mewarisi `Buku` dengan sintaks `extends`.

```bash
public class BukuDetail extends Buku {
    ...
}
```

9. **Polymorphism** adalah konsep di mana sebuah judul dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan judul yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini, method `displayInfo(String)` di `Buku` merupakan overloading method `displayInfo` dan `displayInfo` di `BukuDetail` merupakan override dari method `displayInfo` di `Buku`.

```bash
public String displayInfo() {
    return super.displayInfo() +
    "\nTahun Terbit: " + getTahunTerbit() +
                "\nGenre: " + getGenre() +
                "\nEdisi: " + getEdisi();
}

@Override
public String displayInfo() {
    ...
}
```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi `if else` dalam method `getGenre``switch` dalam method `getGenre`.

```bash
public String getGenre() {
        String kodeGenre = getKodeBuku().substring(4, 6);
        //Seleksi
        if (kodeGenre.equals("01")) {
            return "Fiksi";
        } else {
            return "Non-Fiksi";
        }
    }
```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `for` untuk meminta input dan menampilkan data.

```bash
for (int i = 0; i < buku.length; i++) {
    ...
}
```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input dan method `System.out.println` untuk menampilkan output.

```bash
Scanner scanner = new Scanner(System.in);
for (int i = 0; i < buku.length; i++) {
System.out.print("Masukkan Judul Buku " + (i + 1) + ": ");
String judul = scanner.nextLine();
System.out.print("Masukkan Kode Buku " + (i + 1) + ": ");
String kodeBuku = scanner.nextLine();
 buku[i] = new BukuDetail(judul, kodeBuku);
}

for (BukuDetail b : buku) {
System.out.println("===============");
System.out.println("Data Buku");
System.out.println(b.displayInfo());
}
```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, `BukuDetail[] buku = new BukuDetail[2];` adalah contoh penggunaan array.

```bash
BukuDetail[] buku = new BukuDetail[2];
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `try catch` untuk menangani error.

```bash
try {
    // code that might throw an exception
} catch (NumberFormatException e) {
System.out.println("Kesalahan Format Nomor: " + e.getMessage());
} catch (StringIndexOutOfBoundsException e) {
System.out.println("Kesalahan Format Kode Buku: " + e.getMessage());
} catch (Exception e) {
System.out.println("Kesalahan Umum: " + e.getMessage());
}
```

## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |

## Pembuat

Nama: M. Syabana
NPM: 2210010210
