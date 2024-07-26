package main.java.br.com.leetcode.juncal.romantointeger;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class RomanToInteger {

    public static void main(String[] args) {
        System.out.println(romanToInt("III"));
        System.out.println(romanToInt("LVIII"));
        System.out.println(romanToInt("MCMXCIV"));
    }

    public static int romanToInt(String s) {
        int valor = 0;
        int numeroAnterior = 0;

        for (int i = 0; i < s.length(); i++) {
            int numero = 0;

            switch(s.charAt(i)) {
                case 'I': numero = 1; break;
                case 'V': numero = 5; break;
                case 'X': numero = 10; break;
                case 'L': numero = 50; break;
                case 'C': numero = 100; break;
                case 'D': numero = 500; break;
                case 'M': numero = 1000; break;
            }

            if(i > 0 && numeroAnterior < numero) {
                valor -= numeroAnterior * 2;
            }

            valor += numero;
            numeroAnterior = numero;
        }

        return valor;
    }

    public static int romanToIntAnotherOpt(String s) {
        char[] charArray = s.toCharArray();
        Map<String, Integer> romanNumeralsMap = new HashMap<>();
        romanNumeralsMap.put("I", 1);
        romanNumeralsMap.put("IV", 4);
        romanNumeralsMap.put("V", 5);
        romanNumeralsMap.put("IX", 9);
        romanNumeralsMap.put("X", 10);
        romanNumeralsMap.put("XL", 40);
        romanNumeralsMap.put("L", 50);
        romanNumeralsMap.put("XC", 90);
        romanNumeralsMap.put("C", 100);
        romanNumeralsMap.put("CD", 400);
        romanNumeralsMap.put("D", 500);
        romanNumeralsMap.put("CM", 900);
        romanNumeralsMap.put("M", 1000);

        Set<String> keySet = romanNumeralsMap.keySet();
        int counter = 0;
        int result = 0;
        while (charArray[charArray.length - 1] != 0){
            if (charArray[counter] == 0){
                counter++;
                continue;
            }
            if (!(charArray.length - counter == 1)){
                String stringConcatenada = String.valueOf(Character.valueOf(charArray[counter])).concat(String.valueOf(Character.valueOf(charArray[counter + 1])));
                if (keySet.contains(stringConcatenada)){
                    Integer valorConcatenado = romanNumeralsMap.get(stringConcatenada);
                    result += valorConcatenado;
                    charArray[counter] = 0;
                    charArray[counter + 1] = 0;
                }
                else {
                    Integer primeiroValor = romanNumeralsMap.get(String.valueOf(charArray[counter]));
                    result += primeiroValor;
                    charArray[counter] = 0;
                }
            } else {
                Integer primeiroValor = romanNumeralsMap.get(String.valueOf(charArray[counter]));
                result += primeiroValor;
                charArray[counter] = 0;
            }
            counter++;
        }
        return result;
    }
}
