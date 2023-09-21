import java.util.Scanner;
public class HargaBayar {
    
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        int harga, jumlah;
        double total, bayar, jmlDis;
        String merkBuku, jmlHalBuku;

        System.out.println("Merk Buku: ");
        merkBuku = input.nextLine();
        System.out.println("Jumlah Hal Baru: ");
        jmlHalBuku = input.nextLine();

        System.out.println("Masukkan harga barang yang dibeli");
        harga = input.nextInt();
        System.out.println("Masukkan Jumlah barang yang dibeli");
        jumlah = input.nextInt();
        System.out.println("Masukkan diskon yang anda dapat");
        jmlDis = input.nextInt();

        total = harga*jumlah;
        bayar = total-jmlDis;

        System.out.println("--------------------------------------------");
        System.out.println("Merk Buku :" + merkBuku);
        System.out.println("Hal Buku :" +jmlHalBuku);
        System.out.println("Jumlah yang harus dibayarkan adalah: Rp. " + bayar);
        
    }
}
