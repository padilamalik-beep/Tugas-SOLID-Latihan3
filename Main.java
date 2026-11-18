public class Main {
    public static void main(String[] args) {
        MobilListrik mobilListrik = new MobilListrik();
        mobilListrik.bergerak();
        mobilListrik.isiBaterai();

        System.out.println();

        MobilBensin mobilBensin = new MobilBensin();
        mobilBensin.startEngine();
        mobilBensin.bergerak();
        mobilBensin.isiBahanBakar();

        System.out.println();

        Sepeda sepeda = new Sepeda();
        sepeda.bergerak();
    }
}