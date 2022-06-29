package com.uncompresstext;

/*
Escriba un metodo uncompressText(text) que devuelva la versión
descomprimida de un texto de la forma "a3bc4", donde 'a' sería uno de los
caracteres comprimidos y el número a su derecha la cantidad de veces que se
repite. En el caso de aparecer una sola vez, el texto no debería tener un 1 a
su derecha, sino el caracter solo. La versión descomprimida del ejemplo anterior
sería: "aaabcccc".
*/
public class Main {
    public static void main(String[] args) {
        System.out.println("Resultado obtenido:");
        try {
            System.out.println(StringUtils.uncompressText("a"));
            System.out.println("Resultado esperado:");
            System.out.println("a");

            if (StringUtils.uncompressText("a").equals("a")) {
                System.out.println("OK!");
            } else {
                System.out.println("not OK!");
            }

            System.out.println("Resultado obtenido:");
            System.out.println(StringUtils.uncompressText("ab"));
            System.out.println("Resultado esperado:");
            System.out.println("ab");

            if (StringUtils.uncompressText("ab").equals("ab")) {
                System.out.println("OK!");
            } else {
                System.out.println("not OK!");
            }

            System.out.println("Resultado obtenido:");
            System.out.println(StringUtils.uncompressText("a3bc4"));
            System.out.println("Resultado esperado:");
            System.out.println("aaabcccc");

            if (StringUtils.uncompressText("a3bc4").equals("aaabcccc")) {
                System.out.println("OK!");
            } else {
                System.out.println("not OK!");
            }

            System.out.println("Resultado obtenido:");
            System.out.println(StringUtils.uncompressText("az5bj8"));
            System.out.println("Resultado esperado:");
            System.out.println("azzzzzbjjjjjjjj");

            if (StringUtils.uncompressText("az5bj8").equals("azzzzzbjjjjjjjj")) {
                System.out.println("OK!");
            } else {
                System.out.println("not OK!");
            }

            System.out.println("Resultado obtenido:");
            System.out.println(StringUtils.uncompressText("a15bc10"));
            System.out.println("Resultado esperado:");
            System.out.println("aaaaaaaaaaaaaaabcccccccccc");

            if (StringUtils.uncompressText("a15bc10").equals("aaaaaaaaaaaaaaabcccccccccc")) {
                System.out.println("OK!");
            } else {
                System.out.println("not OK!");
            }

            System.out.println("Resultado obtenido:");
            System.out.println(StringUtils.uncompressText("a20bc"));
            System.out.println("Resultado esperado:");
            System.out.println("aaaaaaaaaaaaaaaaaaaabc");

            if (StringUtils.uncompressText("a20bc").equals("aaaaaaaaaaaaaaaaaaaabc")) {
                System.out.println("OK!");
            } else {
                System.out.println("not OK!");
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
