/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.PROG2.util;
import java.util.Random;

/**
 *
 * @author rieck
 */
public class MyIO {

    /**
     *
     * @param arg ausgabe des Strings "arg" in der Console.
     */
    public static void print(String arg){
        System.out.println(arg);
       
    }
    public static int random(int min,int max){
        Random rn = new Random();
        return rn.nextInt(max-min+1)+min;
    }

}