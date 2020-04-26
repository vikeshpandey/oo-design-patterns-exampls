package io.github.vikeshpandey.strategy.impl;

import io.github.vikeshpandey.strategy.OperatingStrategy;

public class AirPlaneOperatingStrategyImpl implements OperatingStrategy {
    @Override
    public void operate() {
        System.out.println("Airplane is flying now");
    }
}
