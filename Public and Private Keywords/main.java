package com.program;

class Player {
    String name; // default, dia dapat dibaca dan ditulis dari luar class
    public int exp; // default, dapat dibaca dan ditulis dari luar class
    private int health; // private, hanya dapat dibaca dan ditulis di dalam classnya saja

    Player(String name, int exp, int health) {
        this.name = name;
        this.exp = exp;
        this.health = health;
    }

    void display() {
        System.out.println("\nName\t:" + this.name);
        System.out.println("exp\t:" + this.exp);
        System.out.println("health\t:" + this.health);

        // contoh mengakses private method
        AddEXP();
    }

    public void SetName(String NewName) {
        this.name = NewName;
    }

    private void AddEXP() {
        this.exp += 100;
    }
}

public class main {

    public static void main(String[] args) {
        Player player1 = new Player("Metta", 0, 100);

        // default
        System.out.println(player1.name); // membaca (read) data
        player1.name = "Martin"; // menulis (write) data
        System.out.println(player1.name); // membaca (read data)

        // public
        System.out.println(player1.exp);
        player1.exp = 100;
        System.out.println(player1.exp);

        // private
        /*
         * System.out.println(player1.health);
         * player1.health = 200;
         * System.out.println(player1.health); //gabisa dipake, karena ini private, jadi
         * muncul error kalau mereka tidak visible
         */

        // default
        player1.display();

        // public
        player1.SetName("bejo");
        player1.display();

    }

}