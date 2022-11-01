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
public class Buss {
    public double penumpang;
    public double maxPenumpang;
    public double counter;
    public double penumpangBaru;

    public Buss(double maxPenumpang) {
        this.maxPenumpang = maxPenumpang;
        penumpang = 0;
    }

    public void addPenumpang(double penumpang) {
        double temp;
        temp = this.penumpang + penumpang;
        if (temp > maxPenumpang) {
            System.out.println("Penumpang melebihi kuota");
        } else {
            this.penumpang = temp;
        }
    }

    public void getPenumpang(int password) {
        if (password == 28) {
            System.out.println("Password Benar");
        } else {
            System.out.println("Password Salah");
        }
    }

    public void getAverage(double average) {
        this.penumpangBaru = average;
        counter = penumpangBaru / penumpang;
    }

    public void cetakPenumpang() {
        System.out.println("Penumpang bus sekarang = " + penumpang);
        System.out.println("Maksimal penumpang yang seharusnya adalah = " + maxPenumpang);
        System.out.println("Berat rata-rata penumpang baru = " + counter);
    }
}
