class  Motor extends AbstractMotor implements displayMotor {

    // Constructor
    public Motor(String nama, String platNomor, double hargaSewaPerHari) {
        super(nama, platNomor, hargaSewaPerHari);
    }

    // Method untuk menampilkan informasi motor
    @Override
    public void tampilkanInfo() {
        System.out.println("Nama Motor     : " + nama);
        System.out.println("Plat Nomor     : " + platNomor);
        System.out.println("Harga per Hari : Rp " + hargaSewaPerHari);
        System.out.println("Tampilkan Info");
        System.out.println("ioioioioioioio");
    }
}
