public class Lingkaran extends BangunDatar{
    private int jari;
    public Lingkaran(int jari) {
        this.jari = jari;
    }

    public void gambar() {
        System.out.println("\n~Ini Gambar Lingkaran~\n");
    }
    public float luas() {
        return (float) (3.14 * jari * jari);
    }
}