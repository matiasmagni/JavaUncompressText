package com.uncompresstext;

public class StringUtils {
    public static String uncompressText(String text) throws Exception {
        String uncompressedText = "";
        char currChar = ' ', lastChar = ' ';
        int numero = 0;
        String numEnCadena = "";
        boolean wasDigit = false;
        if (Character.isDigit(text.charAt(0))) {
            throw new Exception("Formato de compresion invalido");
        } else {
            for (int i = 0; i < text.length(); i++) {
                currChar = text.charAt(i);
                if (Character.isDigit(currChar)) {
                    numEnCadena += currChar;
                    wasDigit = true;

                    //Verificamos si es el ultimo caracter
                    if (i == text.length() - 1) {
                        for (int j = 1; j <= Integer.parseInt(numEnCadena) - 1; j++) {
                            uncompressedText += lastChar;
                        }
                    }

                } else {
                    if (wasDigit) {
                        for (int j = 1; j <= Integer.parseInt(numEnCadena) - 1; j++) {
                            uncompressedText += lastChar;
                        }
                        numEnCadena = "";
                    }
                    uncompressedText += currChar;
                    wasDigit = false;
                    lastChar = currChar;
                }
            }
        }
        return uncompressedText;
    }
}
