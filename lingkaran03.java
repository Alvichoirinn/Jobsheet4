import java.util.Scanner;
/**
 * lingkaran03
 */
public class lingkaran03 {

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        int r;
        double keliling, luas;
        double phi = 3.14;

        System.out.println("Masukkan r: ");
        r = input.nextInt();
        System.out.println("Masukkan Phi");
        phi = input.nextDouble();
        
        luas = r*r*phi;
        keliling = 2*phi*r;
        
        System.out.println("Hasil luas: " + luas);
        System.out.println("Hasil keliling: " + keliling);
    }
}