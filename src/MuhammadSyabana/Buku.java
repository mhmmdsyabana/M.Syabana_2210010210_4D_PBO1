package MuhammadSyabana;

public class Buku {
    // Atribut dan enkapsulasi
    private String judul;
    private String kodeBuku;

    // Konstruktor
    public Buku(String judul, String kodeBuku) {
        this.judul = judul;
        this.kodeBuku = kodeBuku;
    }

    // Mutator (Setter)
    public void setJudul(String judul) {
        this.judul = judul;
    }

    public void setKodeBuku(String kodeBuku) {
        this.kodeBuku = kodeBuku;
    }

    // Accessor (Getter)
    public String getJudul() {
        return judul;
    }

    public String getKodeBuku() {
        return kodeBuku;
    }

    // Polimorfisme
    public String displayInfo() {
        return "Judul: " + getJudul() + "\nKode Buku: " + getKodeBuku();
    }

    public String displayInfo(String pengarang) {
        return displayInfo() + "\nPengarang: " + pengarang;
    }
}
