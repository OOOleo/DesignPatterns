package com.leo.factory;

public class ModernFactory extends AbstractFactory {

    Vehicle createVehicle() {
        return new Car();
    }

    Weapon createWeapon() {
        return new AK47();
    }

    Food createFood() {
        return new Bread();
    }
}
