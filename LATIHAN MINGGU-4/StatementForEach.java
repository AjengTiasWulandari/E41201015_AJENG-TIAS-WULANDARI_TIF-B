/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statementforeach;

/**
 *
 * @ajengtiaswulandari
 */
public class StatementForEach {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // membuat array
        int angka[] = {3,1,42,24,12};
        
        // menggunakan perulangan For each untuk menampilkan angka
        for( int x : angka){
            System.out.print(x + " ");
        }
    }
    
}
