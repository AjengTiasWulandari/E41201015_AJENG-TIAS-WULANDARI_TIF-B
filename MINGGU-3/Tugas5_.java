/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas5_;

import java.util.Scanner;
/**
 *
 * @ajengtiaswulandari
 */
public class Tugas5_ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String menu;
        String jawab;
        String salah;
        String name;
        
        Scanner all = new Scanner (System.in);
        
        System.out.println("                  CAFE CERIA                ");
        System.out.println("                ANEKA MINUMAN               ");
        System.out.println("--------------------------------------------");
        System.out.println("                SPECIAL MENU :              ");
        System.out.println("                1. Soft drinks              ");
        System.out.println("                2. Mix juice                ");
        System.out.println("                3. Nescafe                  ");
        System.out.println("                4. Soda milk                ");
        System.out.println("                5. Tea                      ");
        System.out.print("Masukkan nama pembeli : ");
        name = all.nextLine();
        System.out.println("");
        
        System.out.print("Silahkan masukkan pilihan anda : ");
        menu = all.nextLine();
        switch (menu){
            case "1":
                System.out.println("Minuman yang anda pesan adalah Soft drinks");
                System.out.println("Pesanan akan segera kami antar");
                System.out.println("Terima kasih " + name + " telah berkunjung di Cafe Ceria");
                break;
            case "2":
                System.out.println("Minuman yang anda pesan adalah Mix juice");
                System.out.println("Pesanan akan segera kami antar");
                System.out.println("Terima kasih " + name + " telah berkunjung di Cafe Ceria");
                break;
            case "3":
                System.out.println("Minuman yang anda pesan adalah Nescafe");
                System.out.println("Pesanan akan segera kami antar");
                System.out.println("Terima kasih " + name + " telah berkunjung di Cafe Ceria");
                break;
            case "4":
                System.out.println("Minuman yang anda pesan adalah Soda milk");
                System.out.println("Pesanan akan segera kami antar");
                System.out.println("Terima kasih " + name + " telah berkunjung di Cafe Ceria");
                break;
            case "5":
                System.out.println("Minuman yang anda pesan adalah Tea");
                System.out.println("Pesanan akan segera kami antar");
                System.out.println("Terima kasih " + name + " Betelah berkunjung di Cafe Ceria");
                break;
            default:
                System.out.println("Silahkan anda memilih pilihan yang telah tersedia di daftar menu kami");
        }
    }
    
}
