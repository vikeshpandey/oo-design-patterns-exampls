package io.github.vikeshpandey;

import io.github.vikeshpandey.simulator.VehicleSimulator;
import io.github.vikeshpandey.simulator.impl.CarSimulator;
import io.github.vikeshpandey.simulator.impl.CruiseShipSimulatorImpl;
import io.github.vikeshpandey.simulator.impl.AirPlaneSimulatorImpl;
import io.github.vikeshpandey.strategy.impl.AirPlaneOperatingStrategyImpl;
import io.github.vikeshpandey.strategy.impl.CruiseShipOperatingStrategyImpl;
import io.github.vikeshpandey.strategy.impl.CarOperatingStrategyImpl;

public class Main {
    public static void main(String[] args) {
        VehicleSimulator[] simulators = {
                new CarSimulator(new CarOperatingStrategyImpl()),
                new AirPlaneSimulatorImpl(new AirPlaneOperatingStrategyImpl()),
                new CruiseShipSimulatorImpl(new CruiseShipOperatingStrategyImpl())
        };

        for (VehicleSimulator simulator : simulators){
            simulator.getOperatingStrategy().operate();
        }
    }
}
