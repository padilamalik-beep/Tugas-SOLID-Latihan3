public class MobilListrik
        implements Movable, BatteryPowered {

    @Override
    public void bergerak() {
        System.out.println("Mobil listrik sedang berjalan.");
    }

    @Override
    public void isiBaterai() {
        System.out.println("Mengisi baterai mobil listrik.");
    }
}