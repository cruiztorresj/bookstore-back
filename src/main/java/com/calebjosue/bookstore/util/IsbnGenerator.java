/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.calebjosue.bookstore.util;

import java.util.Random;

/**
 *
 * @author calebjosue
 */
public class IsbnGenerator implements NumberGenerator {

    @Override
    public String generateNumber() {
        
        return "13-5677-" + Math.abs(new Random().nextInt());
        
    }
}