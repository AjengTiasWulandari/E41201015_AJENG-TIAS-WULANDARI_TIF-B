/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statementdowhile;

/**
 *
 * @ajengtiaswulandari
 */
public class StatementDoWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // membuat variabel
        int i = 0;
        
        do {
            System.out.println("perulangan ke-" + i);
            i++;
        } while ( i <= 10);
    }
    
}
