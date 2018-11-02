package com.vk.plc;

/**
 * Created by KIP-PC99 on 31.10.2018.
 */
public class Child extends test {

    float y = 8.7F;

    @Override
    public String drow(int x) {
        return "child int -->"+x+" float "+y;
    }
}
