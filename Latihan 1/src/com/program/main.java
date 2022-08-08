package com.program;
// idk some kind of game i guess

// player 
class Player {
    String name;
    double HP;
    double baseatt = 50;

    Weapon weapon;
    Armor armor;

    Player(String name, double Health) {
        this.name = name;
        this.HP = Health;
    };

    void EquipWeapon(Weapon weapon) {
        this.weapon = weapon;
        this.baseatt = this.baseatt + weapon.Attack;
    }

    void EquipArmor(Armor armor) {
        this.armor = armor;
        this.HP = this.HP + armor.Armor;
    }

    void display() {
        System.out.println("player name : " + this.name);
        System.out.println("player health : " + this.HP);
        System.out.println("player attack : " + this.baseatt);
        this.weapon.display();
        this.armor.display();
        System.out.println("\n");

    }

    void attack(Player oppponent) {
        System.out.println(this.name + " got attacked by " + oppponent.name);

        oppponent.defence((this.weapon.Attack + this.weapon.APen));
        this.HP = this.HP - (this.weapon.Attack + this.weapon.APen);

        if (this.HP < 0) {
            this.HP = 0;
            System.out.println("hp left : " + this.HP + "\n");
            System.out.println(this.name + " is dead");
        } else {
            System.out.println("hp left : " + this.HP + "\n");
        }
    }

    void defence(double attackpower) {
        System.out.println("got damage : " + attackpower);
    }
}

// Weapon
class Weapon {
    String nama;
    double Attack;
    double APen;

    Weapon(String nama, double Attack, double APen) {
        this.nama = nama;
        this.Attack = Attack;
        this.APen = APen;
    }

    void display() {
        System.out.println(
                "weapon : " + this.nama + "\n" + "attack : " + this.Attack + "\n" + "armor penetration : " + APen);
    }

}

class Armor {
    String name;
    double Armor;

    Armor(String name, double armor) {
        this.name = name;
        this.Armor = armor;
    }

    void display() {
        System.out.println("armor : " + this.name + "\n" + "armor : " + this.Armor);
    }
}

public class main {

    public static void main(String[] args) {

        // initiate the player
        Player player1 = new Player("Simon", 100);
        Player player2 = new Player("Metta", 90);
        // make some weapon
        Weapon sword = new Weapon("Sword", 50, 10);
        Weapon pistol = new Weapon("pistol", 70, 25);

        // get some armor
        Armor chestplate = new Armor("chestplate", 25);
        Armor tanktop = new Armor("tanktop", 50);

        player1.EquipArmor(chestplate);
        player1.EquipWeapon(sword);
        player1.display();

        player2.EquipArmor(tanktop);
        player2.EquipWeapon(pistol);
        player2.display();

        // pertempuran

        System.out.println("battle phase begins !!!");
        player1.attack(player2);
        player1.attack(player2);
        player1.attack(player2);

    }

}
