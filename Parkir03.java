import java.util.Scanner;
public class Parkir03 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jenis, durasi, total = 0;

        System.out.println("==== Program Hitung Total Pembayaran Parkir ====");

        do {
            System.out.print("\nMasukkan jenis kendaraan (1 Mobil, 2 Motor, 0 Keluar): ");
            jenis = sc.nextInt();
            
            if (jenis == 1 || jenis == 2) {
                System.out.print("Masukkan durasi parkir (jam): ");
                durasi = sc.nextInt();

                if (durasi > 5) {
                    total += 12500;
                } else if (jenis == 1) {
                    total += durasi * 3000;
                } else if (jenis == 2) {
                    total += durasi * 2000;
                }
            }
        }while (jenis != 0);

        System.out.println("\n==== Total Pembayaran Parkir ====");
        System.out.println("Total yang harus dibayar: Rp " + total);
        System.out.println("Terimakasih telah menggunakan layanan parkir kami.");

        sc.close();
    }
}
