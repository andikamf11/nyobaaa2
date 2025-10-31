public abstract class    AbstractMotor {
    public String nama;
    public String platNomor;
    public double hargaSewaPerHari;

    public AbstractMotor(String nama, String platNomor, double hargaSewaPerHari) {
        this.nama = nama;
        this.platNomor = platNomor;
        this.hargaSewaPerHari = hargaSewaPerHari;
    }

    // Method untuk menampilkan informasi motor
    public abstract void tampilkanInfo();
}
