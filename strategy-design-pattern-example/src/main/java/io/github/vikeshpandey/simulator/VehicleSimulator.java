package io.github.vikeshpandey.simulator;

import io.github.vikeshpandey.strategy.OperatingStrategy;

public abstract class VehicleSimulator {

    private OperatingStrategy operatingStrategy;

    public VehicleSimulator(OperatingStrategy operatingStrategy) {
        this.operatingStrategy = operatingStrategy;
    }

    public void startEngine(){
        System.out.println("Engine started");
    }
    public void stopEngine(){
        System.out.println("Engine stopped");
    }

    public OperatingStrategy getOperatingStrategy() {
        return operatingStrategy;
    }

    public void setOperatingStrategy(OperatingStrategy operatingStrategy) {
        this.operatingStrategy = operatingStrategy;
    }
}
