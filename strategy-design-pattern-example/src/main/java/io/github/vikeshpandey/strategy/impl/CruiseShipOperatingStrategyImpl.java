package io.github.vikeshpandey.strategy.impl;

import io.github.vikeshpandey.strategy.OperatingStrategy;

public class CruiseShipOperatingStrategyImpl implements OperatingStrategy {
    @Override
    public void operate() {
        System.out.println("Cruise ship is sailing now");
    }
}
