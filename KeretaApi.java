import java.util.Scanner;

public class KeretaApi {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        boolean lanjutBeli = true;

        while (lanjutBeli) {
            System.out.println("==== Pemesanan tiket kereta api ====");
            System.out.println("Jurusan kereta yang tersedia : ");
            System.out.println("1. CIKAMPEK - TUPAREV");
            System.out.println("2. JOHAR - BYPASS");
            System.out.println("3. KLARI - BADAMI");

            System.out.println("Pilih jurusan yang hendak dinaiki : ");
            int pilihan = scan.nextInt();

            String jurusan = "";
            int harga = 0;

            switch (pilihan) {
                case 1:
                jurusan = "CIKAMPEK - TUPAREV";
                harga = 20000;
                break;
                case 2:
                jurusan = "JOHAR - BYPASS";
                harga = 35000;
                break;
                case 3:
                jurusan = "KLARI - BADAMI";
                harga = 250000;
                break;
            default:
            System.out.println("Pilihan tidak ada!");
            continue;
            }
            System.out.println("Anda telah memilih jurusan : " + jurusan);
            
            System.out.println("Pilih kelas yang akan anda naiki : ");
            System.out.println("1. Bisnis");
            System.out.println("2. Executive");
            System.out.println("3. Ekonomi");
            
            int pilihanKelas = scan.nextInt();

            String kelas = "";

            switch(pilihanKelas) {
                case 1:
                kelas = "Bisnis";
                break;
                case 2:
                kelas = "Executive";
                break;
                case 3:
                kelas = "Ekonomi";
                break;
                default:
                System.out.println("Pilihan tidak valid!");
                continue;
            }
            System.out.println("Anda telah memilih kelas " + kelas);

            System.out.println("Jumlah tiket yang ingin anda pesan : ");
            int jumlahTiket = scan.nextInt();
            
            int totalHarga = harga * jumlahTiket;

            System.out.println("Detail pemesanan anda : ");
            System.out.println("Jurusan : " + jurusan);
            System.out.println("Kelas : " + kelas);
            System.out.println("Jumlah tiket : " + jumlahTiket);
            System.out.println("Total harga : " + totalHarga);

            System.out.println("Silahkan dibayar ditempat pembayaran!");
            System.out.println("Apakah ingin membeli tiket lagi? (Y/N)");
            String jawaban = scan.next();

            lanjutBeli = jawaban.equalsIgnoreCase("Y");
        }
        
        System.out.println("Terimakasih telah menggunakan jasa layanan kami");
    }
}