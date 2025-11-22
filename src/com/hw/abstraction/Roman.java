package com.hw.abstraction;


import java.util.HashMap;
import java.util.LinkedHashMap;

public class Roman {
    public static String intToRoman(int value) {

        int remain=value;
        String ans="";
        LinkedHashMap<String,Integer> map = new LinkedHashMap<>();

        map.put("M", 1000);
        map.put("CM", 900);
        map.put("D", 500);
        map.put("CD", 400);
        map.put("C", 100);
        map.put("XC", 90);
        map.put("L", 50);
        map.put("XL", 40);
        map.put("X", 10);
        map.put("IX", 9);
        map.put("V", 5);
        map.put("IV", 4);
        map.put("I", 1);


        while(remain>0){
            if(remain >= map.get("M")){
                remain -= map.get("M");
                ans += "M";
                continue;
            }

            if(remain >= map.get("CM")){
                remain -= map.get("CM");
                ans += "CM";
                continue;
            }

            if(remain >= map.get("D")){
                remain -= map.get("D");
                ans += "D";
                continue;
            }

            if(remain >= map.get("CD")){
                remain -= map.get("CD");
                ans += "CD";
                continue;
            }

            if(remain >= map.get("C")){
                remain -= map.get("C");
                ans += "C";
                continue;
            }

            if(remain >= map.get("XC")){
                remain -= map.get("XC");
                ans += "XC";
                continue;
            }

            if(remain >= map.get("L")){
                remain -= map.get("L");
                ans += "L";
                continue;
            }

            if(remain >= map.get("XL")){
                remain -= map.get("XL");
                ans += "XL";
                continue;
            }

            if(remain >= map.get("X")){
                remain -= map.get("X");
                ans += "X";
                continue;
            }

            if(remain >= map.get("IX")){
                remain -= map.get("IX");
                ans += "IX";
                continue;
            }

            if(remain >= map.get("V")){
                remain -= map.get("V");
                ans += "V";
                continue;
            }

            if(remain >= map.get("IV")){
                remain -= map.get("IV");
                ans += "IV";
                continue;
            }

            if(remain >= map.get("I")){
                remain -= map.get("I");
                ans += "I";
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        System.out.println(intToRoman(3));
        System.out.println(intToRoman(4));
        System.out.println(intToRoman(9));
        System.out.println(intToRoman(58));
        System.out.println(intToRoman(1994));
    }
}
