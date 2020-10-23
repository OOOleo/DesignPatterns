package com.leo.factory;

public class MagicFactory extends AbstractFactory {
    Vehicle createVehicle() {
        return new Broom();
    }

    Weapon createWeapon() {
        return new MagicStick();
    }

    Food createFood() {
        return new Mushroom();
    }
}
