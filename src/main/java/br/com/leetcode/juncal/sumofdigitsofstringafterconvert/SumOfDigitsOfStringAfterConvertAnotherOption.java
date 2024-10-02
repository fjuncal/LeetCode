package main.java.br.com.leetcode.juncal.sumofdigitsofstringafterconvert;

public class SumOfDigitsOfStringAfterConvertAnotherOption {

    public static void main(String[] args) {
        System.out.println(getLucky("iiii", 1));
    }

    public static int getLucky(String s, int k) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            sb.append(c - 96);
        }
        int resultado = 0;
        String result = sb.toString();
        do {
            resultado = 0;
            for (char c : result.toCharArray()) {
                resultado += c - '0';
            }
            result = String.valueOf(resultado);
        } while (--k > 0);
        return resultado;
    }
}
