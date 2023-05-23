package utsalgosem2;
import java.util.Scanner;
public class UtsAlgoNo2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("## program jav cari nili rata-rata ##");
        System.out.println("======================================");
        System.out.println();
        
        int[] arr = new int[100];
        int arr_count, i;
        float total, rata;
        
        System.out.print("input jumlah elemen array : "); //sebelumnya System.print gada .out, yg bener System.out.print
        arr_count = input.nextInt();

        System.out.println("input " + arr_count+ " angka (pisah dgn enter) : ");
        
        //simpan setiap angka yg di input ke dlm array
        for(i=0; i<arr_count; i++){
            arr[i]=(int) input.nextDouble();
        }
        
        System.out.println();
        
        //cari total semua element array
        total=0;
        for(i=0; i<arr_count; i++){
            total=total+arr[i];
        }
        
        //hitung nilai rata2
        rata=(total/arr_count);
        System.out.println("nilai rata-rata dari " + arr_count + " inputan adalah: "+ rata); //tambahin + sebelum dan sesudah arr_count biar ke baca
    }  
}