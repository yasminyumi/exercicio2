package atividade5;

import java.util.Scanner;

public class libras {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        Double libra, quilo, conv;
        String caracter;

        System.out.println("Se sua conversão for de quilo para libra digite q, caso contrário digite l, por gentileza. ");
        caracter = ler.nextLine();

        if (caracter.equalsIgnoreCase("q")) {
            System.out.println("Digite o valor que deseja converter de quilo para libra: ");
            quilo = ler.nextDouble();

            conv = quilo / 0.4536;

            System.out.println("O valor convertido de quilo em libra é de: " + conv);

        }

        else if (caracter.equalsIgnoreCase("l")) {
            System.out.println("Digite o valor que deseja converter de libra para quilo: ");
            libra = ler.nextDouble();

            conv = libra * 0.4536;

            System.out.println("O valor convertido de libra em quilo é de: " + conv);

        }

        else {

            System.out.println("Digite somente a letra q ou então l, por gentileza");

        }

    }
    
}
