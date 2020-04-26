package io.github.vikeshpandey.simulator.impl;

import io.github.vikeshpandey.simulator.VehicleSimulator;
import io.github.vikeshpandey.strategy.OperatingStrategy;

public class CarSimulator extends VehicleSimulator {

    public CarSimulator(OperatingStrategy operatingStrategy){
        super(operatingStrategy);
    }
}
