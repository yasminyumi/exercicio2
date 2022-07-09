package atividade1;

public class ímpar {
    public static void main(String[] args) {

        int num, soma = 0;
        long par = 1;

        for (num = 0; num <= 30; num ++) {

            if (num % 2 == 1) {
                soma += num;

            } else {
                if (num > 0)
                    par *= num;

            }

        }

    System.out.println("Soma dos números impares: " + soma);
    System.out.println("A multiplicação dos números pares : " + par);

   }
    
}
