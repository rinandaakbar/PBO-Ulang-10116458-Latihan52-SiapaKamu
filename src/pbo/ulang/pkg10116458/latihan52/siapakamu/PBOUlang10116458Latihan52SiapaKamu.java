/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo.ulang.pkg10116458.latihan52.siapakamu;

/**
 *
 * @author 
 * NAMA     : Rinanda Al Qorrie Akbar
 * NIM      : 10116458
 */
public class PBOUlang10116458Latihan52SiapaKamu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Dosen dsn = new Dosen ();
        Mahasiswa mhs = new Mahasiswa ();
        
        System.out.println("NIP DOSEN : 41227829930");
        dsn.siapaKamu();
        dsn.mengajarApa();
        
        System.out.println("\n"+"NIM MAHASISWA : 10116458");
        mhs.siapaKamu();
        mhs.kelasApa();
    }
    
}
