package com.leo.factory;

public class Main {
    public static void main(String[] args) {
        AbstractFactory f = new ModernFactory();
        Vehicle v = f.createVehicle();
        v.go();
        Food b = f.createFood();
        b.printName();
        Weapon w = f.createWeapon();
        w.shoot();
    }
}
