package ru.sky.pro;

public class Bicycle extends Vehicle implements toUpdateTyre {
    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }
}
