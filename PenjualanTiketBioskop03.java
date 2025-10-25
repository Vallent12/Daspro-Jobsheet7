import java.util.Scanner;
public class PenjualanTiketBioskop03 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hargaTiket = 50000, totalTiket = 0, jumlahTiket;
        double totalPendapatan =0, diskon, totalHarga, potongan, totalBayar;
        String namaPembeli;

        System.out.println("\n===============================");
        System.out.println("PROGRAM PENJUALAN TIKET BIOSKOP");
        System.out.println("===============================");
        System.out.println("Harga tiket       : Rp " + hargaTiket);
        System.out.println("Diskon > 4 tiket  : 10%");
        System.out.println("Diskon > 10 tiket : 15%");
        System.out.println("===============================");

        do {
            System.out.print("\nMasukkan nama pembeli (ketik 'selesai' untuk keluar): ");
            namaPembeli = sc.nextLine();
            if (namaPembeli.equalsIgnoreCase("selesai")) {
                System.out.println("Transaksi diselesaikan.");
                break;
            }  
            System.out.print("Masukkan jumlah tiket yang dibeli: ");
            jumlahTiket = sc.nextInt();
            sc.nextLine();
            
            if (jumlahTiket < 0) {
                System.out.println("Jumlah tiket tidak valid. Silahkan input ulang!");
                continue;
            }
            if (jumlahTiket > 10) {
                diskon = 0.15;
            } else if (jumlahTiket > 4) {
                diskon = 0.10;
            } else {
                diskon = 0.0;
            }

            totalHarga = jumlahTiket * hargaTiket;
            potongan = totalHarga * diskon;
            totalBayar = totalHarga - potongan;

            totalTiket += jumlahTiket;
            totalPendapatan += totalBayar;

            System.out.println("---------------------------------------");
            System.out.println("Nama Pembeli        : " + namaPembeli);
            System.out.println("Jumlah Tiket Dibeli : " + jumlahTiket);
            System.out.println("Diskon Diterapkan   : " + (diskon * 100) + "%");
            System.out.println("Total Bayar         : Rp " + totalBayar);
            System.out.println("---------------------------------------");

        } while (true);
        
        System.out.println("\n========== LAPORAN PENJUALAN ==========");
        System.out.println("Total Tiket Terjual : " + totalTiket);
        System.out.println("Total Pendapatan    : Rp " + totalPendapatan);
        System.out.println("=======================================");
    }
}
