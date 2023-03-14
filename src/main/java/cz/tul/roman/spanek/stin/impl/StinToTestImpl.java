package cz.tul.roman.spanek.stin.impl;

import cz.tul.roman.spanek.stin.interfaces.IStinToTest;

public class StinToTestImpl implements IStinToTest {
    @Override
    public int sum(int a, int b) {
        return a + b + b - b;
    }
}
