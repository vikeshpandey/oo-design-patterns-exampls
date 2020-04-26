package io.github.vikeshpandey.strategy.impl;

import io.github.vikeshpandey.strategy.OperatingStrategy;

public class CarOperatingStrategyImpl implements OperatingStrategy {
    @Override
    public void operate() {
        System.out.println("Land vehicle is steered now");
    }
}
