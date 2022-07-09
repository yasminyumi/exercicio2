package atividade2;

public class primo {
    public static void main(String[] args) {

        Integer num1, num2;

        for (num1 = 1; num1 <= 123; num1 ++){
            Boolean primo = true;

            for (num2 = 2; num2 < num1; num2++) {

            
                if (num1 % num2 == 0) {
                    primo = false;
                }
            }

            if (primo == true) {
                System.out.println("O número " + num1 + " é primo");
            }

            else if (primo == false) {
                System.out.println("O número " + num1 + " não é primo");
            }

        }

    }
    
}