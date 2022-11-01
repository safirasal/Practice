/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buss;

/**
 *
 * @author sfrsl
 */
public class UjiBus2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Buss Bus = new Buss (5);
        Bus.getPenumpang(17);
        Bus.getPenumpang(28);
        Bus.cetakPenumpang();
        //penambahan penumpang
        Bus.addPenumpang(2);
        Bus.getAverage(60);
        Bus.cetakPenumpang();
        //penambahan penumpang
        Bus.addPenumpang(1);
        Bus.getAverage(45);
        Bus.cetakPenumpang();
        //penambahan penumpang
        Bus.addPenumpang(2);
        Bus.getAverage(56);
        Bus.cetakPenumpang();
        //penambahan penumpang
        Bus.addPenumpang(2);
        Bus.getAverage(49);
        Bus.cetakPenumpang();
    }
    
}
