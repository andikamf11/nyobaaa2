import java.util.Scanner;

class SewaMotor {
    private Motor motor;
    private int lamaSewa;
    private double totalBiaya;

    // Method untuk memulai penyewaan
    public void mulaiSewa() {
        Scanner input = new Scanner(System.in);

        System.out.println("=== SISTEM SEWA MOTOR ===");
        System.out.print("Masukkan nama motor: ");
        String nama = input.nextLine();

        System.out.print("Masukkan plat nomor: ");
        String plat = input.nextLine();

        System.out.print("Masukkan harga sewa per hari: ");
        double harga = input.nextDouble();

        // Membuat objek motor baru
        setMotor(new Motor(nama, plat, harga));

        System.out.print("Masukkan lama sewa (hari): ");
        setLamaSewa(input.nextInt());

        setTotalBiaya(totalBayar());
        tampilan();
    }

    // Method menampilkan struk sewa
    public void tampilan() {
        System.out.println("\n=== STRUK SEWA MOTOR ===");
        getMotor().tampilkanInfo();
        System.out.println("Lama Sewa      : " + getLamaSewa() + " hari");
        System.out.println("Total Biaya    : Rp " + totalBayar());
    }

    private double totalBayar() {
        return getMotor().hargaSewaPerHari * getLamaSewa();
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public int getLamaSewa() {
        return lamaSewa;
    }

    public void setLamaSewa(int lamaSewa) {
        this.lamaSewa = lamaSewa;
    }

    public double getTotalBiaya() {
        return totalBiaya;
    }

    public void setTotalBiaya(double totalBiaya) {
        this.totalBiaya = totalBiaya;
    }
}