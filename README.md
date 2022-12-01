# ORIENTED OBJECT PROGRAMMING
## Praktikum 6

    public class Main {
        public static void main(String[] args) {
    // membuat objek
            BangunDatar lingkaran1 = new Lingkaran(8);
            BangunDatar segitiga1 = new Segitiga(10,15);
            BangunDatar persegi1 = new Persegi(25, 17);


            /* memanggil method gambar*/
            lingkaran1.gambar();
            segitiga1.gambar();
            persegi1.gambar();

            /* menampilkan method luas bangun datar*/
            System.out.println("Luas Lingkaran: " + lingkaran1.luas());
            System.out.println("Luas Segitiga: " + segitiga1.luas());
            System.out.println("Luas Persegi: " + persegi1.luas());

        }
    }
![Screenshot (19)](https://user-images.githubusercontent.com/115928747/205178255-e85ca2f6-5629-48db-a6a6-04b8d3450fca.png)
