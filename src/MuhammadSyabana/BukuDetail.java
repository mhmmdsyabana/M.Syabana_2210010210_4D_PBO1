package MuhammadSyabana;

//inheritance
public class BukuDetail extends Buku {

    public BukuDetail(String judul, String kodeBuku) {
        super(judul, kodeBuku);
    }

    public int getTahunTerbit() {
        return Integer.parseInt(getKodeBuku().substring(0, 4));
    }

    public String getGenre() {
        String kodeGenre = getKodeBuku().substring(4, 6);
        //Seleksi
        if (kodeGenre.equals("01")) {
            return "Fiksi";
        } else {
            return "Non-Fiksi";
        }
    }

    public int getEdisi() {
        return Integer.parseInt(getKodeBuku().substring(6));
    }

    // Polimorfisme (Override)
    @Override
    public String displayInfo() {
        return super.displayInfo() +
                "\nTahun Terbit: " + getTahunTerbit() +
                "\nGenre: " + getGenre() +
                "\nEdisi: " + getEdisi();
    }
}
