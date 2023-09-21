import java.util.Scanner;

    /**
     * Gaji03
     */
    public class Gaji03 {
    
        public static void main(String[] args) {
            Scanner input= new Scanner(System.in);

            int jmlMasuk, jmlTdkMasuk, TotGaji;
            int bsrnGaji;
            int potoGaji;

            System.out.println("Masukkan Jumlah Hari Masuk Kerja Anda");
            jmlMasuk=input.nextInt();
            System.out.println("Masukkan Jumlah Hari Tidak Masuk Kerja Anda");
            jmlTdkMasuk=input.nextInt();
            System.out.println("Masukkan besarangaji");
            bsrnGaji =input.nextInt();
            System.out.println("Masukkan potGaji");
            potoGaji=input.nextInt();

            TotGaji=(jmlMasuk*bsrnGaji)-(jmlTdkMasuk*potoGaji);
            System.out.println("Gaji yang anda terima adalah " +TotGaji);
        }
    }