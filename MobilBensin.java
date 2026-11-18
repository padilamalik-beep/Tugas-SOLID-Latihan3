public class MobilBensin
        implements Movable, EnginePowered, FuelPowered {

    @Override
    public void bergerak() {
        System.out.println("Mobil bensin sedang berjalan.");
    }

    @Override
    public void startEngine() {
        System.out.println("Menyalakan mesin mobil bensin.");
    }

    @Override
    public void isiBahanBakar() {
        System.out.println("Mengisi bahan bakar mobil bensin.");
    }
}