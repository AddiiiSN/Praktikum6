public class Segitiga extends BangunDatar{
    private int alas;
    private int tinggi;
    public Segitiga(int alas, int tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public void gambar() {
        System.out.println("~Ini Gambar Segitiga~\n");
    }
    public float luas() {
        return (float) (0.5 * this.alas * this.tinggi);
    }
}
