/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplearraylist;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class ArrayProcessing {
    ArrayList<String> dataBil = new ArrayList<>();
    
    void input(){
        Scanner input = new Scanner(System.in);
        while(true){
            System.out.println("Menu Data ArrayList:");
            System.out.println("1. Tambah Data");
            System.out.println("2. Cari Data");
            System.out.println("3. Hapus Data");
            System.out.println("4. Tampil Data");
            System.out.println("5. Keluar");
            System.out.print("Pilih nomor berapa: ");
            
            int pilihan = input.nextInt();
            switch(pilihan){
                case 1:
                    System.out.print("Silahkan masukan data string: ");
                    input.nextLine();
                    this.dataBil.add(input.nextLine());
                    System.out.println("Daftar string dalam array list:" + this.dataBil + "n");
                    break;
                    
                case 2:
                    System.out.print("Silahkan String yang mau dicari: ");
                    input.nextLine();
                    String mencari = input.nextLine();
                    int index = this.dataBil.indexOf(mencari);
                    if(index >= 0){
                        System.out.println("String '" + mencari + "' ada di index ke" + index + " di dalam data");
                    } else{
                        System.out.println("String '" + mencari + "' tidak ada dalam data");
                    }
                    break;
                    
                case 3:
                    System.out.print("Silahkan String yang mau dihapus: ");
                    input.nextLine();
                    String menghapus = input.nextLine();
                    int remove = this.dataBil.indexOf(menghapus);
                    if(remove >= 0){
                        this.dataBil.remove(remove);
                        System.out.println("String '" + menghapus + "' sudah dihapus di dalam data");
                    } else{
                        System.out.println("String '" + menghapus + "' tidak ada dalam data");
                    }
                    System.out.println("Daftar string dalam array list: " + this.dataBil + "\n");
                    break;
                    
                case 4:
                    System.out.println("Daftar string dalam array list: " + this.dataBil + "\n");
                    break;
                
                case 5:
                    System.out.println("Program Selesai");
                    System.exit(0);
                    break;
                
                default:
                    System.out.println("\nPilihan tidak tersedia");
            }
        }
    }
}
