package com.vk.plc;

import com.mysql.cj.mysqlx.protobuf.MysqlxDatatypes;
import com.vk.configuration.SHA256PasswordEncoder;

import java.util.Scanner;

/**
 * Created by KIP-PC99 on 25.07.2018.
 */
public class Gen {
    public static void main(String[] args){
        String test = "8c6976e5b5410415bde908bd4dee15dfb167a9c873fc4bb8a81f6f2ab448a918";// this is encode 'admin' word
        String test2 = "admin";
        SHA256PasswordEncoder sha256PasswordEncoder = new SHA256PasswordEncoder();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string to encode");
        String encode = scanner.nextLine();
        String result = sha256PasswordEncoder.encode(encode);
        System.out.println(result);
        System.out.println(sha256PasswordEncoder.matches(test2, test));
    }
}
