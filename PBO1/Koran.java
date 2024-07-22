public class Koran {

    private int id;
    private String judul;
    private String penerbit;
    private int jumlahHalaman;
    private double harga;

    // Constructor
    public Koran() {
        System.out.println("Object Koran telah diciptakan, constructor berjalan");
    }

    // Methods
    public void naikkanHarga() {
        System.out.println("Harga naik");
    }

    public void tampilkanDetailKoran() {
        System.out.println("Ini detail koran:");
        System.out.println("ID: " + id);
        System.out.println("Judul: " + judul);
        System.out.println("Penerbit: " + penerbit);
        System.out.println("Jumlah Halaman: " + jumlahHalaman);
        System.out.println("Harga: " + harga);
    }

    public void tambahDiskon(double diskon) {
        System.out.println("Ini tambahan diskon");
    }

    // Getter dan Setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getPenerbit() {
        return penerbit;
    }

    public void setPenerbit(String penerbit) {
        this.penerbit = penerbit;
    }

    public int getJumlahHalaman() {
        return jumlahHalaman;
    }

    public void setJumlahHalaman(int jumlahHalaman) {
        this.jumlahHalaman = jumlahHalaman;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }
}
 