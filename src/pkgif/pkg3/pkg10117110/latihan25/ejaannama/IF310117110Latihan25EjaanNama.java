

/**
 *
 * @author
 * Nama : Fauzi Sunarya
 * Kelas : IF-3
 * NIM : 10117110
 * Deskripsi Program : Program Jenis ini Berisi Program Untuk Menampilkan
 * Mengeja nama yang telah kita input
 */

package pkgif.pkg3.pkg10117110.latihan25.ejaannama;

import java.util.Scanner;

public class IF310117110Latihan25EjaanNama {

    public static void main(String[] args) {

 
        String nama;
        int panjangNama;
        
        
        Scanner scan = new Scanner(System.in); 
        System.out.print("Masukan Nama Depan Anda Untuk di Eja : ");
        nama = scan.nextLine();   
        
        System.out.println("Ejaan Untuk " +nama+ " adalah : ");
        char[] arrHuruf = nama.toCharArray(); 
        panjangNama = arrHuruf.length; 

        for(int i = 0; i < panjangNama; i++){
            for(int j = 0; j < panjangNama; j++){ 
                if(arrHuruf[i]!=' '){ 

                    if(j==panjangNama-1){  
                        System.out.println("Huruf "+ ": "+arrHuruf[i]); 
                         
                    }
                }
            }
        }

    }
    
}
