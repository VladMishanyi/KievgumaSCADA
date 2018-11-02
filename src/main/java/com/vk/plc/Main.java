package com.vk.plc;


/**
 * Created by User on 2018-04-13.
 */
public class Main {
    public static void main(String[] args){

        test variable = new test();
        test variable2 = new Child();
        System.out.println(variable.drow(5));
        System.out.println(variable2.drow(5));

    }
}
