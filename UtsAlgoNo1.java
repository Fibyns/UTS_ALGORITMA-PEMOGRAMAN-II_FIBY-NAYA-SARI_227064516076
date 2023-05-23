// FIBY NAYA SARI
// 227064516076
package utsalgosem2;
import java.util.Scanner;
import java.util.Random;
public class UtsAlgoNo1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //membuat scanner baru dgn nama input
        Random random = new Random(); //untuk memilih nilai secara acak

        int tebakan, jumlahTebakan = 0, angkaAcak = random.nextInt(10) + 1; //deklarasi variable int
        
        System.out.println("Selamat datang di Game Tebak Angka!"); //menampilkan tulisan "Selamat datang di Game Tebak Angka!"
        System.out.println("Saya telah memilih sebuah angka antara 1 hingga 10. Silakan tebak!"); //menampilkan tulisan "Saya telah memilih sebuah angka antara 1 hingga 10. Silakan tebak!"
        
        //do while untuk perulangan masukan tebakan
        do {
            System.out.println(); //membuat baris baru
            System.out.print("Masukkan tebakan Anda: "); //menampilkan tulisan "Masukkan tebakan Anda: "
            tebakan = input.nextInt(); //menyimpan inputan ke var tebakan
            jumlahTebakan++; //++ atau +1, jumlah akan bertambah 1 jika  tebakan benar 
            
            //if else untuk percabangan 
            if (tebakan<angkaAcak) { //tebakan lebih kecil dari angka acak 
                System.out.println("Tebakan Anda terlalu rendah! Coba lagi."); //menampilkan tulisan "Masukkan tebakan Anda: "
            } 
            else if (tebakan>angkaAcak) { //tebakan lebih besar dari angka acak 
                System.out.println("Tebakan Anda terlalu tinggi! Coba lagi."); //menampilkan tulisan "Masukkan tebakan Anda: "
            } 
            else {//jika tebakan sudah benar akan dieksekusi else yg ini
                System.out.println("Selamat! Anda berhasil menebak angka yang benar!"); //menampilkan tulisan "Masukkan tebakan Anda: "
                System.out.println("Jumlah tebakan Anda: " + jumlahTebakan); //menampilkan tulisan "Masukkan tebakan Anda: " dan akan keluar jumlah tebakan 
            }
        } while (tebakan != angkaAcak); //while akan berhenti jika tebakan sudah benar
    }
}