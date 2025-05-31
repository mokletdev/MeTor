import java.util.Scanner;

public class SimpleATM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //nama scanner adalah input

        double Saldo = 100000;
        String TransaksiTerakhir = "Tidak Ada Transaksi";

        while (true) {
            System.out.println("\n=== ATM Sederhana"); // \n digunakan untuk tampilan yang lebih rapi.
            System.out.println("1. Cek Saldo");
            System.out.println("2. Setor Uang");
            System.out.println("3. Tarik Uang");
            System.out.println("4. Cek Transaksi Terakhir");
            System.out.println("5. Keluar");
            
            System.out.print("Pilih Menu: ");

            int pilihan = input.nextInt();

            if (pilihan == 1) {
                System.out.println("Saldo saat ini: Rp "+Saldo);
            }

            else if (pilihan == 2) {
                System.out.println("Saldo saat ini: Rp "+Saldo);
                System.out.print("Masukkan jumlah setor: Rp ");

                double setor = input.nextInt();

                Saldo += setor; // menambahkan jumlah saldo dengan jumlah yang akan disetorkan

                TransaksiTerakhir = "Menyetorkan uang sebesar Rp " + setor;
                
                System.out.println("Setoran berhasil!");
                System.out.println("Saldo anda saat ini: Rp "+Saldo);
            }

            else if (pilihan == 3) {
                System.out.println("Saldo anda saat ini: Rp "+Saldo);
                System.out.print("Masukkan jumlah tarik: Rp ");

                double tarik = input.nextInt();

                if (tarik > Saldo) {
                    System.out.println("Saldo tidak mencukupi!");
                } else {
                    Saldo -= tarik;
                    TransaksiTerakhir = "Menarik uang sebesar Rp "+tarik;

                    System.out.println("Penarikan berhasil!");
                    System.out.println("Saldo anda saat ini: Rp "+Saldo);
                }
            }

            else if (pilihan == 4) {
                System.out.println("Transaksi terakhir: "+TransaksiTerakhir);
            }

            else if (pilihan == 5) {
                System.out.println("Terimakasih sudah menggunakan ATM!");
                break;
            }

            else {
                System.out.println("Pilihan tidak valid, coba lagi");
            }
        }

        input.close();
       
    }
}