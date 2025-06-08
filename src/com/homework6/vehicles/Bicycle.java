package com.homework6.vehicles;

public class Bicycle implements Vehicle {
    private String modelName;
    private int wheelsCount;

    public Bicycle(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    @Override
    public String getModelName() {
        return modelName;
    }

    @Override
    public int getWheelsCount() {
        return wheelsCount;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public void setWheelsCount(int wheelsCount) {
        this.wheelsCount = wheelsCount;
    }
}