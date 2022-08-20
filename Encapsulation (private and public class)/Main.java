in this 
package com.program;

class data {
    public int intPublic;
    private int intprivate;
    private double doubleprivate;

    public data() {
        this.intPublic = 0;
        this.intprivate = 0;
    }

    // membuat getter
    public int GetPrivateint() {
        return this.intprivate;
    }

    // membuat setter
    public void SetPrivateint(int number) {
        this.intprivate = number;
    }
}

class lingkaran {
    private double diameter;

    lingkaran(double diameter) {
        this.diameter = diameter;
    }

    // setter
    void setjari2(double jari2) {
        this.diameter = jari2 * 2;
    }

    // getter
    public double getjari2() {
        return diameter / 2;
    }

    public double getdia() {
        return diameter;
    }

    public double getluas() {
        return ((3.14 * (diameter * diameter)) / 4);
    }
}

public class main {

    public static void main(String[] args) {

        data Objek = new data();

        Objek.intPublic = 100;

        System.out.println(Objek.intPublic);

        // cara read atau membaca dari private class menggunakan getter
        System.out.println(Objek.GetPrivateint());
        int angka = Objek.GetPrivateint();
        System.out.println(angka);

        // cara write pada private class menggunakan setter
        Objek.SetPrivateint(12345);
        System.out.println(Objek.GetPrivateint());

        lingkaran Object = new lingkaran(10);
        System.out.println(Object.getdia());
        Object.setjari2(14);
        System.out.println(Object.getdia());
        System.out.println(Object.getluas());

    }
}
