package com.api.sgb.learnjava.controllers;

public class NumberConverter {

    public static Double convertToDouble(String srNumber) {
        if(srNumber == null) return 0D;
        String number = srNumber.replaceAll(",", ".");
        if(isNumeric(number)) return Double.parseDouble(number);
        return 0D;
    }

    public static boolean isNumeric(String srNumber) {
        if(srNumber == null) return false;
        String number = srNumber.replaceAll(",", ".");
        return number.matches("[-+]?[0-9]*\\.?[0-9]+");
    }
}
