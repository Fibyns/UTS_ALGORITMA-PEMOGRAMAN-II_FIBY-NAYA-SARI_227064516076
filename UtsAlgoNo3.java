// FIBY NAYA SARI 227064516076
package utsalgosem2;
import java.util.Scanner;
public class UtsAlgoNo3 {
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    int harga = 0, category = 0, bayar, kembalian;

    System.out.println("## COLDPLAY MUSIC of SPHERES ##"); 
    System.out.println("========== WORLD TOUR ==========");
    System.out.println("GELORA BUNG KARNO STADIUM JAKARTA");
    System.out.println("Kategori tiket yang tersedia : ");
    System.out.println("1. Category 1 (Rp5.000.000)");
    System.out.println("2. Category 2 (Rp4.000.000)");
    System.out.println("3. Category 3 (Rp3.250.000)");
    System.out.println("4. Category 4 (Rp2.500.000)");
    
    System.out.print("Pilih kategori tiket (1-4) : ");
    int tiket = input.nextInt();
    
    System.out.print("Masukkan jumlah tiket yang ingin dibeli : ");
    int jumlah = input.nextInt();
    
    switch(tiket){
        case 1:
            harga = 5000000*jumlah;
            break;
        case 2:
            harga = 4000000*jumlah;
            break;
        case 3:
            harga = 3250000*jumlah;
            break;
        case 4:
            harga = 2500000*jumlah;
            break;
    }
    System.out.println("======================================");
    System.out.println("\t \n INVOICE PEMBELIAN \n");
    System.out.println("======================================");
    System.out.println("Kategori Tiket : Category " + tiket);
    System.out.println("Jumlah Tiket   : " + jumlah);
    System.out.println("Harga Tiket    : Rp " + harga);
    System.out.println("======================================");
    System.out.print("Masukan jumlah uang yang akan di bayar : Rp ");
    bayar = input.nextInt();
    kembalian = bayar - harga;
    System.out.println("kembalian       : Rp " + kembalian);
    System.out.println("======================================");
    }   
}
